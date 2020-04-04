#include<stdio.h>
int main()
{
  int fpk,fpk_dsct,fpk_del,amz,amz_dsct,amz_del,snp,snp_dsct,snp_del,flip,amzn,snpd,d;
  scanf("%d%d%d%d%d%d%d%d%d",&fpk,&fpk_dsct,&fpk_del,&snp,&snp_dsct,&snp_del,&amz,&amz_dsct,&amz_del);
  flip=((fpk_dsct*fpk)/100)+fpk_del;
  d=(amz_dsct*amz)/100;
  amzn=amz-d+amz_del;
  snpd=((snp_dsct*snp)/100)+snp_del;
  printf("In Flipkart: Rs.%d\n",flip);
  printf("In Snapdeal: Rs.%d\n",snpd);
  printf("In Amazon: Rs.%d\n",amzn);
  if(flip<snpd){
    if(flip<amzn)
      printf("He will prefer Flipkart");
  	else
      printf("He will prefer Snapdeal");
  }
  else
  {
    if(snpd<amzn)
      printf("He will prefer Snapdeal");
  	else
      printf("He will prefer Amazon");
  }
}