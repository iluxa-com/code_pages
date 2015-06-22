//Chinese characters, used in the People's Republic of China.  汉字内码扩展规范
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_GBK {
	
	public static void main(String[] args) {
		Supplier<String>/* 汉字内码扩展规范*/ helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
