package java_lab;
import java.util.*;
 class Qsort{
	int n;
	int a[];
	Qsort(int x){
		n=x;
		a=new int[n];
	}
	void Genrate(){
		System.out.println("Generating N random noS:......");
		Random r=new Random();
		for(int i=0;i<n;i++){
			a[i]=r.nextInt(20);
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	int Partion(int a[],int lb,int ub){
		int x,down,up,temp;
		x=a[lb];
		down=lb;
		up=ub;
		while(down<up){
			while((a[down]<=x)&&(down<up))
				down++;
			while(a[up]>x)
				up--;
			if(down<up){
				temp=a[down];
				a[down]=a[up];
				a[up]=temp;
			}
		}
		a[lb]=a[up];
		a[up]=x; 
		return up;
	}
	void qsort(int a[],int lb,int ub){
		if(lb<ub){
			int j=Partion(a,lb,ub);
			qsort(a,lb,j-1);
			qsort(a,j+1,ub);
		}
	}
	void display(){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" "); 
		}System.out.println();
	}
}
public class Quicksort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.println("enter the no of elements :");
         int x=s.nextInt();
        Qsort q=new Qsort(x);
        q.Genrate();
        long st=System.currentTimeMillis();
        q.qsort(q.a, 0, q.n-1);
        long et=System.currentTimeMillis();
        double tt=et-st;
        q.display();
        System.out.println("time taken:"+tt);
	}
}
