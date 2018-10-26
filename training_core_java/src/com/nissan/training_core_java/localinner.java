package com.nissan.training_core_java;

public class localinner {

	int data=10;
	void showmsg()
	{
		class local{
			void display()
			{
				System.out.println(data);
			}
		}
		local s=new local();
		s.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
localinner o=new localinner();
o.showmsg();
	}

}
