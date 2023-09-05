package java_lab;
import java.util.*;
class Staff{
	String name,phno,id;
	float sal;
	Scanner s=new Scanner(System.in);
	void Readinfo(){
		System.out.println("enter the staff id:");
		id=s.next();
		System.out.println("enter the staff name:");
		name=s.next();
		System.out.println("enter the staff phno:");
		phno=s.next();
		System.out.println("enter the staff salary:");
		sal=s.nextFloat();
	}
	void Disp(){
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
		System.out.println("phno:"+phno);
		System.out.println("salary:"+sal);
	}
}
class Teaching extends Staff{
	String domain,pub;
	Teaching(){
		System.out.println("enter the teaching staff details");
		Readinfo();
		System.out.println("Enters the domian:");
		domain=s.next();
		System.out.println("Enters the publications:");
		pub=s.next();
	}
	void Dispteach(){
		System.out.println("----------the Teaching staff details------------");
		Disp();
		System.out.println("domain"+domain);
		System.out.println("publications"+pub);
	}
}
class Technical extends Staff{
	String sk[];
	int n;
	Technical(){
		System.out.println("enter the technical staff details");
		Readinfo();
		System.out.println("Enters the no: of skills:");
		n=s.nextInt();
	    sk=new String[n];
		System.out.println("Enter the "+n+" skills:");
		for(int i=0;i<n;i++)
		sk[i]=s.next();
	}
	void Disptech(){
		System.out.println("----------the technical staff details------------");
		Disp();
		System.out.print("skills:");
		for(int i=0;i<n;i++){
		System.out.print(sk[i]+" ");}
		System.out.println();
	}
}
class Contract extends Staff{
	int period;
	Contract(){
		System.out.println("enter the Contract staff details");
		Readinfo();
		System.out.println("Enters the period:");
		period=s.nextInt();
	}
	void DispCont(){
		System.out.println("----------the Contract staff details------------");
		Disp();
		System.out.println("period:"+period);
	}
}

 class StaffDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teaching t=new Teaching();
		Technical t1=new Technical();	
		Contract c=new Contract();
		t.Dispteach();
		t1.Disptech();
		c.DispCont();
	}

}
