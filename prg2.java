 package java_lab;
import java.util.*;
class Customer{
	String name;
	String dob;
	Scanner s=new Scanner(System.in);
	void getdata(){
		System.out.println("enter customer name");
		name=s.next();
		System.out.println("enter the dob in dd:mm:yyyy format");
		dob=s.next();
	}				
	void putdata(){
		System.out.println("name:"+name);
		 StringTokenizer st = new StringTokenizer(dob,":");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	}
}
public class prg2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Customer c=new Customer();
          c.getdata();
          c.putdata();
	}

}
