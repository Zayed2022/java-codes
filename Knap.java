package java_lab;
import java.util.*;
class Knaptest{
	int n,m;
	int v[][]=new int[10][10];
	int p[]=new int[10];
	int w[]=new int[10];
	void input(){
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no: of objects\n");
		n=s.nextInt();
		for(i=1;i<=n;i++){
			System.out.println("Enter the weights and profits of"+i+" objects");
			w[i]=s.nextInt();
			p[i]=s.nextInt();
		}
		System.out.println("enter the capacity of knapsack:");
		m=s.nextInt();
	}
	void output(){
		int i,j,x[];
		x=new int [10];
		System.out.println("The optimal solution matrix is:");
		for(i=0;i<=n;i++){
			for(j=0;j<=m;j++){
				System.out.print(v[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("objects selected are :");
		for(i=1;i<=n;i++)
			if(x[i]==1)
				System.out.println(i);
	}
	int max(int a,int b){
		if(a>b){
			return a;
		}else
			return b;
	}
	void opt_sol(){
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=m;j++){
				if(i==0||j==0)
					v[i][j]=0;
				else if(j<w[i])
					v[i][j]=v[i-1][j];
				else
					v[i][j]=max(v[i-1][j],(v[i-1][j-w[i]]+p[i]));
			}
		}
	}
	}
public class Knap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Knaptest kt =new Knaptest();
          kt.input();
          kt.opt_sol();
         
	}

}
