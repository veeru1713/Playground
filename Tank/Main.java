#include<stdio.h>
#define pi 3.142
int main()
{
  float r,h,l,hr,res;
  scanf("%f%f%f%f",&r,&h,&l,&hr);
  res=(2*pi*r*h)+(2*pi*(r*r));
  if(res<=l*hr)
    printf("The tank can be filled within %0.1f hours",hr);
  else
    printf("The tank cannot be filled within %0.1f hours",hr);
}