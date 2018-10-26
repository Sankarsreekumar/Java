package com.nissan.training_core_java;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.FileOutputStream;
public class collectionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cart[]=new String[10];
		int i=0;
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer,String> products=new TreeMap<Integer,String>();
		TreeMap<Integer,Integer> price=new TreeMap<Integer,Integer>();
		while(true)
		{
		System.out.println("Choose:");
		System.out.println("1.Admin");
		System.out.println("2.User");
int ch=sc.nextInt();
if(ch==1)
{
	int cho=0;
	while(cho!=4)
	{
	System.out.println("Choose:");
	System.out.println("1.Add product");
	System.out.println("2.Remove product");
	System.out.println("3.Edit prize");
	System.out.println("4.Exit");
	cho=sc.nextInt();
	if(cho==1)
	{
		System.out.println("Enter product name:");
		String a=sc.next();
		products.put(i,a);
		System.out.println("Price per unit");
		int p=sc.nextInt();
		price.put(i, p);
		i++;
	}
	else if(cho==2)
	{
		System.out.println("Enter key of product to be removed");
		int k=sc.nextInt();
		products.remove(k);
		price.remove(k);
	}
	else if(cho==3)
	{
		System.out.println("Enter key of the product whose price is to be edited");
		int k=sc.nextInt();
		System.out.println("Enter amount");
		int amt=sc.nextInt();
		price.put(k,amt);
	}
	else
		break;
}
}
else
{
	
	int j=0;
			int sum=0;
	System.out.println("List Of Products");
	System.out.println();
	System.out.println("KEY  PRODUCT  PRICE");
	System.out.println();
	for(Map.Entry n:products.entrySet())
	for(Map.Entry m:price.entrySet())
	{
		if(n.getKey()==m.getKey())
		System.out.println(m.getKey()+" "+n.getValue()+" "+m.getValue());
	}
	String enough="no";
	while(enough.equalsIgnoreCase("no"))
	{
		System.out.println("Enter key of product to be added to cart");
		int k=sc.nextInt();
		cart[j]=products.get(k);
				sum=sum+price.get(k);
				j++;
				System.out.println("Enough?");
				enough=sc.next();
		if(j==10)
			break;
	}
	System.out.println(".............BILL............");
	for(int z=0;z<10;z++)
		if(cart[i]!=null)
		System.out.println(cart[i]);
		else
			break;
	System.out.println("Bill amount ="+sum);
try {
	FileOutputStream fout=new FileOutputStream("E:\\Cart.txt");
	for(int x=0;x<10;x++)
	{
	String a=cart[i]+" ";
	byte b[]=a.getBytes();
	fout.write(b);
	
    }
	fout.close();
	System.out.println("File writing Done");
}
catch(Exception e)
{
	System.out.println(e);
}



	}
		}
	}
	}


