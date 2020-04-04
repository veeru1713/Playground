#include<stdio.h>
int main()
{
  int wl,wb,fl,fb,sl,sb;
  scanf("%d%d%d%d%d%d",&wl,&wb,&fl,&fb,&sl,&sb);
  if((fl*fb)+(sl*sb)<=(wl*wb))
    printf("Raj can fix both painting");
  else
    printf("Raj cannot fix both painting");
}