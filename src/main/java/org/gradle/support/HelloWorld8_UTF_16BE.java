// русский текст
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_UTF_16BE {
	
	public static void main(String[] args) {
		Supplier<String> /*русский текст*/helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
