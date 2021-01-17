package bingogame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * https://youtu.be/WouRfnnVZJ0
 * 코딩강사 유튜브 채널을 참고하여 만들었습니다.
 * 강의에선 static 클래스와 변수를 사용하여 한 클래스에서 처리하지만, 
 * 저는 static을 남발하지 않는 연습을 하고싶어서 클래스를 분리했습니다.
 */

public class BingoGame extends JFrame implements ActionListener {

	JPanel panelNorth; // Top View
	JPanel panelCenter; // Game View
	JLabel labelMessage;
	JButton[] buttons = new JButton[16]; // 4*4 btn
	String[] images = { // 같은 카드 2개 한쌍
			"fruit01.png", "fruit02.png", "fruit03.png", "fruit04.png", 
			"fruit05.png", "fruit06.png", "fruit07.png", "fruit08.png", 
			"fruit01.png", "fruit02.png", "fruit03.png", "fruit04.png", 
			"fruit05.png", "fruit06.png", "fruit07.png", "fruit08.png" };

	int openCount = 0; // 카드를 뒤집은 카운트 0, 1, 2
	int buttonIndexSave1 = 0; // 처음 뒤집은 카드의 인덱스 : 0 ~ 15
	int buttonIndexSave2 = 0; // 두번째 뒤집은 카드의 인덱스 : 0 ~ 15
	Timer timer;
	int tryCount = 0; // 몇번 시도했는지
	int successCount = 0; // Bingo Count : 0 ~ 8

	public BingoGame(String title) {
		super(title);
		this.setLayout(new BorderLayout());
		this.setSize(400, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		initUI(this); // Screen UI initialize
		mixCard(); // 과일카드 섞기

		this.pack(); // 가장자리 등의 빈자리 채우는 기능

	}
	
	private void playSound(String fileName) {
		File file = new File("./sound/" + fileName);
		if(file.exists()) {
			try {
				AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				Clip clip = AudioSystem.getClip();
				clip.open(stream);
				clip.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("File Not Found!");
		}
	}

	private void mixCard() {
		Random rnd = new Random();
		//섞기 1000번 반복
		for(int i = 0; i < 1000; i++) {
			int rndIdx = rnd.nextInt(15) + 1; // 1~15 중 난수 발생
			//swap (0번째 카드 <-> 1~15번째 중 임의의 카드)
			String temp = images[0]; //0번째 카드를 받는 임시 참조변수
			images[0] = images[rndIdx]; //0번째 카드를 다른 카드로 섞음
			images[rndIdx] = temp; //n번째 카드를 0번째 카드로 교체
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		playSound("flip.wav");
		
		if(openCount == 2)//카드가 2개 열렸다면 
			return; //더이상 카드가 열리지 않도록 리턴

		JButton btn = (JButton) e.getSource(); // 이벤트가 발생한 object를 리턴
		int index = getButtonIndex(btn); // 몇번 인덱스의 버튼이 눌렸는지 판단
//		System.out.println("Button Index : " + index);
		btn.setIcon(changeImage(images[index])); // 클릭한 버튼의 이미지 변경

		openCount++;
		if(openCount == 1) { //카드를 하나 뒤집었다면
			buttonIndexSave1 = index;
		}
		else if(openCount == 2) { //카드를 2개 뒤집었다면
			buttonIndexSave2 = index;
			tryCount++;
			labelMessage.setText("Find same fruits! " + "Try : " + tryCount);
			
			//판정
			boolean isBingo = checkCard(buttonIndexSave1, buttonIndexSave2);
			if(isBingo == true) {
				playSound("bingo.wav");
				openCount = 0; //뒤집은 카드 횟수 초기화
				successCount++;
				if(successCount == 8) {
					labelMessage.setText("Game Clear! " + "Try : " + tryCount);
				}
				
			}else {
				backToQuestion(); //뒤집은 카드 돌려놓기
			}
			
		}
	
	}
	
	private void backToQuestion() {
		//클릭하고 1초 후에 뒤집은 카드 돌려놓기
		timer = new Timer(1000, new ActionListener() {//익명클래스

			//timer도 이벤트이기 때문에 액션리스너 적용 가능
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Timer. ");
				
				playSound("fail.wav");
				openCount = 0;
				buttons[buttonIndexSave1].setIcon(changeImage("question.png"));
				buttons[buttonIndexSave2].setIcon(changeImage("question.png"));
				timer.stop(); //반복적으로 돌지 않도록 타이머를 중지
			}
		}); //익명클래스 닫기
		timer.start();
		
	}

	public boolean checkCard(int idx1, int idx2) {
		if(idx1 == idx2) { //같은 카드 2번 눌렀으면
			return false; //빙고아님
		}
		
		//카드의 파일명이 같으면
		if(images[idx1].equals(images[idx2])) {
			return true; //빙고
		}else {
			return false;
		}
		
	}

	public int getButtonIndex(JButton btn) {
		int index = 0;
		for (int i = 0; i < buttons.length; i++) {
			if (buttons[i] == btn) { // 클릭한 버튼이 포문으로 탐색한 버튼과 같은지
				index = i;
			}
		}

		return index;
	}

	public void initUI(BingoGame myFrame) {
		// north
		panelNorth = new JPanel();
		panelNorth.setPreferredSize(new Dimension(400, 100));
		panelNorth.setBackground(new Color(55, 113, 161));
		labelMessage = new JLabel("Find same fruits! " + "Try : 0");
		labelMessage.setPreferredSize(new Dimension(400, 100));
		labelMessage.setForeground(Color.WHITE); // 글자색 변경
		labelMessage.setFont(new Font("NanumGothic", Font.BOLD, 20));
		labelMessage.setHorizontalAlignment(JLabel.CENTER); // 라벨 가운데정렬
		panelNorth.add(labelMessage);
		myFrame.add("North", panelNorth);

		// center
		panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(4, 4));
		panelCenter.setPreferredSize(new Dimension(400, 400));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setPreferredSize(new Dimension(100, 100));
			buttons[i].setIcon(changeImage("question.png"));
			buttons[i].addActionListener(myFrame);
			panelCenter.add(buttons[i]);
		}
		myFrame.add("Center", panelCenter);

	}

	public ImageIcon changeImage(String fileName) {
		ImageIcon icon = new ImageIcon("./img/" + fileName); // 현재폴더 : "./"
		Image originImage = icon.getImage();
		Image changedImage = originImage.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon icon_new = new ImageIcon(changedImage);
		return icon_new;
	}
}
