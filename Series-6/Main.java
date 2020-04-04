#include<stdio.h>
#include<math.h>
int main()
{
  int i,n,res;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=1; i<=n; i++)
  {
    res=pow(i,i);
    printf("%d ",res);
  }
}