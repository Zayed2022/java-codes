package java_lab;
import java.util.*;
public class NQueens {
	 static int []a;
     static int count;
	public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the no: of queens");
     int n=sc.nextInt();
     sc.close();
     a=new int[n+1];
     count=0;
     queen(n);
     System.out.println("\n Total solutions="+count);
	}
	static boolean place(int pos){
		for(int i=1;i<pos;i++){
			if((a[i]==a[pos])||(Math.abs(a[i]-a[pos])==Math.abs(i-pos))){
				return false;
			}
		}return true;
	}
	static void print_sol(int n){
		count++;
		System.out.println("\n\n solution#"+count+":\n");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(a[i]==j){
					System.out.print("Q"+i+"\t");
				}else{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
	}
	static void queen(int n){
		int k=1;
		a[k]=0;
		while(k!=0){
			a[k]=a[k]+1;
			while((a[k]<=n)&&!place(k)){
				a[k]++;
			}
			if(a[k]<=n){
				if(k==n){
					print_sol(n);
				}else{
					k++;
					a[k]=0;
				}
			}else{
				k--;
			}
		}
	}
}
