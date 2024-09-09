package Day6;

import java.util.Scanner;

public class MaxNumOfVowelInSubstring1456 {

	public static int maxVowels(String s, int k) {
        int i=0, j=0;
        int count=0, max=0;
        char [] str= s.toCharArray();
        while(j<s.length())
        {
            if(Vowel(str[j]))
            {
                count++;
            }
            if(j-i+1<k)
            {
                j++;
            }
            else
            {
                max=Math.max(max,count);
                if(Vowel(str[i]))
                {
                    count--;
                }
                i++;
                j++;
            }
        }
        return max;
    }
    public static boolean Vowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n:");
		int n= scan.nextInt();
		String s;
		
		System.out.println("Enter the k:");
		int k= scan.nextInt();
		System.out.println("Enter the string:");
		s=scan.next();
		System.out.println(maxVowels(s,k));
	}

}
