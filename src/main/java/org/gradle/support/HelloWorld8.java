package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8 {
	
	public static void main(String[] args) {
		Supplier<String> helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
