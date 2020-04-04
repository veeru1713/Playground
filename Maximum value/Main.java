#include<stdio.h>
int main()
{
  int a[10],n,i,max=0;
  scanf("%d",&n);
  for(i=0; i<n; i++)
    scanf("%d",&a[i]);
  a[0]=max;
  for(i=1; i<n; i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  printf("%d",max);
}