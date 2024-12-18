/*
Q-5 Write a Java Program which accept string from user and display in reverse order.
    Input : marvellous
    Output: suollevram
*/


import java.util.*;

class LB_Assignment36_5
{
    public static void main(String A[])
    {
        String str = new String();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        StringDemo cobj = new StringDemo(str);
        cobj.Reverse();

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

    public void Reverse()
    {
        int i = 0;

        for(i = (this.str.length()-1); i >=0 ; i--)
        {
           System.out.print(str.charAt(i));
        }
    }
}