package Day7;

import java.util.Scanner;

public class FruitBasket904 {

	public static int totalFruit(int[] fruits) {
        int MaxCount=0, Count=0;
        int Type1= fruits[0], Type2=-1;
        int Pos1=0, Pos2=1;
        for(int i=Pos1;i<fruits.length;i++)
        {
            if(fruits[i]==Type1)
            {
                Pos1=i;
                Count++;
            }
            else if(fruits[i]==Type2)
            {
                Pos2=i;
                Count++;
            }
            else
            {
                if(Type2==-1)
                {
                    Type2=fruits[i];
                    Pos2=i;
                    Count++;
                }
                else
                {
                    MaxCount= Math.max(MaxCount,Count);
                    Type1=fruits[i-1];
                    Type2=fruits[i];
                    if(Pos1>Pos2)
                    {
                        int temp= Pos1;
                        Pos1= Pos2;
                        Pos2= temp;
                    }
                    Count= i-Pos1;
                    Pos1=Pos2;
                    Pos2=i;
                }
            }
        }
        MaxCount= Math.max(MaxCount,Count);
        return MaxCount;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n:");
		int n= scan.nextInt();
		int fruits[]= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
				fruits[i]= scan.nextInt();
		}
		System.out.println(totalFruit(fruits));
	}

}
