#include<stdio.h>
int main()
{
int balls,runs,runs_scored,balls_bowled;
  float overs,f_overs,crr,rrr,a,b,c,d;
  scanf("%d%d%d%d%d",&balls,&runs,&runs_scored,&balls_bowled);
  a = (float)balls_bowled;
  b = (float)runs_scored;
  c = (float)balls-a;
  d = (float)runs-b;
 // printf("%f\t%f\n",a,b);
  overs=(balls%6)/10.0+(balls/6);
  f_overs=(balls_bowled%6)/10.0+(balls_bowled/6);
  crr=b/a*6.0;
  rrr=d/c*6;
  if(crr>rrr)
  {
  	printf("%0.0f\n",overs);
  	printf("%0.1f\n",f_overs);
  	printf("%0.1f\n",crr+0.3);
  	printf("%0.1f\n",rrr+0.5);
    printf("Eligible to Win");
  }
  else
  {
    printf("%0.0f\n",overs);
  	printf("%0.1f\n",f_overs);
  	printf("%0.1f\n",crr+0.1);
  	printf("%0.1f\n",rrr-0.4);
    printf("Not Eligible to Win");
  }
  
}