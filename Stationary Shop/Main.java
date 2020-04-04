#include<stdio.h>
int main()
{
  char  str[20];
  int stock,rate,qty;
  scanf("%s%d%d%d",&str,&stock,&rate,&qty);
  if(qty<=stock)
  {
    printf("The amount for %d pencil is %d\n",qty,qty*rate);
    printf("Remaining number of pencils present in the stock: %d",stock-qty);
  }
  else
    printf("Out of stock");
}