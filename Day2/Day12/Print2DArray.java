package Day12;

public class Print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3,5},{6,7,8,9},{10,11,12,13}};
		System.out.println("Printing 3rd element from 2nd Array: "+a[1][2]);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}

	}

}
