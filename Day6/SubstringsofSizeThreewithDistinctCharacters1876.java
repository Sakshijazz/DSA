package Day6;

import java.util.Scanner;

public class SubstringsofSizeThreewithDistinctCharacters1876 {

	public static int countGoodSubstrings(String s) {
        int count=0;
        char []chars= s.toCharArray();
        for(int i=0;i<s.length()-2;i++)
        {
            if(chars[i]!=chars[i+1] && chars[i+1]!=chars[i+2] && chars[i]!=chars[i+2])
                {
                    count++;
                }
        }
        return count;
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
		System.out.println(countGoodSubstrings(s));
	}

}
