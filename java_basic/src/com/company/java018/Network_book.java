package com.company.java018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Network_book {

	public static void main(String[] args) {
		try {
		// 1. URL 객체 생성
		String apiurl = "https://openapi.naver.com/v1/search/book.json?query="
				+ URLEncoder.encode("블레이저","UTF-8");
		URL url = new URL(apiurl);
		
		// 2. HttpURLConnection
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("X-Naver-Client-Id", "AhK1f8tB2cuIy4qJWe4E");
		conn.setRequestProperty("X-Naver-Client-Secret", "J79isP3GZn");
		
		// 4. 응답확인 - 200
		// System.out.println(conn.getResponseCode()); 200 나옴
		int code = conn.getResponseCode();
		BufferedReader br;
		if(code == 200) {br = new BufferedReader( new InputStreamReader(conn.getInputStream()));}
		else {br= new BufferedReader(new InputStreamReader(conn.getErrorStream()));}
		
		// 5. 응답데이터 - xml/json/csv
		String line = ""; StringBuffer sb = new StringBuffer();
		while((line=br.readLine())!=null) { sb.append(line+"\n");}
		System.out.println(sb.toString());
		br.close(); conn.disconnect();
		
		
		}catch(Exception e) {e.printStackTrace();}
		
		
		
	}//end

}//end
