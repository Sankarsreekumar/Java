package com.nissan.training_core_java;
import java.util.Arrays;
public class arrayparallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {3,6,5,4,3,5,6,3,2,1};
for(int i: array)
{
	System.out.print(i+" ");
}
System.out.println();
Arrays.parallelSort(array);
System.out.println("Sorted");
for(int i: array)
{
	System.out.print(i+" ");
}
System.out.println();
	}

}
