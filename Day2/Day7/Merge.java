//Merge two array in a third array display the new array.
package Day7;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5};
		int []b= {6,7,8,9,10};
		int []c= new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=a.length,j=0;i<c.length && j<b.length;i++,j++) {
			c[i]=b[j];
			
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]+"");
		}
		

	}

}
