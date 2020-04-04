#include<stdio.h>
int main()
{
 int units;
  int r;
  scanf("%d",&units);
  if(units<=200)
  {
    r=units*0.5;
    printf("Rs.%d",r);
  }
  else if(units<=400)
  {
    r=units*0.65+100+1;
    printf("Rs.%d",r);
  }
  else if(units<=600)
  {
    r=units*0.80+200;
    printf("Rs.%d",r);
  }
  else
  {
    r=units*1.25+425;
    printf("Rs.%d",r);
  }
  
}