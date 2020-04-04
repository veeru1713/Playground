#include<stdio.h>
int main()
{
  int sal,hotel,bank,food,parent;
  scanf("%d%d%d%d%d",&sal,&hotel,&bank,&food,&parent);
  if((hotel+bank+food+parent)<=sal)
    printf("He can save the money");
  else
    printf("He has to work hard");
}