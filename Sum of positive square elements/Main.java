#include<stdio.h>
#include<math.h>
int sumPositive(int a[10], int t)
{
  float sq;
  int c=0,i;
 for(i=0; i<t; i++)
 {
   sq=sqrt(a[i]);
   if(sq*sq==(int)a[i])
     c+=a[i];
 } 
  return c;
}
int main()
{
  int n,i,a[10],sq=0;
  scanf("%d",&n);
  for(i=0; i<n; i++)
    scanf("%d",&a[i]);
  sq=sumPositive(a,n);
  printf("%d",sq);
}