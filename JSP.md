1. **WEB**
   - TCP/IP 기반으로 연결되어 잇는 컴퓨터네트워크
   - 클라이언트 ↔ 서버
     1)  Web    프로그래밍 (Http 통신)      단방향통신 
       > ( Client요청시 Server응답 후종료)
     2)  Socket 프로그래밍 (채팅)           양방향통신 
       > ( 특정port를 통해 실시간으로 정보를 주고 받음 - 계속연결되어 있음)
2. **WS** vs **WAS**
   - WS (Web Server) : 정적컨텐츠 (html,css,js) 웹브라우저에 제공
        > 예) Apache
   - WAS (Web Application Server) : 동적컨텐츠
        - 브라우저와 dbms사이에서 동작하는 미들웨어
        > 예) Apache + tomcat
3. TomCat
   - Http request(요청) → Catalina(해결사) → context → Servelt → response
   3-1) Http request
     3-2) Coyte가 goruftkckwl: http요청을 처리할 웹어플리케이션(context)
     > web.xml 파일내용을 참고해서 요청전달.
   3-3) Catalina (Servlet) : 해결사
   3-4 Jasper (jsp Engine) : java + html 페이지 요청처리 응담(response)
