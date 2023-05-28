//wajp to search an element that is 4 inside an array with the help of Linear Search.
package Day9;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,4,3,1};
		int i=0;
		int search=4;
		//boolean b=false;
					//5<5
		 while( i<a.length) {
			 if(search==a[i]) {
				 System.out.println("Element Present at index:"+i);
				// b=true;
				 break;
			 }
			 i++;//5	 
		 }
		 //
		 /*if(b==false) {
			 System.out.println("Element not Present");
		 }*/
		 if(i==a.length)
		 {
			 System.out.println("Element is not present at any index");
		 }
	}

}
