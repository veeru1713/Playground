#include<stdio.h>
int main()
{
  char str[27];
  float cgpa;
  int reg,arr;
  scanf("%s%d%f%d",&str,&reg,&cgpa,&arr);
  if(cgpa>=7.0&&arr<=0)
    printf("Eligible to attend placement");
  else if(cgpa>=7.5&&arr<=2)
    printf("Eligible to attend placement");
  else
    printf("%s\n%d\nNot Eligible to attend placement",str,reg);
}