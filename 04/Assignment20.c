/*5. Write a program which accept number from user and return difference between
summation of all its factors and non
Input  : 12
Output :-34 (16 - 50)
Input  : 10
Output :-29 (8- 37)

*/

#include <stdio.h>

int FactDiff(int iNo)
{
    int i = 1, sum_factors = 0, sum_non_factors = 0;

    while (i <= iNo)
    {
        if (iNo % i == 0)
        {
            sum_factors += i;
        }
        else
        {
            sum_non_factors += i;
        }
        i++;
    }

    return sum_factors - sum_non_factors;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    iRet = FactDiff(iValue);

    printf("Difference between factors and non-factors: %d\n", iRet);

    return 0;
}