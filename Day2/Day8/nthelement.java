package Day8;



public class nthelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,1,2,4};
		int n=1;
		for (int i=0;i<a.length;i++) {
		for (int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		}
		System.out.println(a[a.length-n]);
	}

}
