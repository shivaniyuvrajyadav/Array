package Day11;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,3};
		Set s=new LinkedHashSet();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);

	}
			Object[] o=new Object[s.size()];
			s.toArray(o);
			for(int j=0;j<o.length;j++) {
				System.out.println(o[j]);
			}
	}
	

}
