package Day2;

public class Delete_End {

	public static void delete(int arr[])
	{
		int arr2[] = new int [arr.length-1];
		for(int i=0;i<arr.length-1;i++)
		{
			arr2[i]=arr[i];
		}
		for(int i=0;i<arr2.length;i++) 
		{	
			System.out.println(arr2[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[] {1,2,3,4};
		delete(arr);
	}

}
