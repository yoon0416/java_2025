package com.company.java018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetWork001 {

    public static void main(String[] args) {
        try {
            // 1. URL 객체 생성
            URL url = new URL("https://www.naver.com/");
            
            // 2. HttpURLConnection 객체 생성
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            // 3. 요청 설정
            conn.setRequestMethod("GET");  // GET 요청 (필수)
            conn.setDoInput(true);         // 입력 스트림 사용 (필수)
            conn.setReadTimeout(1000);     // 1초 동안 응답이 없으면 타임아웃
            // conn.setDoOutput(true);      // 불필요 (POST 요청이 아닐 경우)

            // 4. 응답 코드 확인
            int code = conn.getResponseCode();
            BufferedReader br;

            // 5. 응답 데이터 읽기
            if (code == 200) { // 정상 응답
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else { // 오류 응답
                br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            // 모든 데이터를 다 읽은 후 출력
            System.out.println(sb.toString());

            // 리소스 정리
            br.close();
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
