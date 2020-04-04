#include<stdio.h>
int main()
{
  int m,y;
  scanf("%d%d",&m,&y);
  switch(m)
  {
    case    3 : printf("Number of days is 31");break;
    case 2 : printf("Number of days is 28");break;
  }
}