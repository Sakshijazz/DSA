package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnagramsInString438 {

	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result= new ArrayList<>();
        if(s.length() < p.length())
        {
            return result;
        }
        int[] smap= new int[26];
        int[] pmap= new int[26];
        for(char c: p.toCharArray())
        {
            pmap[c - 'a']++;
        }
        for(int i=0;i<p.length();i++)
        {
            smap[s.charAt(i) - 'a']++;
        }
        if(match(smap, pmap))
        {
            result.add(0);
        }
        for(int i=p.length();i<s.length();i++)
        {
            smap[s.charAt(i) - 'a']++;
            smap[s.charAt(i-p.length()) - 'a']--;
            if(match(smap, pmap))
            {
                result.add(i-p.length()+1);
            }
        }
        return result;
        
    }
    public static boolean match(int[]smap, int[]pmap)
    {
        for(int i=0;i<smap.length;i++)
        {
            if(smap[i] != pmap[i])
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the S string:");
	    String s=scan.nextLine();
	    System.out.println("Enter the P string:");
	    String p=scan.nextLine();
		System.out.println(findAnagrams(s, p));
	}

}
