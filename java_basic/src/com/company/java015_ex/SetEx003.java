package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Randomnum{
	private int Rnumber;

	public Randomnum(){
		this.Rnumber = (int) (Math.random() * 45)+1; // 랜덤
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Rnumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Randomnum other = (Randomnum) obj;
		return Rnumber == other.Rnumber;
	}

	public int getRnumber() { return Rnumber; }  
}

public class SetEx003 {

	public static void main(String[] args) {
		Set<Randomnum> numbers = new HashSet<>(); 
		
		while (numbers.size() < 6) {
			Randomnum randomNum = new Randomnum();
			numbers.add(randomNum); 
		}//end while
		
		for(Randomnum numb : numbers) {
			System.out.print(numb.getRnumber()+" ");
		}

		System.out.println("\n----------- ");
		
		Iterator<Randomnum> iter = numbers.iterator(); //1. 줄을 서시오! iter → 
		while(iter.hasNext()) { //2. 처리대상 확인 iter  
			 
			System.out.print(iter.next().getRnumber()+" ");//3.꺼내오기
		}
		
	}

}
/*
중복되는 숫자없이  랜덤으로 숫자6개를 받는 로또를 만들려고 한다.
1. 알맞은 콜렉션프레임워크는? Set
2. 프로그램을 작성하시오. ㅇ
*/