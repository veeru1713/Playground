#include<stdio.h>
void  removeDuplicate(int n, int a[10])
{
 int count=1,i,j,check=0,b[10];
  b[0]=a[i];
  for(i=0; i<n; i++)
  {
    for(j=i+1; j<n; j++)
    {
      if(b[i]==a[j])
        check=1;
    }
    if(check!=1)
      b[count++]=a[i];
    else
      check=0;
  }
  for(i=0; i<count-1; i++)
    printf("%d\n",b[i]);
}
int main()
{
  int a[10],n,i,dist;
  scanf("%d",&n);
  for(i=0; i<n; i++)
    scanf("%d",&a[i]);
   removeDuplicate(n,a);
  
}