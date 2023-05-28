//insert element 12 in a specific position 3 in an array.
package Day12;

import java.util.ArrayList;
import java.util.List;

public class AddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5};
		List s=new ArrayList();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		s.add(3,12);
		System.out.println(s);
		Object[]o=new Object[s.size()];
		s.toArray(o);
		for (int i=0;i<o.length;i++) {
			System.out.print(o[i]+" ");
		}
	}

}
