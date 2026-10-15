package com.objectsPractic;

public class Practice {
	    static {
	        System.out.println("Static block");
	    }

	    {
	        System.out.println("Instance Initilization Block..");
	    }

	    Practice() {
	        System.out.println(" this is Ctor");
	    }

	    public static void main(String[] args) {
	    	Practice obj1 = new Practice();
	    	Practice obj2 = new Practice();
	    }
	}
	

