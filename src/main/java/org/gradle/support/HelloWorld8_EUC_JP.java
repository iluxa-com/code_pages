//���?��  GB2312 is the registered internet name for a key official character set of the People's Republic of China
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_EUC_JP {
	
	public static void main(String[] args) {
		Supplier<String> /*���?��*/ helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
