#include<stdio.h>
int main()
{
  int n,evenSum=0,oddSum=1,c1=0,c2=-1;
  float avg1,avg2;
   
  while(n!=-1)
  {
    scanf("%d",&n);
    if(n%2==0)
    {
      evenSum+=n;
      c1++;
    }
    else
    {
     oddSum+=n;
     c2++;
    }
  }
  avg1=(float)evenSum/(float)c1;
  avg2=(float)oddSum/(float)c2;
  printf("%d\n%d\n%0.2f\n%0.2f",evenSum,oddSum,avg1,avg2);
}