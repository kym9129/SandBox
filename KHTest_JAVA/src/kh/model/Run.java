package kh.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import kh.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		new Run().fileSave("Book.sat");

	}
	
	public void fileSave(String fileName) {
		
		
//		- 전달받은 fileName 으로 파일 객체를 생성한다.
		File f = new File(fileName);

//		- Book 객체 샘플 : "자바를 정복하자", 35000
		Book b = new Book("자바를 정복하자", 35000);
		
		FileWriter fr = null;
		ObjectOutputStream oos = null;
		
		try {
//		- 파일 객체와 연결하는 파일 출력스트림을 생성한다.
			fr = new FileWriter(f);
	
			
//		- 파일에 Book 객체를 기록할 수 있는 객체 출력스트림을 추가한다.
//			oos = new ObjectOutputStream(new OutputStreamWriter(fr));
//			oos = new ObjectOutputStream(new OutputStreamWriter(new FileWriter(f)))
			
//		- 파일에 Book 객체 정보를 기록하고 스트림들을 닫는다.
			oos.writeObject(b);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			oos.close();
		}
	}
//
//
//

}
