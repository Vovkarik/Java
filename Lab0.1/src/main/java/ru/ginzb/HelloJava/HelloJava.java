package ru.ginzb.HelloJava;

import java.io.File;

class HelloJava {
	public static void main(String[] args) {
		String arguments = "";
		for(int i = 0; i < args.length; i++) {
			arguments += args[i] += " ";
		}
		String jrePath = System.getProperty("java.home");
        String jdkPath = (new File(jrePath)).getParentFile().getAbsolutePath();
		System.out.println(
			String.format("Hello, Java from %s \nOS Name: %s \nOS Version: %s \nJava Version: %s \nJava Path: %s \nUser Dir: %s",
				arguments,
				System.getProperty("os.name"),
				System.getProperty("os.version"),
				System.getProperty("java.version"),
				jdkPath,
				System.getProperty("user.dir")
				)
			);
	}
}