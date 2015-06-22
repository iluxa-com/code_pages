//国家标准 GB18030 is the registered Internet name for the official character set of the People's Republic of China (PRC) superseding GB2312.
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_GB_18030 {
	
	public static void main(String[] args) {
		Supplier<String> /*国家标准*/ helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
