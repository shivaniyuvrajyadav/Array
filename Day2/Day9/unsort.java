//wajp to display the elements of unsorted array after selection sorted
package Day9;

public class unsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,4,3,1};
		for (int i=0;i<a.length;i++)
		{
			int min=i;
			for (int j=i+1;j<a.length;j++) {
				if (a[j]<a[min]) {
					min=j;
				}
			}
			
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}
		
	}
}
