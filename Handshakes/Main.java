#include<stdio.h>
int main()
{
  int i ,probablity=0,n;
  scanf("%d",&n);
  for(i=1; i<n; i++)
  {
   probablity+=i; 
  }
  printf("%d",probablity);
}