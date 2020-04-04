#include<stdio.h>
int main()
{
  float x1,x2,x3,y1,y2,y3,x,y;
  scanf("%f%f%f%f%f%f",&x1,&y1,&x2,&y2,&x3,&y3);
  x=(x1+x2+x3)/3;
  y=(y1+y2+y3)/3;
  printf("%0.1f\n",x);
  printf("%0.1f\n",y);
}