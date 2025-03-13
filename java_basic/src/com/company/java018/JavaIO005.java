package com.company.java018;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaIO005 {

	public static void main(String[] args) {
		//#1. 경로
		String folder_rel = "src/com/company/java018/";
		String file_rel = "file005.txt";
		
		File folder = new File(folder_rel);
		File   file = new File(folder_rel+file_rel);
		
		//#2. 폴더+파일만들기
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
		}catch(Exception e) {e.printStackTrace();}
		//#3. 파일쓰기(byte)
		OutputStream output = new FileOutputStream();
		// BufferedWriter(속도 향상) - OutputStreamWriter(단어) - FileOutputStream(byte) 
		
		
		//#4. 파일읽기(byte)
		InputStream input = new FileInputStream();
		
		
		
		
		

	}//e

}//e
