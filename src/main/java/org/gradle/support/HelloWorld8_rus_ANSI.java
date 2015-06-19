//русский текст

package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_rus_ANSI {
	
	public static void main(String[] args) {
		Supplier<String>  /*русский текст*/ helloer  /*русский текст*/ = () -> "Hello World!!!!" ;
		System.out.println /*русский текст*/ (helloer.get());
	}
}
//comment
