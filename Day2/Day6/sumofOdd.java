//Print sum of all the odd elements of a array
package Day6;

public class sumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,3,7,5,2};
		int sum=0;
		
	     for(int i=0;i<a.length;i++) {
	    	 if(a[i]%2==1) {
	    		 sum=sum+a[i];
	    		 
	    	 }
	     }
	    
	     System.out.println(sum);
 		

	




	}

}
