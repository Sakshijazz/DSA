package Day2;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}
	}
}
