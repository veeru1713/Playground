#include<stdio.h>
int prime(int num, int i)
{
  if (i == 1)
    {
        return 1;
    }
    else
    {
       if (num % i == 0)
       {
         return 0;
       }
       else
       {
         return prime(num, i - 1);
       }       
    }
}
int main()
{
  int n,flag;
  scanf("%d",&n);
  flag=prime(n,n/2);
  if(flag==1)
  printf("%d is a prime number",n);
  else
    printf("%d is not a prime numer",n);
}
