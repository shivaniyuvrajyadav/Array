//Sort the Array elements using insertion sort.
package Day8;

public class SortInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,2,3,4,1};
		for(int i=1; i<a.length;i++) {
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j--;
				
			}
			a[j]=temp;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}

	}

}
