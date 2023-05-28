package Day9;

public class Left_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
		
		int n=1;
		System.out.println("Before Shifting: ");
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println();
		 for(int i=1;i<=n;i++) {
			 int temp= a[0];
			 int j;
			 
        	for( j=0;j<a.length-1;j++) {
        		a[j]=a[j+1];
        	}
        	a[j]=temp;
        	
        }
		 System.out.println("");
		 System.out.println("After Shifting: ");
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
	}




	

}
