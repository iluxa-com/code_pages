//�, �, R, r, Sh, sh, Zh, zh, �, � (or d',) T, t', �, �, U, u�, �, �
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_iso8859_1 {
	
	public static void main(String[] args) {
		Supplier<String> /*�, �, R, r, Sh, sh, Zh, zh, �, � (or d',) T, t', �, �, U, u�, �, �*/ helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
