#include<stdio.h>
int main()
{
  int i,n,res=-1,d=1;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=0; i<n; i++)
  {
   res+=d;
    d+=2;
    printf("%d ",res);
  }
}