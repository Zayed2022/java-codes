package java_lab;
import java.util.*;
class Student{
	String usn;
	String name;
	String programme;
	String phno;
	public Student(String usn,String name,String programme,String phno){
		this.usn=usn;
		this.name=name;
		this.programme=programme;
		this.phno=phno;
	}
}
class prg1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of students");
		int n=sc.nextInt();
		Student[] s=new Student[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the usn,name,programme and phno of student"+(i+1));
			String usn =sc.next();
			String name=sc.next();
			String programme=sc.next();
			String phno=sc.next();
			s[i]=new Student(usn,name,programme,phno);
			}
		System.out.println("USN\t\t\tNAME\t\t\tPROGRAMME\t\tPHONENO");
		for(int i=0;i<n;i++){
			System.out.println(s[i].usn+"\t\t"+s[i].name+"\t\t\t"+s[i].programme+"\t\t\t"+s[i].phno);
		}
	}
}
