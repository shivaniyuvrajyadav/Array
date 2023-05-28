package Day11;

public class duplicateUnsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,3};
		
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int k=i+1; k<a.length; k++) {
				if(a[k]<a[min])
				{
					min=k;
				}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
		int j=0;
		for(int i=0;i<a.length-1;i++) 
		{
			if(a[i]!=a[i+1]) 
			{
				a[j]=a[i];
				j++;
			
			}
			}
			a[j]=a[a.length-1];
	 for (int k=0;k<a.length-1;k++)
			{
				System.out.print(a[k]);
			}
				
			}
		

	}


