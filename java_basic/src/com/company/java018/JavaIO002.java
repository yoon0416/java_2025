package com.company.java018;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaIO002 {

	public static void main(String[] args) {
		//1. 경로준비
	      String folder_rel="src/com/company/java018/";
	      String   file_rel="file002.txt"; 
	      
	      File folder = new File(folder_rel);
	      File file = new File(folder_rel+file_rel);
	      
		//2. 폴더+ 파일만들기 
	      try {
	      if(!folder.exists()) {folder.mkdir();}
	      if(!file.exists()) {file.createNewFile();}
	      }
	      catch(Exception e) { e.printStackTrace(); }
	      
	      
		//3. byte 파일 쓰기 InputStream > 프로그램 > OutputStream [#]
	      try {
			OutputStream output = new FileOutputStream(file);
			output.write('j');
			output.write('a');
			output.write('v');
			output.write('a');
			output.flush();
			output.close();
			System.out.println("OutputStream 쓰기완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	      
	      
		//4. 파일읽기 InputStream [#] > 프로그램 > OutputStream 
		try {
			InputStream input = new FileInputStream(file);
//			System.out.println(input.read()); // 문자 - 저장시 숫자로 출력시 문자 //아스키코드
			int cnt = 0;
			
			while( (cnt=input.read()) != -1 ) { //-1 읽는 파일 끝
				System.out.println((char)cnt);
			}
			input.close();
			
		} catch (Exception e) { e.printStackTrace(); }

		
		
	}//end psvm

}//end class
