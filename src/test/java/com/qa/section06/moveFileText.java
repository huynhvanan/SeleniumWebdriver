package com.qa.section06;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class moveFileText {

	public static void main(String[] args) throws IOException {
		File file = new File("src/test/resources/text/file.txt");
		File file1 = new File("src/test/resources/text/file1.txt");
		File file2 = new File("src/test/resources/text/file2.txt");
		File dir = new File("src/test/resources/text/Dir");
		FileUtils.copyFile(file, file1);
		FileUtils.copyFileToDirectory(file, dir);
		FileUtils.moveFile(file, file2);

	}

}
