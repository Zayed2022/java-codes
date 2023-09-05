package java_lab;
import java.util.*;
class Msort{
	int n;
	int a[];
	Msort(int x){
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
	void Join(int low,int mid,int high){
		int h,i,j,k;
	     int b[]=new int[n];
	     h=low;
	     i=low;
	     j=mid+1;
	     while((h<=mid)&&(j<=high)){
	    	 if(a[h]<=a[j]){
	    		 b[i]=a[h];
	    		 h=h+1;
	    	 }
	    	 else{
	    		 b[i]=a[j];
	    		 j=j+1;
	    	 }
	    	 i=i+1;
	     }
	     if(h>mid){
	    	 for(k=j;k<=high;k++){
	    		 b[i]=a[k];
	    		 i=i+1;
	    	 }
	     }
	     else{
	    	 for(k=h;k<=mid;k++){
	    		 b[i]=a[k];
	    		 i=i+1;
	    	 }
	     }
	     for(k=low;k<=high;k++){
	    	 a[k]=b[k];
	     }
	}
	void Mergesort(int low,int high){
		if(low<high){
			int mid=(low+high)/2;
			Mergesort(low,mid);
			Mergesort(mid+1,high);
			Join(low,mid,high);
		}
	}
	
	void display(){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}System.out.println();
	}
	
}
public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
         System.out.println("enter the no of elements :");
         int x=s.nextInt();
        Msort q=new Msort(x);
        q.Genrate();
        long st=System.currentTimeMillis();
        q.Mergesort(0,q.n-1);
        long et=System.currentTimeMillis();
        double tt=et-st;
        System.out.println("sorted array:");
        q.display();
        System.out.println("time taken:"+tt);
	}

}
