## abstract 
1. 추상화 ( abstract )
  - 실체화된 객체들 간에 공통된 특성을 추출한 것
  - 미완성적인 개념 ( new 사용하지 못함 )
  - 공통된 필드와 메서드의 이름을 통일할 목적

2. 추상클래스
   - `abstract class Animal{ abstract void sound(); }` >  abstract 메서드는 구현부 없음
   - `abstract class Animal{ String name; abstract void sound(); }` > 인스턴스변수 - this
   - `Animal ani = new Animal();` > new 사용불가 , 구현부가 없는 미완성이기 때문에
   - `class Cat extends Animal{ @Override void sound(){ 구현부 } }` > 자식클래스를 이용하여 구현해야함 
