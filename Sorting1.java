import java.util.*;
class Sorting1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		insertionSort(n,arr);
	}
	
	static void insertionSort(int n,int arr[]){
		int flag=0;
		int x=arr[n-1];//2 4 6 8 3
					   //0 1 2 3 4
		for(int i=(n-2);i>=-1;i--){
			if(i!=-1){
				if(x<arr[i])
					arr[i+1]=arr[i];
				else{
				arr[i+1]=x;
				flag++;
				}
			}else{
				arr[0]=x;
			}
			
			for(int k=0;k<n;k++){
				System.out.print(arr[k]+" ");
			}
			System.out.println(" ");
			if(flag>0){
				break;
			}
			
		 }
		}

}