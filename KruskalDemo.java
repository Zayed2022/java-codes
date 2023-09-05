package java_lab;
import java.util.*;
class Kruskal{
	int n,c[][],st[][],par[];
	void read(){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number of vertices:");
		n=s.nextInt();
		c=new int[n+1][n+1];
		par=new int [n+1];
		System.out.println("Enter the cost adjacency matrix:");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				c[i][j]=s.nextInt();
		for(int i=1;i<=n;i++)
		par[i]=i;		
	}
	int find(int i){
		i=par[i];
		return i;
	}
	void unions(int i,int j){
		par[j]=i;
	}
	void algo(){
		int mincost=0,e=0,min,u=0,v=0,a,b;
		st=new int [n+1][n+1];
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
			st[i][j]=c[i][j];
		System.out.println("minimum cost spaning tree:");
		while(e!=n-1){
			min=999;
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(min>st[i][j]){
						min=st[i][j];
						u=i;
						v=j;
					}
			System.out.println(u+"->"+v);
			st[u][v]=999;
			a=find(u);
			b=find(v);
			if(a!=b){
				e++;
				System.out.print(e+":");
				System.out.println(u+"->"+v+"cost"+min);
				unions(a,b);
			    mincost=mincost+min;
			}
			else
				System.out.println(u+"->"+v+"rejected:forms a cycle");
			
	}
		System.out.println("cost of spanningtree:"+mincost);
}
}
public class KruskalDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Kruskal k=new Kruskal();
        k.read();
        k.algo();
	}
}
