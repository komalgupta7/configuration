package com.komal.configuration.core;

public class ConfigurationReaderFactory {

	public static ConfigurationReader getReader(String type) {
		ConfigurationReader res = null;
		switch (type) {
		case "GITHUB":
			res = new GitHubConfigurationReader(); break;
		case "LOCAL":
			res = new FileSystemConfigurationReader(); break;
		default:
			break;
		}
		return res;
	}
	

}
