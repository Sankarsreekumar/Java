package com.nissan.training_core_java;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of customers");
		int a=sc.nextInt();
		String ans="yes";
		while(ans.equalsIgnoreCase("yes"))
		{
		String s[]=new String[a];
		int p=0;
		System.out.println("Enter the required option number");
    	System.out.println("");
    	System.out.println("1.Add customer");
    	System.out.println("2.Delete");
    	System.out.println("3.Edit");
    	int b=sc.nextInt();
    	
    	if(b==1)
    	{
    		int flag=0;
    		System.out.println("Enter name");
    		String s1=sc.next();
    		for(p=0;p<a;p++)
    			if(s[p]==null)
    			{
    				System.out.println("flag is null,p is "+p);
    				flag=1;
    				break;
    			}
    				
    		if((p==a-1)&&(s[p]!=null))
    			System.out.println("Database is full");
    		else
    		{
    			System.out.println("in else,p is "+p);
    			s[p]=s1;
    			p++;
    		}
    	}
    	else if(b==2)
    	{
    		System.out.println("Enter name");
    		String s1=sc.next();
    		for(p=0;p<a;p++)
    		{
    			if(s1.equalsIgnoreCase(s[p]))
    				s[p]="";
    		}
    	}
    	else
    	{
    		String first="";
    		String last="";
    		System.out.println("Enter the current name");
        	System.out.println("");
        	String name=sc.next();
    		System.out.println("Enter the required option number");
        	System.out.println("");
        	System.out.println("1.First name edit");
        	System.out.println("2.Last name edit");
        	int c=sc.nextInt();
        	int flag=0;
        	for(p=0;p<a;p++)
    			if(s[p].equalsIgnoreCase(name))
    			{
    				flag=1;
    				break;
    			}
    				if(flag==0)
    					System.out.println("Name is not found");
    				else
    				{
    					String edit=s[p];
    					edit=edit.trim();
    					int find=0;
    					for(int j=0;j<edit.length();j++)
    						if(edit.charAt(j)==' ')
    						{
    							find =1;
    							first=edit.substring(0, j-1);
    						    last=edit.substring(j+1, edit.length());
    						}
    					if(find==0)
    					{
    						first=edit;
    						last="";
    					}
    				if(c==1)
    				{
    					System.out.println("Enter the new first name");
    		        	System.out.println("");
    		        	String f1=sc.next();
    		        	first=f1;
    							
    					}
    				else
    				{
    					System.out.println("Enter the new last name");
    		        	System.out.println("");
    		        	String f1=sc.next();
    		        	last=f1;
    							
    					}
    				System.out.println("Name changed");
    				s[p]=first+" "+last;
    				
    				}
    		
        	
    	}
		}
	}

}
