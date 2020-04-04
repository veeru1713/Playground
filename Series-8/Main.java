#include<stdio.h>
int main()
{
  int i=101,j,n,count=0;
  scanf("%d",&n);
  while(i>0)
  { 
  	for (  j = 2; j<=i/2; j++)
	{
	  if((i%j)==0)
        break;
      else
      {
        if(j==i/2)
        {
          printf("%d ",i);
          count++;
        }
      }
    }
    i++;
    if(count==n)
      break;
  }
}