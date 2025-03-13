package com.company.java018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
		// BufferedWriter(속도 향상) - OutputStreamWriter(단어) - FileOutputStream(byte) 
		try {
			BufferedWriter bw=
					new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			bw.write("1,white,1200\n");
			bw.write("2,choco,1500\n");
			bw.write("3,banana,1800\n");
			bw.flush();
			bw.close();
			System.out.println("쓰기완료");
			
		} catch (Exception e) { e.printStackTrace(); }

		
		//#4. 파일읽기(byte)
		//BufferedReader(속도 향상) - InputStreamReader(단어) -FileInputSream(byte)
		try {
			BufferedReader br = 
			new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			
			String line="";
			StringBuffer sb = new StringBuffer();
			while( (line=br.readLine())!=null ) {
				sb.append(line+"\n");
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}//e

}//e
