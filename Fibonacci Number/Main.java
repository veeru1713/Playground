#include<stdio.h>
#include<math.h>
int main()
{
  int n,s,s1;
  scanf("%d",&n);
  n=5*n*n+4;
  s=sqrt(n);
  s1=sqrt(n-4);
  if(n==s*s||n-4==s1*s1)
    printf("Fibonacci Number");
  else
    printf("Not Fibonacci Number");
}