#include<stdio.h>
int main()
{
  int i,j,k;
  scanf("%d%d",&i,&j);
  if(i<j)
    k=j-i+1;
  else
    k=i-j;
  printf("%d",k);
  
}