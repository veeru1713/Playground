#include<stdio.h>
int main()
{
  float a,b,c,ta,dp,as;
  scanf("%f%f%f",&a,&b,&c);
  ta=a+b;
  dp=(c*ta)/100;
 as=ta-dp;
  printf("%0.2f\n%0.2f\n%0.2f",ta,as,dp);
}