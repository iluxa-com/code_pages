//君が代
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld_jap1 {
	//君が代
	public static void main(String[] args) {
		Supplier<String> /*君が代*/helloer = () -> "Hello World!!!!" ;

		System.out.println(helloer.get());
	}
}
