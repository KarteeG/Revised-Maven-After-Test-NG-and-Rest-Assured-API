package com.testng.properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Multiple_Datas {

	@Test(dataProvider = "testData")
	private void data(String username, int password, String fname,String lname,int pin,
						String uname,String pass,String f,String l,int code) {

		System.out.println("Username :" + username);

		System.out.println("Password :" + password);

		System.out.println("First Name :" + fname);

		System.out.println("Last Name :" + lname);

		System.out.println("Pin Number :" + pin);
		
		System.out.println("User :" + uname);

		System.out.println("Pass :" + pass);

		System.out.println("F Name :" + f);

		System.out.println("L Name :" + l);

		System.out.println("Code Number :" + code);
		

		
		
	}

	@DataProvider
	private Object[][] testData() {

		return new Object[][] {

				{ "Smith", 15, "SmithDadddy","Lname",154,"user","pass","f","L",1454},
				{ "Stark", 25, "StarkDaddy","LastName",155,"user","pass","f","L",1454}
					
			
		};	

	}

}
