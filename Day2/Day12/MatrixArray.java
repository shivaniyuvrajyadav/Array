//print all the element in a 2D array in the form of transpose of matrix..
package Day12;

public class MatrixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3,5},{6,7,8,9},{1,0,2,3}};
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
