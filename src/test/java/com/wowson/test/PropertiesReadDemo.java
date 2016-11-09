package com.wowson.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

public class PropertiesReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readPropFileByInPutStream() ;
	}
	/**
	 * 使用InPutStream流读取properties文件
	 */
	static void readPropFileByInPutStream() {
		InputStream in4 = null;
		System.out.println("----使用InputStream流读取properties文件----");
		try {
			
			/**
			 * 读取位于另一个source文件夹里面的配置文件 
			 * config是一个source文件夹，config.properties位于config source文件夹中
			 */
			in4 = new FileInputStream("src/main/resources/config.properties");

			Properties p = new Properties();
			System.out
					.println("----------------------------------------------");

			p.load(in4);
			System.out.println("config.properties:");
			System.out.println(MessageFormat.format("dbuser={0}",
					p.getProperty("jdbc_driverClassName")));// {0}是一个java的字符串占位符
			System.out.println(MessageFormat.format("dbuser={0}",
					p.getProperty("jdbc_url")));// {0}是一个java的字符串占位符
			System.out.println(MessageFormat.format("dbpassword={0}",
					p.getProperty("jdbc_username")));
			System.out.println(MessageFormat.format("database={0}",
					p.getProperty("jdbc_password")));
			System.out
					.println("----------------------------------------------");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		
			if (in4 != null) {
				try {
					in4.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
}
}
