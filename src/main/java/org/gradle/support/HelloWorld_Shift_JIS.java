//ŒN‚ª‘ã
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld_Shift_JIS {
	//ŒN‚ª‘ã
	public static void main(String[] args) {
		Supplier<String> /*ŒN‚ª‘ã*/helloer = () -> "Hello World!!!!" ;

		System.out.println(helloer.get());
	}
}
