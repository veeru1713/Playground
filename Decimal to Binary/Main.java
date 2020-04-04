#include<stdio.h>

int main()
{
  int n,d,i,c=0;
  int bin[100];
  scanf("%d",&n);
  while(n>0)
  {
   d=n%2;
   n=n/2;
   bin[c++]=d;
  }
  
  for(i=c-1; i>=0; i--)
  {
    printf("%d",bin[i]);
  }
}