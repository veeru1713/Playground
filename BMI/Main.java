#include<stdio.h>
int main()
{
  float w,h,bmi;
  scanf("%f%f",&w,&h);
  h=h/100;
  h=h*h;
  bmi=w/h;
  //printf("%f",bmi);
  if(bmi<18.5)
    printf("You are underweight. Have an apple daily.");
  else if(bmi>18.4 && bmi<25)
    printf("You are normal. Go walking daily and maintain it.");
  else
    printf("You are obese. Go to doctor");
}