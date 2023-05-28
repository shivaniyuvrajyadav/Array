//Print smallest and second smallest element from an array.
package Day7;

public class secondsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,4,7,6,5};
		int smallest=a[0];
		int s_smallest=a[1];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				s_smallest=smallest;
				smallest=a[i];
			}else if(a[i]<s_smallest && a[i]!=smallest) {
				smallest=a[i];
				
			}
		}
		
		System.out.println("smallest element is : "+smallest);
		System.out.println("Second smallest element is :"+s_smallest);
		

	

	}

}
