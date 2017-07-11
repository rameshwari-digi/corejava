package com.fetchdata;

import java.awt.Container;

public class QueryParser 
{
	
	 String fetchData[], fields , filenameext , restricitions, firstcon;
	boolean alldata, whereclause ,groupby,sortby;
	
	
	
	
	
	public void SplitQuery(String input)
	{
		System.out.println("i am in splitquery");
		
		fetchData= input.split(" ");
		
		
	}
	
	
	public void ValidatingData()
	{
		
		
		for(int i=0;i<fetchData.length;i++)
		{
			if(fetchData[i].contains(".csv"))
			{
				filenameext =fetchData[i]; 
			}
			if(fetchData[i].contains("where"))
			{
				restricitions=fetchData[i+1];
				
			}
			firstcon = fetchData[1];
			
			
			
		}
		System.out.println(filenameext+""+restricitions+""+firstcon);
		
		//System.out.println("FileName ="+filenameext +" first condition="+firstcon+"where with restr clause ="+restricitions);
		
		
	}
	
	public void validateData()
	{
		for(int i=0;i<fetchData.length;i++)
		{
			
			if(fetchData[i].contains("*"))
			{
				alldata=true;
				
			}
			if(fetchData[i].contains("where"))
			{
				whereclause=true;
				
			}
			if(fetchData[i].contains("groupby"))
			{
				groupby=true;
			}
			if(fetchData[i].contains("sortby"))
			{
				sortby=true;
				
			}
		}
		
		
	}
	
	public void CallCustObject()
	{
		CustomerObject custobj = new CustomerObject(filenameext, restricitions,firstcon);
		custobj.custDisp();
	}

}
