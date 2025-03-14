package com.company.java018;

import java.io.File;

public class Repeat003 {

	public static void main(String[] args) {
		//  경로
		String folder_rel="src/com/company/java018/";
		String file_rel="javaIO002.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel+file_rel);
		
		// 폴더와 파일 만들기
		try {
		if( !folder.exists() ) {folder.mkdir();}
		if( !file.exists() ) {file.createNewFile();}
		System.out.println("폴더/파일 준비완료");
		}catch(Exception e) {e.printStackTrace();}
	}

}
