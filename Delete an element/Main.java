#include<stdio.h>
int main()
{
  int a[5],n,ele,i;
  scanf("%d",&n);
  for(i=0; i<n; i++)
    scanf("%d",&a[i]);
  scanf("%d",&ele);
  printf("Array after deletion is:\n");
  for(i=0; i<n; i++)
  {
    if(a[i]!=ele)
    	printf("%d\n",a[i]);
  }
}