#include<stdio.h>
#include<math.h>
int main()
{
  int i,n,res,x=0;
  printf("Enter n value");
  scanf("%d",&n);
  for(i=1; i<=n; i++)
  {
    if(x==0)
    {
     x=1;
     res=pow(i,3);
     printf("%d ",res);
    }
    else
    {
      x=0;
      res=pow(i,2);
      printf("%d ",res);
    }
  }
}