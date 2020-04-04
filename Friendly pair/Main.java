#include<stdio.h>
int main()
{
  int sum=0,i,n,n1,sum1=0;
  scanf("%d%d",&n,&n1);
  for(i=1; i<n; i++)
  {
   if(n%i==0)
     sum+=i;
  }
  for(i=1; i<n1; i++)
  {
   if(n%i==0)
     sum+=i;
  }
  if(sum/n!=sum1/n1)
    printf("Friendly Pair");
  else
    printf("Not Friendly Pair");
}