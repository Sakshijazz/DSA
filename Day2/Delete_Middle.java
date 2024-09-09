package Day2;

public class Delete_Middle {

	public static void middle(int arr[], int del)
	{
		int arr2[] = new int [arr.length-1];
		for(int i=0;i<del;i++)
		{
			arr2[i]=arr[i];
		}
		for(int i=del+1;i<arr.length;i++)
		{
			arr2[i-1]=arr[i];
		}
		for(int i=0;i<arr2.length;i++) 
		{	
			System.out.println(arr2[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int [] {1,2,3,4,5};
		middle(arr,3);
	}

}
