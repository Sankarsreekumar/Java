package com.nissan.training_core_java;

import java.util.Scanner;

 interface books
{
	abstract void createnew();
	abstract void add(String a);
	abstract void remove(String a);
	abstract void update(String a);
}
 interface books1
 {
	 abstract void borrow();
	abstract void returning();
 }
class Library
{
	int create=0;
String name[];
int num[];
int l;
	void admin()
	{
		Scanner sc=new Scanner(System.in);
	books b=new books(){
		public void createnew()
		{
			System.out.println("Creating a new Library");
			System.out.println("Enter the total number of books");
			l=sc.nextInt();
			name=new String[l];
			num=new int[l];
			int i=0;
			while(i<l)
			{
			System.out.println("Enter the name of book");
			name[i]=sc.next();
			System.out.println("Enter the number of books");
			num[i]=sc.nextInt();
			i++;
		}
			System.out.println("Library Created");
			System.out.println();
			System.out.println("List");
			System.out.println();
			for(int j=0;j<l;j++)
				System.out.println(name[j]+" "+num[j]);
		}
		public void add(String a)
		{
			
			int flag=0;
		for(int i=0;i<l;i++)
		{
			if(a.equalsIgnoreCase(name[i]))
			{
				num[i]=num[i]+1;
				flag++;
				break;
			}
		}
		if(flag==0) {
			try
			{
			for(int i=0;;i++)
			{
				if(num[i]==0)
				{
					name[i]=a;
					num[i]=1;
					break;
				}
			}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.println("No slots available");
			}
					
			}
		}
		public void remove(String a)
		{
			
		int flag=0;
		try {
			for(int i=0;;i++)
			{
				if(a.equalsIgnoreCase(name[i]))
				{
						num[i]=num[i]-1;
						flag=1;
						break;
				}
				
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{

                System.out.println(e);
				System.out.println("Book not availabe");
		}
		}
		public void update(String a)
		{
			
			int flag=0;
			try {
			for(int i=0;i<l;i++)
			{
				if(a.equalsIgnoreCase(name[i]))
				{
						num[i]=num[i]+1;
						flag=1;
						break;
				}
				
			}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.println("Book not availabe");
			}
	}};

System.out.println("Welcome admin,choose one of the following options");
	System.out.println("1.Create new library");
System.out.println("2.Add book");
System.out.println("3.Remove book");
System.out.println("4.Update book");
int ch=sc.nextInt();

if(ch==1)
{
b.createnew();
}
else if(ch==2)
{
	System.out.println("Enter name of book");
	String bk=sc.next();
b.add(bk);
System.out.println("List");
System.out.println();
for(int j=0;j<l;j++)
	System.out.println(name[j]+" "+num[j]);
}
else if(ch==3)
{
	System.out.println("Enter name of book");
	String bk=sc.next();
	b.remove(bk);
	System.out.println("List");
	System.out.println();
	for(int j=0;j<l;j++)
		System.out.println(name[j]+" "+num[j]);
}
else
{
	System.out.println("Enter name of book");
    String bk=sc.next();
	b.update(bk);
	System.out.println("List");
	System.out.println();
	for(int j=0;j<l;j++)
		System.out.println(name[j]+" "+num[j]);
	}
	}
	void user()
	{
		books1 c=new books1() {
			public void borrow()
			{
				System.out.println("List");
				System.out.println();
				for(int i=0;i<l;i++)
					System.out.println(name[i]+" "+num[i]);
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter name of book");
				String bk=sc.next();
				int flag=0;
				for(int i=0;i<l;i++)
				{
					if(bk.equalsIgnoreCase(name[i]))
					{
							num[i]=num[i]-1;
							flag=1;
							break;
					}
					
				}
				if(flag==0)
					System.out.println("Book not availabe");
				else
					System.out.println(bk+" is borrowed,return after use.");
				
			}
			public void returning()
					{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter name of book");
				String bk=sc.next();
				int flag=0;
				for(int i=0;i<l;i++)
				{
					if(bk.equalsIgnoreCase(name[i]))
					{
							num[i]=num[i]+1;
							flag=1;
							break;
					}
					
				}
				if(flag==0)
					System.out.println("Book not availabe");
				else
					System.out.println(bk+" is returned.");
				
					}
		};
		Scanner sc=new Scanner(System.in);
	System.out.println("Choose an option");
	System.out.println("1.Borrow");
	System.out.println("2.Return");
	int t=sc.nextInt();
	if(t==1)
	{
		c.borrow();
	}
	else
		c.returning();
	}
	}
public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String exit="no";
		Library object=new Library();
		while(exit.equalsIgnoreCase("no"))
		{
		System.out.println("Welcome to the Library System");
		System.out.println("Are you...");
		System.out.println("1.Admin");
		System.out.println("2.User");
		int pin=1234;
		int au=sc.nextInt();
		
		if(au==1)
		{
			System.out.println("Enter the password");
			int pi=sc.nextInt();
			if(pi==pin)
			{
				String ans="yes";
			while(ans.equalsIgnoreCase("yes"))
			{
				object.admin();
				System.out.println("Do you want to do another action?");
				ans=sc.next();
			}
		}
			else
				System.out.println("Wrong pin");
		}
			else
			{
				String ans="yes";
				while(ans.equalsIgnoreCase("yes"))
				{
					object.user();	
					System.out.println("Do you want to do another action?");
					ans=sc.next();
				}
			}
		System.out.println("Do you want to exit?");
		exit=sc.next();
		}
				}
			}
			

	


