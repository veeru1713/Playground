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
    sum*=10;
  }
 sum/=10;
  if(temp==sum)
    printf("Same");
  else
    printf("Not Same");
}