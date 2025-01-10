/*4. Write a program which accept number from user and return summation of all its
non factors.
Input  : 12
Output : 50
Input  : 10
Output : 37  */

#include <stdio.h>

int SumNonFact(int iNo)
{
    int i = 1, sum = 0;

    while (i <= iNo)
    {
        if (iNo % i != 0)
        {
            sum += i;
        }
        i++;
    }

    return sum;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = SumNonFact(iValue);

    printf("Sum of non-factors: %d\n", iRet);

    return 0;
}