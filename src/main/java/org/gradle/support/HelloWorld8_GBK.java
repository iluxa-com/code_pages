//Chinese characters, used in the People's Republic of China.  ����������չ�淶
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_GBK {
	
	public static void main(String[] args) {
		Supplier<String>/* ����������չ�淶*/ helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
