//GB2312 is the registered internet name for a key official character set of the People's Republic of China, used for simplified Chinese characters. GB abbreviates Guojia Biaozhun (国家标准)
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_GB_2312 {
	
	public static void main(String[] args) {
		Supplier<String>  /*国家标准*/ helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
