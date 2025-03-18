1. JSP
   1. JSP 기본요소
      - html+java
      1) 스크립트립 : `<%  %>` 자바코드
      2) 지시자 : `<%@  %>`
      3) 주석 : `<%- -%>`
      4) 표현식 : `<%= %>` 출력
      5) 선언 : `<%! %>` 선언
     
   2. FORM
      - 서버쪽으로 정보전달
      - action="요청처리" method="요청처리방식(get, post)"
      - name = "데이터보관이름"

   3.쿼리스트링
      > https://www.google.com/search?q=apple&name=sally
      - url 뒤에 [입력데이터]를 함께 제공하는 데이터 전달방법
      - get방식

   4. request.getParameter("name값")
      >클라이언트[#] ↔ 서버
      - 클라이언트 ↔ 서버[#]
      - request.getParameter("q")
