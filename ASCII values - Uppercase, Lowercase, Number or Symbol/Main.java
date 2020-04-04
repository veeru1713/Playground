#include<stdio.h>
int main()
{
 char c;
  int v;
  scanf("%c",&c);
  v=(int)c;
  if(v>32 && v<48 || v>57 &&v<65 || v>90 &&v<97)
    printf("Symbol");
  else if(v>47&&v<58)
  	printf("Number");
  else if(v>64&&v<91)
    printf("Upper");
  else if(v>96&&v<123)
    printf("Lower");
  else
    printf("other keys");
}