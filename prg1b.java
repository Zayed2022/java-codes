package java_lab;
import java.util.Scanner;
public class prg1b {
int top=-1;
int arr[]=new int[5];
Scanner s=new Scanner(System.in);
public void push(){
	System.out.println("enter the element");
    int ele=s.nextInt();
	if(top==5-1){
System.out.println("overflow");
return;
	}
	top++;
	arr[top]=ele;
}
public void pop(){
	if(top==-1){
		System.out.println("underflow");
		return;
	}
	int ele=arr[top--];
	System.out.println(ele+" deleted");
}
public void display(){
	if(top==-1){
		System.out.println("stack empty");
		return;
	}
	for(int i=0;i<=top;i++){
		System.out.print(arr[i]+" ");
	}System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prg1b obj=new prg1b();
		int ch;
	do{
		System.out.println("1.push\n2.pop\n3.display\n4.exit");
		System.out.println("enter the choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		switch(ch){
		case 1:
		       obj.push();
		       break;
		case 2:obj.pop();
		break;
		case 3:System.out.println("elements are :");
		       obj.display();
		       break;
		case 4:System.exit(0);
		break;
		default: System.out.println("invaild choice");
	            
		}
	}while(ch!=4);
	}
}
