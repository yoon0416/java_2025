## JAVA IO
1. java I/O?
   - 입력(input)과 출력(output)
   - 두 대상간의 데이터를 주고 받는 것
   - 스트림이란? 사용연결통로
     - 입력스트림       →       [프로그램]     →     출력스트림 <br></br>
                  InputStream              OutputStream
              <br></br>
2. JAVA I/O 분류
   - byte단위(InputStream / OutputStream) - 모든종류 (그림, 문자, 멀티미디어) 
   - char 단위(Reader / Writer) - 문자

3. 보조스트림
   - 스트림이란? 사용연결통로
   - `new BufferedReader(  new InputStreamReader(  new FileInputStream(file)  ) )`
     1. `new FileInputStream(file)` byte↗ / char
     2. `new InputStreamReader` byte를 문자스트림으로 - 텍스트처리 가능
     3. `new BufferedReader` 속도향상

a쓰고 a읽어오고 / b쓰고 b 읽어오고 / c쓰고 c 읽어오고 
        
        ↓
        
abc 쓰고 abc 읽어오고
