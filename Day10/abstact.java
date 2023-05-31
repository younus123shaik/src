package Day10;
import java.util.ArrayList;
import java.util.ListIterator;
public class abstact {
	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("arpita");
		arr.add("tejashwini");
		arr.add("vinod");
		arr.add("kiran");
		 arr.add("rajeshwari");
		ListIterator ar= arr.listIterator();
		System.out.println(arr);
		while(ar.hasNext()) {
			
			if(ar.next().equals("vinod")) {
				ar.remove();
				break;
				
			}
			}
		System.out.println(arr);
		
		
		
	}
}
