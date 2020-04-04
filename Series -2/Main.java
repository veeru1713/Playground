#include<stdio.h>
int main()
{
  int i,fib=0,n,prev=0,cur=1;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=1; i<=n; i++)
  {
    fib=prev+cur;
    prev=cur;
    cur=fib;
    printf("%d ",fib);
  }
}