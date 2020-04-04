#include<stdio.h>
int main()
{
  int i,n,res=3,d=1;
  scanf("%d",&n);
  printf("2 ");
  for(i=0; i<n-1; i++)
  {
   res+=d;
    d+=2;
    if(i!=3)
    printf("%d ",res);
    else
      printf("%d",res+2);
  }
}