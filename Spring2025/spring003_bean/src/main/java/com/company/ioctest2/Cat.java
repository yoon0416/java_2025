package com.company.ioctest2;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal{
	@Override public String eat() { return "Cat-eat"; }
	@Override public String sleep() { return "Cat-sleep"; }
	@Override public String poo() { return "Cat-poo"; }
}
