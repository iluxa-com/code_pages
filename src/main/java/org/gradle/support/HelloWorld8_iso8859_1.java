//Ç, ç, R, r, Sh, sh, Zh, zh, Ð, ð (or d',) T, t', Ñ, ñ, U, u·, Ë, ë
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_iso8859_1 {
	
	public static void main(String[] args) {
		Supplier<String> /*Ç, ç, R, r, Sh, sh, Zh, zh, Ð, ð (or d',) T, t', Ñ, ñ, U, u·, Ë, ë*/ helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
