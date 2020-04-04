#include<stdio.h>
int main()
{
  int n,n1,i,a[10],b[10],sum1=0,sum2=0;
 scanf("%d",&n);
  scanf("%d",&n1);
   for(i=0; i<n; i++)
    scanf("%d",&a[i]);
    for(i=0; i<n; i++)
    scanf("%d",&b[i]);
  for(i=0; i<n; i++)
    sum1+=a[i];
  for(i=0; i<n; i++)
    sum2+=b[i];
  if(sum1==sum2)
    printf("Same");
  else
    printf("Not Same");
}
