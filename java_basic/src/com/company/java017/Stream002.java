package com.company.java017;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream002 {

	public static void main(String[] args) {
		// 데이터종류 상관없이 같은 방식으로 처리
		Integer[] arr = {1,2,3,4,1,2,4,7,5};
		List<Integer> list = Arrays.asList(arr);
		
		//#1. stream
		Stream<Integer> stream_arr = Arrays.stream(arr);
		Stream<Integer> stream_list = list.stream();
		
		//#2. 중간연산
		//boolean java.util.function.Predicate.test ( T t )
//		stream_arr.filter(	(t)->{	return t % 2 != 0;	}	); //홀수 필터링
		stream_arr.filter(	t->  t % 2 != 0) 		//홀수 필터링
		.distinct()									//중복제거
		.sorted()									//정렬
		.skip(1)									//스킵
			.forEach(t -> {System.out.print(t);});  //#3. 최종연산
		
		System.out.println();
		System.out.println();
		
		stream_list.filter(	t->  t % 2 != 0) 		//홀수 필터링
		.distinct()									//중복제거
		.sorted()									//정렬
		.skip(1)									//스킵
			.forEach(System.out::print);  //#3. 최종연산

		//#3. collect
		System.out.println(	Arrays.stream(arr).collect(Collectors.toList()));
		System.out.println(	Arrays.stream(arr).collect(Collectors.toList()));
		System.out.println(	list.stream().collect(Collectors.toList()));
	}// end

}
