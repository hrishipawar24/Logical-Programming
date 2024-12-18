/*
Q-1 Write a Java Program which accept string from user and count number of capital characters.
    Input : Marvellous Multi OS.
    Output: 4
*/


import java.util.*;

class LB_Assignment36_1
{
    public static void main(String A[])
    {
        int iRet = 0;
        String str = new String();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        StringDemo cobj = new StringDemo(str);
        iRet = cobj.CountCapital();

        System.out.println("Number of Capital Characters are : "+iRet);

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

    public int CountCapital()
    {
        int i = 0;
        int iCount = 0;
        for(i = 0; i < this.str.length(); i++)
        {
            if(this.str.charAt(i)>='A' && this.str.charAt(i)<='Z')               
             //(str.charAt(i) to access the characters of the string 
            {
                iCount++;
            }
        }
        return iCount;
    }
}