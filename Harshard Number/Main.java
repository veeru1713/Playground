#include<stdio.h>
int main()
{
  int d,n,sum,temp;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
   d=n%10;
   n/=10;
   sum+=d;
  }
  if(temp%sum==0)
    printf("Harshard Number");
  else
    printf("Not Harshard Number");
}