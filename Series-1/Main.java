#include<stdio.h>
int main()
{
  int i,x=0,n,d=4;
  scanf("%d",&n);
  for(i=0; i<n; i++)
  {
       if(x==0)
       {
         x=1;
         d+=3;
         printf("%d ",d);
       }
        else
        {
          x=0;
          d-=2;
          printf("%d ",d);
        }
   }
}