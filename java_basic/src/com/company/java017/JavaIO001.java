package com.company.java017;

import java.io.File;
import java.io.IOException;

public class JavaIO001 {

    public static void main(String[] args) {
        // 폴더 및 파일 경로 설정 (절대 경로 사용)
        String folder_rel = "src/com/company/java017/";  // 폴더 경로
        String file_rel = "file001.txt";  // 파일 이름

        File folder = new File(folder_rel);
//        File file   = new File("src/com/company/java017/file001.txt");  // 안전한 파일 경로 지정
        File file   = new File(folder_rel+file_rel); 
        try {
            if (!folder.exists()) {
                folder.mkdir();  // 중간 폴더까지 생성
                System.out.println("폴더 생성 완료: " + folder.getAbsolutePath());
            }
            if (!file.exists()) {
                file.createNewFile();  // 파일 생성
                System.out.println("파일 생성 완료: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 실행 디렉토리 출력
        System.out.println("현재 실행 디렉토리: " + new File("").getAbsolutePath());
    }
}
