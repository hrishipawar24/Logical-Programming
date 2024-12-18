/*
Q-2 Write a Java Program which accept string from user and count number of small characters.
    Input : Marvellous Multi OS.
    Output: 9
*/


import java.util.*;

class LB_Assignment36_2
{
    public static void main(String A[])
    {
        int iRet = 0;
        String str = new String();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        StringDemo cobj = new StringDemo(str);
        iRet = cobj.CountSmall();

        System.out.println("Number of Small Characters are : "+iRet);

        sobj.close();
    }
}

class StringDemo
{
    public String str;
    
    StringDemo(String A)
    {
        this.str = A;
    }

    public int CountSmall()
    {
        int i = 0;
        int iCount = 0;
        for(i = 0; i < this.str.length(); i++)
        {
            if(this.str.charAt(i)>='a' && this.str.charAt(i)<='z')                
            {
                iCount++;
            }
        }
        return iCount;
    }
}