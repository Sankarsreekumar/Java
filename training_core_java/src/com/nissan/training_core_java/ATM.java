package com.nissan.training_core_java;
import java.util.Scanner;
class user
{
	int previous=0;
	String name;
	int pin;
	String addr;
	int phno;
	int bal;
	int cbal;
	int fdbal;
	int rdbal;
	int f1=0;
	int f2=0;
	int f3=0;
	int f4=0;
	user(int a)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Address");
		addr=sc.next();
		System.out.println("Enter phone number");
		phno=sc.nextInt();
		System.out.println("Enter PIN number");
		pin=sc.nextInt();
		cbal=0;
		fdbal=0;
		rdbal=0;
		f1=1;
		System.out.println("Getting Started with your account.");
		System.out.println("How much money do you wish to enter in your account?");
		int m=sc.nextInt();
		bal=m;
		while(bal<3000)
		{
			System.out.println("Minimum balance is 3000, enter a higher amount to open your account ");
			bal=sc.nextInt();
		}
		System.out.println("Account created. Account number is "+a);
		
	}
	void edit()
	{
		Scanner sc=new Scanner(System.in);
		int choice=1;
		while(choice!=5) {
		System.out.println("What do you want to edit?");
		System.out.println("1.Name");
		System.out.println("2.Address");
		System.out.println("3.Phone number");
		System.out.println("4.PIN");
		System.out.println("5.Exit");
		choice=sc.nextInt();
		if(choice==1)
		{
		System.out.println("Enter Name");
		name=sc.next();
		}
		else if(choice==2)
		{
		System.out.println("Enter Address");
		addr=sc.next();
		}
		else if(choice==3)
		{
		System.out.println("Enter phone number");
		phno=sc.nextInt();
		}
		else if(choice==4)
		{
		System.out.println("Enter PIN number");
		pin=sc.nextInt();
		}
		else
			break;
		
	}
	}
	void createaccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Which account do you want to open?");
		System.out.println();
		System.out.println("1.Fixed Account");
		System.out.println("2.Current Account");
		System.out.println("3.Reccuring Deposit Account");
		int acc=sc.nextInt();
		if(acc==1)
		{
			if(f2==1)
				System.out.println("Fixed Account already exists with balance "+fdbal);
			else
				f2=1;
		}
		else if(acc==2)
		{
			if(f3==1)
				System.out.println("Current Account already exists with balance "+cbal);
			else
				f3=1;
		}
		else
		{
			if(f4==1)
				System.out.println("Recurring Deposit Account already exists with balance "+rdbal);
			else
				f4=1;
		}
		
	}
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Which account do you want to deposit money in?");
		System.out.println();
		System.out.println("1.Fixed Account");
		System.out.println("2.Current Account");
		System.out.println("3.Reccuring Deposit Account");
		System.out.println("4.Normal Account");
		
		int acc=sc.nextInt();
		int flag=0;
		if(acc==1&&f2==0)
			flag=1;
		if(acc==2&&f3==0)
			flag=1;
		if(acc==3&&f4==0)
			flag=1;
		if(flag==0)
		{
			System.out.println("Enter the amount");
			int amt=sc.nextInt();
		if(acc==1)
		{
			fdbal=fdbal-amt;
			System.out.println("Amount "+amt+" is deposited and balance is "+fdbal);
			
	}
		else if(acc==2)
		{
			cbal=cbal+amt;
			System.out.println("Amount "+amt+" is deposited and balance is "+cbal);
			
	}
		else if(acc==3)
		{
			previous++;
			rdbal=rdbal+amt;
			if(previous==3)
			{
				previous=0;
				rdbal=rdbal+100;
				bal=bal-100;
			}
			System.out.println("Amount "+amt+" is deposited and balance is "+rdbal);
			if(bal<3000)
			{
				System.out.println("Main account balance is now less than minimum balance ");
			}
			
			}
			
		else
		{
			bal=bal+amt;
			System.out.println("Amount "+amt+" is deposited and balance is "+bal);
		}
		}
		else
			System.out.println("Account not created");
	}
	void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Which account do you want to withdraw money from ?");
		System.out.println();
		System.out.println("1.Fixed Account");
		System.out.println("2.Current Account");
		System.out.println("3.Reccuring Deposit Account");
		System.out.println("4.Normal Account");
		int acc=sc.nextInt();
		int flag=0;
		if(acc==1&&f2==0)
			flag=1;
		if(acc==2&&f3==0)
			flag=1;
		if(acc==3&&f4==0)
			flag=1;
		if(flag==0)
		{
			System.out.println("Enter the amount");
			int amt=sc.nextInt();
		if(acc==1)
		{
			
			fdbal=fdbal-amt;
			while(fdbal<0)
			{
				fdbal=fdbal+amt;
				System.out.println("Amount cannot be withdrwan, enter a smaller amount ");
				amt=sc.nextInt();
				fdbal=fdbal-amt;
			}
			System.out.println("Amount "+amt+" is withdrawn and balance is "+fdbal);
			
	}
		else if(acc==2)
		{
			cbal=cbal-amt;
			while(cbal<0)
			{
				cbal=cbal+amt;
				System.out.println("Amount cannot be withdrwan, enter a smaller amount ");
				amt=sc.nextInt();
				cbal=cbal-amt;
			}
			System.out.println("Amount "+amt+" is withdrawn and balance is "+cbal);
	}
		else if(acc==3)
		{
			previous++;
			rdbal=rdbal-amt;
			while(rdbal<0)
			{
				rdbal=rdbal+amt;
				System.out.println("Amount cannot be withdrwan, enter a smaller amount ");
				amt=sc.nextInt();
				rdbal=rdbal-amt;
			}
			if(previous==3)
			{
				previous=0;
				rdbal=rdbal+100;
				bal=bal-100;
			}
			System.out.println("Amount "+amt+" is withdrawn and balance is "+rdbal);
			if(bal<3000)
			{
				System.out.println("Main account balance is now less than minimum balance ");
			}

			
	}
		else
		{
			bal=bal-amt;
			while(bal<0)
			{
				bal=bal+amt;
				System.out.println("Amount cannot be withdrwan, enter a smaller amount ");
				amt=sc.nextInt();
				bal=bal-amt;
			}
			if(bal<3000)
			{
				System.out.println("Main account balance is now less than minimum balance ");
			}
			System.out.println("Amount "+amt+" is withdrawn and balance is "+bal);
		}
	}
		else
			System.out.println("Account not created yet");
	}
}


