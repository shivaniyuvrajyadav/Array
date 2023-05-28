//Print the reverse of an Array
package Day6;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,3,7,5,2};
	     int i=0;
	     int j=a.length-1;
	     System.out.println("Before Reverse");
	     for(int k=0;k<a.length;k++) {
	    	 System.out.println(a[k]+"");
	     }
	     while(i<j) {
	    	 int temp=a[i];
	    	 a[i]=a[j];
	    	 a[j]=temp;
	    	 i++;
	    	 j--;
	     }
	     System.out.println();
	     System.out.println("after Reverse");
	     for(int k=0;k<a.length;k++) {
	    	 System.out.println(a[k]+"");
	     }

	}

}
