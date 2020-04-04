#include<stdio.h>
int main()
{
 int sum=1,n;
  do
  {
    scanf("%d",&n);
    sum+=n;
  }while(n!=-1);
  printf("%d",sum);
}