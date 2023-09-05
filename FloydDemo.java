package java_lab;
import java.util.*;
class floyd{
	int a[][]=new int[10] [10];
	int d[][][]=new int[10][10][10];
	int n;
	void read(){
		int i,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no: of vertices\n");
		n=scan.nextInt();
		System.out.println("enter the adjacency matrix\n");
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				a[i][j]=scan.nextInt();
	}
	void write(){
		int i,j;
		System.out.println("computing all pairs shaotest path:");
		for(int k=0;k<=n;k++){
			System.out.println("d["+k+"]<<=<<\n");
			for(i=1;i<=n;i++){
				for(j=1;j<=n;j++){
					System.out.print(d[k][i][j]+"\t");
				}
				System.out.println();
			}
		}
	}
	void floyds(){
		int i,j,k;
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				d[0][i][j]=a[i][j];
			}
		}
		for(k=1;k<=n;k++){
			for(i=1;i<=n;i++)
				for(j=1;j<=n;j++)
			d[k][i][j]=min(d[k-1][i][j],(d[k-1][i][k]+d[k-1][k][j]));
		}
	}
	int min(int a,int b){
		if(a<b){
			return a;
		}else
			return b;
	}
}
public class FloydDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          floyd f=new floyd();
          f.read();
          f.floyds();
          f.write();
	}

}
