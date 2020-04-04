#include<stdio.h>
int main()
{
  int c;
  scanf("%d",&c);
  switch(c)
  {
    case 0 : printf("Zero");break;  
    case 1 : printf("TWO"); break; 
    case 2 : printf("THREE");   break;
    case 3 : printf("FOUR");  break;
    case 4 : printf("ONE");  break;
    case 5 : printf("Five");  break;
    case 6 : printf("SIX");  break;
    case 7 : printf("SEVEN");  break;
    case 8 : printf("EIGHT");  break; 
    case 9 : printf("NINE");  break;
    default : printf("Invalid Input");
  }
}