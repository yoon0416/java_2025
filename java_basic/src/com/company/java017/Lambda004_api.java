package com.company.java017;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface sup{
	
}

public class Lambda004_api {

	public static void main(String[] args) {
	//#1. Consumer<T> 받는용도 - accpet 	
	//	void java.util.function.Consumer.accept ( T t )
	// () -> {} 파라미터() / 리턴값 x
		//Consumer<String> consumer = (t) ->{System.out.println("Hello "+t);};
		//Consumer<String> consumer = t ->System.out.println("Hello "+t);
		Consumer<String> consumer =	System.out::println;
		
		
		consumer.accept("sally");
		consumer.accept("alpha");
		
	//#2.
		//T java.util.function.Supplier.get ()
		//() -> {} 파라미터() / 리턴값 O
		Supplier<String> supplier = () -> {return "Hello";};
		System.out.println(supplier.get()); //hello
		
	//#3.Predicate
		//Predicate<Integer> Predicate = (T) ->{return T<0;};
		Predicate<Integer> Predicate = T ->T<0;;
		
		System.out.println(Predicate.test(-1));
		System.out.println(Predicate.test(1));
		
		//#4.Function
		Function<String,Integer> function = (t) ->{return Integer.parseInt(t);};
		System.out.println(function.apply("10")+3);
		
	

		//#5.Operator
		IntBinaryOperator operator = (int left, int right)-> {return left>=right? left:right;};
		System.out.println(operator.applyAsInt(10, 3));
	}
	
	
	
}
/*
  2. 자바 api의 함수형 인터페이스
   - Consumer - 받는용도 - accept
   - Supplier - 제공용도 - get
   - Predicate - 판단용도 - test
   - Function - 처리용도 - apply
   - Operator - 연산용도 - aplly
   */
