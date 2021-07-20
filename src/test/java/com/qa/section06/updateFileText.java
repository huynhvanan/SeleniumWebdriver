package com.qa.section06;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class updateFileText {

	public static void main(String[] args) throws IOException {
		File file = new File("src/test/resources/text/file.txt");
		FileUtils.write(file, "Huynh Van An", "UTF-8", false);

	}

}
