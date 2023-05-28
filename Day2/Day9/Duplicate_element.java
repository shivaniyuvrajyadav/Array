//wajp to to find the array has duplicate element present or not is yes then print the index
package Day9;

public class Duplicate_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,3,4,5};
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate element Present: "+j);
				count++;
				}}	
	}
		if (count==0){
			System.out.println("Duplicate element not present");
			
		}
	}
}
