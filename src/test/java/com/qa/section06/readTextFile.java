package com.qa.section06;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class readTextFile {

	public static void main(String[] args) throws IOException {
		File file = new File("src/test/resources/text/file.txt");
		String readFile = FileUtils.readFileToString(file, "UTF-8");
		System.out.println("[Read File: " +readFile+"]");
		List<String> list = FileUtils.readLines(file, "UTF-8");
		System.out.println("[Read Line: "+list);

	}

}
