package com.komal.configuration.core;


import java.io.*;

import java.util.Scanner;

public class FileSystemConfigurationReader implements ConfigurationReader{

	@Override
	public String read(String destination) {
		// TODO Auto-generated method stub
		String result = "";
		File file = new File(destination);
		try {
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			result += scan.nextLine();
		}
		scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}

}
