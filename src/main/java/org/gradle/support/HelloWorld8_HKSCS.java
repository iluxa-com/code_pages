
//Chinese: 香港增補字符集; commonly abbreviated to HKSCS
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_HKSCS {
	
	public static void main(String[] args) {
		Supplier<String> /* 香港增補字符集 */helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
