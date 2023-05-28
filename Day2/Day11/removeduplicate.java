//Remove Duplicate element from an sorted array
package Day11;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,3,4,5};
		int []temp= new int [a.length-1];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]) {
			temp [j]=a[i];
			j++;
		
		}}
		temp[j]=a[a.length-1];
		
	
		for (int k=0;k<a.length-1;k++) {
			System.out.println(a[k]);
		}
		
		


	}
}
