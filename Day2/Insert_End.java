package Day2;


public class Insert_End {

	public static void insert(int arr[], int ele)
	{
		int [] arr2= new int[arr.length+1];
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i];
		}
		arr2[arr.length]=ele;
		for(int i=0;i<arr2.length;i++) 
		{	
			System.out.println(arr2[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4};
		insert(arr,5);
		
	}

}
