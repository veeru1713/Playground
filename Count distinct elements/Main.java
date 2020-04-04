#include<stdio.h>
int distinctElement(int n, int a[10])
{
 int count=0,i,j,check=0;
  for(i=0; i<n; i++)
  {
    for(j=i+1; j<n; j++)
    {
      if(a[i]==a[j])
        check=1;
    }
    if(check!=1)
      count++;
    else
      check=0;
  }
  return count;
}
int main()
{
  int a[10],n,i,dist;
  scanf("%d",&n);
  for(i=0; i<n; i++)
    scanf("%d",&a[i]);
  dist=distinctElement(n,a); 
  printf("There are %d distinct elements in the array.",dist);
}