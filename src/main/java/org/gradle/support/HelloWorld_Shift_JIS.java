//�N����
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld_Shift_JIS {
	//�N����
	public static void main(String[] args) {
		Supplier<String> /*�N����*/helloer = () -> "Hello World!!!!" ;

		System.out.println(helloer.get());
	}
}
