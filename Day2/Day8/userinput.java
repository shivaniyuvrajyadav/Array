//Take Size and inputs of array  from the user
package Day8;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int s=sc.nextInt();
		int a[]=new int [s];
		System.out.println("Now Enter the elements: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}

	}

}
