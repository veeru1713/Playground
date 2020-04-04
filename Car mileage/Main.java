#include<stdio.h>
int main()
{
  float m;
  int l,d;
  scanf("%f%d%d",&m,&l,&d);
  if(m*l>=d)
    printf("Can reach");
  else
    printf("Cannot reach");
}