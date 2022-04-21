/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkgnew.m7alat.pkg2l.nagar;
import java .util.Scanner;
/**
 *
 * @author G_TICH
 */
public class NewM7alat2lNagar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System .in);
      float leangth ,weadth,thick,salary,num,cup ,result,total=0;
boolean still = true;float sum = 0;
 while (still )
{  
 System . out . println("دخل طول الحشب");
      leangth = input.nextFloat();
  System . out . println(" دخل عرضالحشب");
  weadth = input.nextFloat();
    System . out . println("دخل سمك الخشب");
thick = input.nextFloat();
 System . out . println("دخل عدد الالواح");
 num = input.nextFloat();
 cup = (leangth*weadth*thick*num)*1/10000;
 System . out . println("التكعيب بتاع الخشب="+cup);
System . out . println("سعرالمتر الخشب ");
salary = input.nextFloat();
 result =(cup*salary)*1/100;
System . out . println("حساب الخشب ده="+result);
System . out . println("هل تريد حساب خشب تاني ");
int read = 0; 
sum +=result ;
read = input.nextInt();
if(read==1){
still = true;}
else
{System . out . println("الحساب الكلي ="+sum);
still = false;}
}
System . out . println("هل الزبون عليه حساب قديم");
int net = 0;
net = input.nextInt();
if (net== 1){
 System . out . println("ممكن بعد ازنك تتدخل الحساب القديم");
float old = 0;
old = input.nextFloat();
total = sum+old ;
System.out .println("المجموع الكلي="+total);}
else{
total =sum  ;
System.out .println("المجموع الكلي="+total);}
float remender,run=0 ;
System.out .println("كماعطاك الزبون");
run = input.nextFloat();
remender =total-run ;
System.out .println("تنزيل = "+run);
System.out .println("الباقي="+remender);

    }

}
