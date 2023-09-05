package java_lab;
//import java.util.*;
public class Selectionsort {
    public static void Sort(int arr[]){
    	int n=arr.length;
    	int minidx;
    	for(int i=0;i<n-1;i++){
    		minidx=i;
    		for(int j=i+1;j<n;j++){
    			if(arr[j]<arr[minidx]){
    				int temp=arr[j];
    				arr[j]=arr[minidx];
    				arr[minidx]=temp;
    			}
    		}
    	}
    }
    public static void print(int arr[],int n){
    	System.out.println("sorted array is :");
    	for(int i=0;i<n;i++){
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
    public static void BSort(int arr[]){
    	int n=arr.length;
    	//int minidx;
    	for(int i=0;i<n;i++){
    		//minidx=i;
    		for(int j=0;j<n-1;j++){
    			if(arr[j+1]<arr[j]){
    				int temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
    	System.out.println("sorted array is :");
    	for(int i=0;i<n;i++){
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]={39,12,6,21,2,67,34};
		//int arr[]={12,6,21,2,34};
        int n=arr.length;
       long st=System.currentTimeMillis();
       Sort(arr);
       long et=System.currentTimeMillis();
       double dif=et-st;
       print(arr,n);
      // BSort(arr);
       System.out.println(dif);
	}

}
