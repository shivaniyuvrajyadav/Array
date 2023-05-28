//binary search an element that is 6
package Day9;
public class MiddleIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {6,4,9,2,8,5,1};
 int search=9;
 int li=0;
 int hi=a.length-1;
 int mi=(li+hi)/2;
 for(int i=0;i<a.length;i++)
 {
	 if(search==a[mi]) {
		 System.out.println("This is a Middle number index:"+mi);
		 break;
		 
	 }
	 else if(search>a[mi]){
		 li=mi+1;
//		 System.out.println("This is a Middle number");
		 }
	 else if(search<a[mi])
	 {
		 hi=mi-1;
	 }
	 mi=(li+hi)/2;
 
 if(li>hi)
 {
	 System.out.println(search+": Element is not Present");
	 break;
 }
 }}
 
	}

