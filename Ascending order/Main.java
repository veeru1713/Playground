#include<stdio.h>
int main()
{
  int a[10],n,i;
  scanf("%d",&n);
  for(i=0; i<n; i++)
    scanf("%d",&a[i]);
  sort(a,n);
  printf("Sorted array is:\n");
  for(i=0; i<n; i++)
    printf("%d\n",a[i]);
}
void sort(int a[10],int n)
{
 int i,j,t;
  for(i=0; i<n; i++)
    for(j=0; j<n; j++)
      if(a[i]<a[j])
      {
        t=a[i];
        a[i]=a[j];
        a[j]=t;
      }
}