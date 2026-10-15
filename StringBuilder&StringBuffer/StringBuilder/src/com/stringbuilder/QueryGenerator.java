package com.stringbuilder;

public class QueryGenerator {
	
	public StringBuilder generateQuery(int salary,String emp_ID) {
		
		StringBuilder query=new StringBuilder("*Select from employee");	
		
		 StringBuffer m;
		if(salary>0) {
			query.append("Where salary= "+salary);
		}
		
		else if(emp_ID != null) {
			
			query.append("Where empId = "+emp_ID);
		}
		else {
			query.append(" ; ");
		}
		
		return query;
		
	}

}
