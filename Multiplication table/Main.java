#include<stdio.h>
int main()
{
  int i,j,n,n1; 
  scanf("%d%d",&n,&n1);
  for(i=n; i<=n; i++)
    for(j=1; j<=n1; j++)
      printf("%d * %d = %d\n",i,j,i*j);
}