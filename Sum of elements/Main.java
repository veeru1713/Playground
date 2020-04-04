#include<stdio.h>
void sumOfElements(int a[], int n)
{
  int i,sum=0;
  for(i=0; i<n; i++)
  {
   sum+=a[i];
  }
  printf("%d",sum);
}
int main()
{
  int a[10],n,i,max=0;
  scanf("%d",&n);
  for(i=0; i<n; i++)
    scanf("%d",&a[i]);
  sumOfElements(a,n);
  
}