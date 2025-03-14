package com.company.java019;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Network002_Client {

	public static void main(String[] args) {
		//#실행2.
		Socket socket = null;
		
		try {
			//2. 고객이 통신사에 연락 - 
			
			socket = new Socket("127.0.0.1",7703); //ip, 포트번호
			System.out.println("[CLIENT]2. as 클라이언트에 고객문의");
			//4. 데이터주고 받기
			Thread sender = new Sender(socket); sender.start();
			Thread receiver = new Receiver(socket); receiver.start();
			
		} catch (UnknownHostException e) {  e.printStackTrace(); } 
		catch (IOException e) {  e.printStackTrace(); }

	}

}
