package Day9;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,5,4,9,8,1,7};
		for(int i=1;i<a.length;i++) {
			int temp=a[i]; 
			int j=i;
			       
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];  
				j--;
				}
			a[j]=temp; 
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			}
		
		System.out.print("This is the Sorted Array");
		
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		int search =8;
		System.out.println(" ");
		for(int i=0;i<a.length;i++) {
			if (search==a[mi]) {
				System.out.println(search+":the element is present at index= "+mi);
				break;
			}
			else if(search>mi) {
				li=mi+1;
			}
			
			else if (search<mi){
				hi=mi-1;
			}
			mi=(li+hi)/2;
			if(hi>search) {
				System.out.println("Element is not Present");
				}
			}
		

	}

}
