//Find the missing element in an array.
package Day12;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5};
		int ex_ele= a.length+1;
		int totalsum=(ex_ele*(ex_ele+1)/2);
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("The missing element is :"+(totalsum-sum));

	}

}
