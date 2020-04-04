#include<stdio.h>
int main()
{
  int p,t,r;
  float i,a,d,s;
  scanf("%d%d%d",&p,&t,&r);
  (float)p;
  (float)t;
  (float)r;
  i=(p*t*r)/100;
  a=p+i;
  d=2*i/100;
  s=a-d;
  printf("%0.2f\n",i);
  printf("%0.2f\n",a);
  printf("%0.2f\n",d);
  printf("%0.2f\n",s);
}