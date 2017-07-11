package com.fetchdata;


import java.util.*;
public class InputProcessing {

	public static void main(String[] args)
	{
		
		
		
		String Data = userQuery();
		System.out.println("the dat="+Data);
		QueryParser qp = new QueryParser();
		qp.SplitQuery(Data);
		qp.ValidatingData();
		qp.validateData();
		qp.CallCustObject();
		

	}
	
	public static String  userQuery()
	{
		
	String inputQuery;
	@SuppressWarnings("resource")
	Scanner inp = new Scanner(System.in);
	System.out.println("Enter your query");
	inputQuery = inp.nextLine();
	System.out.println(inputQuery);
	

	return inputQuery;
	

		
	}
	

}
