#include<stdio.h>
int main()
{
  int prev=0,cur=1,fib,i,n;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=0; i<n; i++)
  {
   fib=prev*cur;
    prev=cur;
    cur++;
    printf("%d ",fib);
  }
}