#include<stdio.h>
void searchKey(int n, int a[10], int key)
{
 int i,flag=0;
  for(i=0; i<n; i++)
  {
   if(a[i]==key)
   {
     flag=1;
     printf("%d is present in the array\n",a[i]);
   }
  }
  if(flag!=1)
    printf("%d is not present in the array\n",key);
}
int main()
{
  int a[10],n,key,i;
  scanf("%d",&n);
  for(i=0; i<n; i++)
    scanf("%d",&a[i]);
  scanf("%d",&key);
 searchKey(n,a,key);
}