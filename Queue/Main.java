#include<stdio.h>
void queue(int n,int m,int ai[n])
{
  int count=0,sum=0,i;
  for(i=0; i<n; i++)
  {
    sum+=ai[i];
    count++;
    if(n+m==sum)
    {
     printf("%d",count); 
    }
  }
}
int main()
{
  int n,m,i;
  scanf("%d%d",&n,&m);
  if(1<=n && m<=100)
  {
    int ai[n];
    for(i=0; i<n; i++)
      scanf("%d",&ai[i]);
     queue(n,m,ai);
  }
  return 0;
}