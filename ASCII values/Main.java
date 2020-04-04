#include<stdio.h>
int main()
{
  int a;
  char c;
  scanf("%c",&c);
  a=(int)c;
  if(a>=65 && a<=90)
    printf("ASCII of %c is %d",c,a);
  else
    printf("ASCII of %c is %d",c,a);
}