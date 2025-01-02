package basics.com;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		int[] a= {1, 2, 2, 1, 1, 3, 4, 5, 5, 4, 4, 5, 5, 6, 5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-1]);
	}

}
