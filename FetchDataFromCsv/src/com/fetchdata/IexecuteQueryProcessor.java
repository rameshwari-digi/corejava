package com.fetchdata;

import java.util.List;

public interface IexecuteQueryProcessor
{ 
	
	public List<CustomerObject> getAllData();
	public List<CustomerObject> getDataByFields();
	public List<CustomerObject> getDataByCondition();
	//public String getDataBygroup();
	
	

}
