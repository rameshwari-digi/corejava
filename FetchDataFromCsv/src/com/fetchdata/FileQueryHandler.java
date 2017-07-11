package com.fetchdata;


import java.io.*;
import java.util.*;
public class FileQueryHandler
{

	String filepath , fieldsname, wherecond;
	
	String data , completecontent[];
	
	BufferedReader br;
	String line="";
	public FileQueryHandler(String filepath, String fieldsname, String wherecond)
	{
		this.filepath=filepath;
		this.fieldsname=fieldsname;
		this.wherecond=wherecond;
		
		
	
		try
		{
			
			getAllData();
			
		}
		catch(Exception ie)
		{
		ie.printStackTrace();	
		}
		
	}
	
	private void getAllData() throws FileNotFoundException , IOException
	{
		FileReader fd=new FileReader("d:\\"+filepath);
	br = new BufferedReader(fd);
	List<String> list = new ArrayList<>();
	
	while((line=br.readLine())!=null)
	{
		
	/*	String[] tokens= line.split(",");
		if(tokens.length>0)
		{
			for(int i=0;i<tokens.length;i++)
			{
				System.out.println("Complete Records \t"+tokens[i]);
			}
		}
	*/
	list.add(line);
	}
	
	String[] data=list.toArray(new String[0]);
	
	for(String fetchdata:data)
	{
		System.out.println(fetchdata);
	}
	
	}
	
	
	
	
	
	
}
