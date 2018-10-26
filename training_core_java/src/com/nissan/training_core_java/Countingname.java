package com.nissan.training_core_java;

class Countingname {
	String name="Sankar";
			int flag=0;
	String a[]= {"Sankar","Gowri","Rohith","Sankar","Gowri","Sankar"};
	int l=a.length;
}

class counter extends Countingname
{
	public void count()
	{
		int j=super.l;
		for(int i=0;i<j;i++)
			if(super.name==super.a[i])
				super.flag++;
		System.out.println(name+" is present "+flag+" times");
	}
}
class run
{
	public static void main(String[] args) {
		counter obj=new counter();
		obj.count();
	}

}
