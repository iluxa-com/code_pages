//Compatibility Encoding Scheme for UTF-16: 8-Bit (CESU-8)
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_CESU8 {
	
	public static void main(String[] args) {
		Supplier<String> helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
