#include<stdio.h>
int main()
{
  int i,n,a=-40,b=-5,x=0;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=0; i<n; i++)
  {
   if(x==0)
   {
    x=1;
    a+=50;
    printf("%d ",a);
   }
   else
   {
     x=0;
    b+=10;
    printf("%d ",b);
   }
  }
  
}