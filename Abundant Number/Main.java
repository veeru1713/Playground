#include<stdio.h>
int main()
{
  int sum=0,i,n;
  scanf("%d",&n);
  for(i=1; i<n; i++)
  {
   if(n%i==0)
     sum+=i;
  }
  if(sum>n)
    printf("Abundant Number");
  else
    printf("Not Abundant Number");
}