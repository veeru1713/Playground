#include<stdio.h>
int main()
{
  int n,s,i;
  scanf("%d%d",&n,&s);
   
  if(2<=n && n<=100 && 1<=s &&s<=100)
  {
    int a[n];
    for(i=0; i<n; i++)
    	scanf("%d",&a[i]);
    printf("YES");
  }
  else
    printf("NO");
}