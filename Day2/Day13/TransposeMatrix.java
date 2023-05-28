package Day13;
//Addition of 2 2DArray
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] []a= {{1,2,3},{4,5,6},{1,0,1}};
		int [][]b= {{1,2,1},{2,1,2},{1,0,1}};
		int [][]c=new int [3][3];
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			
			System.out.println();
		}

	}

}
