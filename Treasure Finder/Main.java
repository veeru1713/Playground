#include<stdio.h>
int main()
{
  int f,s,t;
  scanf("%d%d%d",&f,&s,&t);
  if(f*2==s)
  {
    printf("The treasure is in the box which has number %d.\n",s);
    printf("The code to open the box is %d.",f);
  }
  else
  {
    printf("The treasure is in the box which has number %d.\n",t);
    printf("The code to open the box is %d.",f);
  }
}