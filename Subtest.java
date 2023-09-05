package java_lab;
import java.util.*;
class Sub{
	int i;
	int m,n,tsum;
	int x[]=new int [10];
	int w[]=new int [10];
    Scanner  sc=new Scanner(System.in);
   public void input(){
	   tsum=0;
	   System.out.println("Enter the size of set\n");
	   n=sc.nextInt();
	   System.out.println("Enter the elements of the set ");
	   for(i=1;i<=n;i++){
		   w[i]=sc.nextInt();
	   }
	   System.out.println("Enter the sum\n");
	   m=sc.nextInt();
	   for(i=1;i<=n;i++)
		   tsum=tsum+w[i];
	   System.out.println("the subset are\n");
	   subset(0,1,tsum);
	   if(m>tsum || m<w[1]){
		   System.out.println("no solution\n");
		   System.exit(0);
	   }
   }
   public void subset(int sum,int k,int r){
	   x[k]=1;
	   if(sum+w[k]==m){
		   for(int i=1;i<=k;i++)
			   if(x[i]==1)
				   System.out.print(w[i]+"\t");
		       System.out.print("\n");
	   }
	   else if((sum+w[k]+w[k+1])<=m)
		   subset(sum+w[k],k+1,r-w[k]);
	   if((sum+r-w[k]>=m)&&((sum+w[k+1])<=m)){
		   x[k]=0;
		   subset(sum,k+1,r-w[k]);
	   }
   }
}
public class Subtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int k=1;
         Sub s1=new Sub();
         s1.input();
	}
}