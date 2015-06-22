//プログラマのための文字コード技術入門」を読んで自分なりに理解した点をザックリとまとめてみる
package org.gradle.support;

import java.util.function.Supplier;

public class HelloWorld8_iso2022 {
	
	public static void main(String[] args) {
		Supplier<String> /*プログラマのための文字コード技術入門」を読んで自分なりに理解した点をザックリとまとめてみる*/helloer = () -> "Hello World!!!!" ;
		System.out.println(helloer.get());
	}
}
//comment
