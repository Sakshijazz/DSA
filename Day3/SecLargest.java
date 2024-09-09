package Day3;

public class SecLargest {
	public static void second(int a[]){
		{
			int l=a[0];
			int secl=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>l)
				{
					secl=l;
					l=a[i];
				}
				else if(a[i]>secl)
				{
					secl=a[i];
				}
			}
			System.out.println("Second Largest: "+secl);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= new int[] {1,2,3,5,4};
		second(a);
	}

}
