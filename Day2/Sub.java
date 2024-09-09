package Day2;

import java.util.Scanner;

public class Sub {
	 public static int[] insert(int arr[], int element) 
	 	{
		        int[] brr = new int[arr.length + 1];
		        brr[0] = element;
		        for (int i = 0; i < arr.length; i++)
		        {
		            brr[i + 1] = arr[i];
		        }
		        return brr;
		    }

		    public static void main(String [] args) {
		    {
		        Scanner scan = new Scanner(System.in);
		        
		        System.out.println("Enter no. of elements:");
		        int x = scan.nextInt();
		        int arr1[] = new int[x];
		        
		        System.out.println("Enter array1:");
		        for (int i = 0; i < x; i++) {
		            arr1[i] = scan.nextInt();
		        }
		        System.out.println("Enter no. of elements:");
		        int y = scan.nextInt();
		        int arr2[] = new int[y];
		        System.out.println("Enter array2:");
		        for (int i = 0; i < y; i++) {
		            arr2[i] = scan.nextInt();
		        }

		        int[] result = new int[x]; 
		        int i = x - 1; 
		        int j = y - 1; 
		        int k = x - 1; 
		        int borrow = 0; 

		        while (j >= 0) {
		            int sub = arr1[i] - arr2[j] - borrow;
		            if (sub < 0) {
		                sub += 10;
		                borrow = 1;
		            } else {
		                borrow = 0;
		            }
		            result[k] = sub;
		            i--;
		            j--;
		            k--;
		        }

		        while (i >= 0) {
		            int sub = arr1[i] - borrow;
		            if (sub < 0) {
		                sub += 10;
		                borrow = 1;
		            } else {
		                borrow = 0;
		            }
		            result[k] = sub;
		            i--;
		            k--;
		        }

		        int idx = 0;
		        while (idx < result.length - 1 && result[idx] == 0) {
		            idx++;
		        }

		       
		        System.out.print("Resulting array: ");
		        for (int index = idx; index < result.length; index++) {
		            System.out.print(result[index] + " ");
		        }

		        if (idx == result.length) {
		            System.out.print("0");
		        }
		    }
		}

	}
