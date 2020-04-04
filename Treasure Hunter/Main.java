#include<stdio.h>
int main()
{
  int a,b,c,ta,sa,d;
  scanf("%d%d%d",&a,&b,&c);
  ta=(a*b)/100;
  sa=(c*(a-ta))/100;
  d=(a-(ta+sa))/3;
  printf("%d\n%d\n%d\n",ta,sa,d);
}