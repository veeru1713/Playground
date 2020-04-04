#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  if((n*n)%10==n)
    printf("Automorphic Number");
  else
    printf("Not Automorphic Number");
}