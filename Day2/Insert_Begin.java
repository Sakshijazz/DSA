package Day2;

public class Insert_Begin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4};
		int [] brr= new int[arr.length+1];
		brr[0]= 5;
		for(int i=0;i<arr.length;i++)
		{
			brr[i+1]=arr[i];
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.println(brr[i]);
		}
	}

}
