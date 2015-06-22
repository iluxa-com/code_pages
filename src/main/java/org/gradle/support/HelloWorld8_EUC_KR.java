//통합 완성형, EUC-KR is a variable-width encoding to represent Korean text using two coded character sets, KS X 1001 (formerly KS C 5601)[1][2] and KS X 1003 (formerly KS C 5636)/ISO 646:KR/US-ASCII
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_EUC_KR {
	
	public static void main(String[] args) {
		Supplier<String> /*통합 완성형*/ helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
