package java_lab;
import java.util.*;
class Sort{
	int a[];
	int n;
	Sort(int x){
	    n=x;
		a=new int[n];
	}
	void generate(){
		System.out.println("generating random no:");
		Random r=new Random();
		for(int i=0;i<n;i++){
			a[i]=r.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
       void insert(int arr[],int n){
	    	int i,j,k;
	    	for(i=0;i<n;i++){
	    		k=arr[i];	
	    		j=i-1;
	          while(j>=0&&arr[j]>k){
	        	 arr[j+1]=arr[j];
	        	 j=j-1;
	          }
	          arr[j+1]=k;
	    	}
	    }
}
public class Insertionsort {
  
    public static void print(int arr[],int n){
    	System.out.println("sorted array is :");
    	for(int i=0;i<n;i++){
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter how many elements you want");
		Scanner sc=new Scanner(System.in);
		int x =sc.nextInt();
		Sort q=new Sort(x);
		q.generate();
		long st=System.currentTimeMillis();
		q.insert(q.a, q.n);
		long et=System.currentTimeMillis();
		double tt=(et-st);
		System.out.println("sorted array:");
		print(q.a,q.n);
	    System.out.println("timt="+tt);
	}

}
