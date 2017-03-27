import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
	System.out.println(answer(in.nextLine(),in.nextLine()));
	}
	private static int answer(String str1,String str2)
	{
		int l1=str1.length();		
		int l2=str2.length();
		int [][]table=new int[l1+1][l2+1];
		for(int i=l1-1;i>=0;i--)
		{
			for(int j=l2-1;j>=0;j--)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					table[i][j]=1+table[i+1][j+1];
				}
				else 
				{
					table[i][j]=Math.max(table[i][j+1],table[i+1][j]);
				}
			}
		}
		return table[0][0];
	}
}
