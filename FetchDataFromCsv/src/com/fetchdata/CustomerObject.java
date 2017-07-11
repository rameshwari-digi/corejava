package com.fetchdata;

public class CustomerObject
{
	
	String filepath , fieldsname, wherecond;
	
	public CustomerObject(String filepath, String fieldsname, String wherecond)
	{
		this.filepath=filepath;
		this.fieldsname=fieldsname;
		this.wherecond=wherecond;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getFieldsname() {
		return fieldsname;
	}

	public void setFieldsname(String fieldsname) {
		this.fieldsname = fieldsname;
	}

	public String getWherecond() {
		return wherecond;
	}

	public void setWherecond(String wherecond) {
		this.wherecond = wherecond;
	}
	
	
	void custDisp()
	{
		FileQueryHandler fquery = new FileQueryHandler(filepath, fieldsname, wherecond);
		
		
	}
	
}
