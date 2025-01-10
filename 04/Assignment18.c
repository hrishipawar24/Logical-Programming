/*Write a program which accept number from user and display all its non factors.
Input: 12
Output : 5 7 8 9 10 11
Input : 13
Output : 2 3 4 5 6 7 8 9 10 11 12
Input : 10
Output : 3 6 7 8 9 */
#include <stdio.h>

void NonFact(int iNo)
{
    int i = 1;

    while (i <= iNo)
    {
        if (iNo % i != 0)
        {
            printf("%d ", i);
        }
        i++;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    NonFact(iValue);

    return 0;
}