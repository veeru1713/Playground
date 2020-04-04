#include<stdio.h>
#include<math.h>
int main()
{
  int d,n,sum,temp;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
   d=n%10;
   n/=10;
   d=pow(d,3);
   sum+=d;
  }
  if(temp==sum)
    printf("Armstrong Number");
  else
    printf("Not Armstrong Number");
}