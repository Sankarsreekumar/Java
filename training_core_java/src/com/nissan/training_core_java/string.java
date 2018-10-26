
package com.nissan.training_core_java;

class count1 {
	String name="Sankar";
			int flag=0;
	String a[]= {"Sankar","Gowri","Rohith","Sankar","Gowri","Sankar"};
	int l=a.length;
}

class string extends count1
{
	public void counter1()
	{
		int j=super.l;
		for(int i=0;i<j;i++)
			if(super.name==super.a[i])
				super.flag++;
		System.out.println(name+" is present "+flag+" times");
	}
	public static void main(String[] args) {
		string obj=new string();
		obj.counter1();
	}

}
