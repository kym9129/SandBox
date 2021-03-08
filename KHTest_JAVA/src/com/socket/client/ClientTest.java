package com.socket.client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientTest {
	
	public void fileUpload() {
		int port = 3000;
		String serverIP = "192.168.20.34";
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			//2. 소캣객체 생성 : 생성과 동시에 서버에 연결 요청됨
			Socket socket = new Socket(serverIP, port);
			//연결 실패는 null리턴됨
			
			
			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