public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of accounts");
		int a=sc.nextInt();
		user array[]=new user[a];
		int flag=0;
		String cho="no";
		while(cho.equalsIgnoreCase("no"))
		{
		System.out.println("Welcome to the ATM");
		System.out.println("Choose your option:");
		System.out.println("1.Log in (for already existing users)");
		System.out.println("2.Create new account (for new users)");
		int o=sc.nextInt();
		if(o==2)
		{
			if(flag==a)
			{
				System.out.println("No more accounts can be created");
			}
			else
			{
			array[flag]=new user(flag+1);
			flag++;
			}
            
		}
		else
		{
			System.out.println("Enter name");
			String na=sc.next();
			int match=0;
			int i;
			for(i=0;i<flag;i++)
			{
			match=0;
			if(array[i].name.equalsIgnoreCase(na))
			{
				match++;
				break;
			}
			}
			if(match>1)
			{
				System.out.println("More than one account has the same name,enter your account number");
				int acno=sc.nextInt();
				if(array[acno-1].name.equalsIgnoreCase(na))
				{
					match=1;
					i=acno-1;
				}
			}
			if(match==1)
			{
				System.out.println("Hello "+na);
				System.out.println("Enter your PIN number");
				int pi=sc.nextInt();
				if(pi==array[i].pin)
				{
					String choi="yes";
					System.out.println("Logged in successfully,choose your option");
					while(choi.equalsIgnoreCase("yes"))
					{
					System.out.println("1.Deposit money");
					System.out.println("2.Withdraw money");
					System.out.println("3.Create various accounts");
					System.out.println("4.Edit details");
					int ch=sc.nextInt();
					if(ch==1)
						array[i].deposit();
					else if(ch==2)
						array[i].withdraw();
					else if(ch==3)
						array[i].createaccount();
					else
						array[i].edit();
					System.out.println("Do you wish to do another transaction?");
					choi=sc.next();
				}
				}
				else
					System.out.println("You have entered the wrong pin.");
						
				}
	
			else
				System.out.println("Account has not been created in your name");
			}
		System.out.println("Do you want to exit?");
		cho=sc.next();
		}
			
		

	}

}
