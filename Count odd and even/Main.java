#include<stdio.h>
int main()
{
  int a[10],n,i,odd=0,even=0;
  scanf("%d",&n);
  for(i=0; i<n; i++)
    scanf("%d",&a[i]);
  for(i=0; i<n; i++)
  {
    if(a[i]%2==0)
      even++;
    else
      odd++;
  }
  printf("Odd: %d\nEven: %d",odd,even);
}