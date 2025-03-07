package com.company.java012;

class MobileNote7 extends Object{
	private String iris;

	public String getIris() {return iris;}

	public void setIris(String iris) {this.iris = iris;}
	public void newShow() {
		System.out.println(":::: NOTE7 새로운 기능(오버라이딩)");
		System.out.println("iris 홍체인식 기능!");
		System.out.println("myiris : "+getIris());

	}
	MobileNote7(){
		
	}
} //end class

class MobileNote8 extends MobileNote7{
	private String face;

	public String getFace() {return face;}

	public void setFace(String face) {this.face = face;}
	public MobileNote8() {super();}
	
	@Override
	public void newShow() {
		super.newShow();
		System.out.println(":::: NOTE8 새로운 기능(오버라이딩)");
		System.out.println("face 안면인식 기능!");
		System.out.println("face : "+getFace());
	}
}//end class

class MobileNote9 extends MobileNote8 {
    private int battery = 24;

    public int getBattery() {return battery;}

	public void setBattery(int battery) {this.battery = battery;}

    public MobileNote9() {super();} // 얜 자신이 상속받은 부모클래스의 생성자 호출 > 기본 생성자 없거나 그거 찾는거 아니면 super(데려올 생성자의 매개변수 값)

    @Override
    public void newShow() {
        super.newShow(); //상속받은 부모클래스에 원하는 멤버 가져올 때 사용한다고 함 super. > 만약에 자신이 상속받은 부모클래스에 찾으려는 멤버가 없다면 그 위 상위 클래스로 찾으러 떠남

        System.out.println(":::: NOTE9 새로운 기능(오버라이딩) 추가");
        System.out.println("=battery 하루종일 사용가능! ");
        System.out.println("=battery : " + getBattery());
    }
}//end class


public class Extends003 {

	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newShow();

	} //end psvm

}//end class
