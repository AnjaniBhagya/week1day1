package week1assignment1;

import java.util.ArrayList;

public class FindIntersectionArray {

	public static void main(String[] args) {

		int[] arr1={3,2,11,4,6,7};
		int[] arr2={1,2,8,4,9,7};
		int[] arr3= {0,0,0,0,0,0};
		
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr1.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					arr3[i]=arr1[i];
					break;
				}
			}
		}
		System.out.println("Intersection Elements are: ");
		
		for (int j = 0; j < arr1.length; j++)
		{
			if(arr3[j]!=0)
			{
				System.out.println(arr3[j]);
			}
		}
	}

}
