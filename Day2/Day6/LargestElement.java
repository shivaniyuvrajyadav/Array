//Print the largest element in array
package Day6;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,4,7,6,5};
		int largest=0;
		int secondlarge=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				secondlarge=largest;
				largest=a[i];
			}else if(a[i]>secondlarge && a[i]!=secondlarge) {
				secondlarge=a[i];
				
			}
		}
		System.out.println("Second Large element is :"+secondlarge);
		System.out.println("Largest element is : "+largest);
		

	}
		

	}
