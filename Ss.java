import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Ss{
public static void main(String arg[])throws IOException
{
float total=0,total1=0,total2=0,sum=0,avg1=0,avg=0,avg2=0,avg3=0,avg4=0,avg6=0,avgmonth=0,avgyear=0;
int i,j,k;
int array[][][];
int year=2015;
array=new int[12][31][24];
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//String arr;
//String arr1=new String[24];
//arr1[]=arr.split(" ");
int arr2;
String arr;//=new int[24];
//for(String a:arr1)
//System.out.println(a);
int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
if(year%4==0)
 month[1]=29;
else
 month[1]=28;
for(i=0;i<12;i++)
{
 for(j=0;j<month[i];j++)
 {
       arr=bf.readLine();
       String arr1[]=arr.split(" ");
   for(k=0;k<24;k++)
  {
       arr2=Integer.parseInt(arr1[k]);
       array[i][j][k]=arr2;
  }
 }
}


for(j=0;j<month[0];j++)
 {
  for(k=0;k<24;k++)
  {
      total+=array[0][j][k];
  }
 }
avg=total/month[0];
System.out.println("average of january:    "+avg);
total=0;

 for(k=0;k<24;k++)
  total+=array[11][20][k];
 avg1=total/k;
System.out.println("average customer on december 21:   "+avg1);
 total=0;

 for(i=0;i<12;i++)
 {
  for(k=0;k<24;k++)
  {
        total+=array[i][6][k];
  }
 }
 avg2=total/12;
 total=0;
 System.out.println("average number of customer on 7th of every month:   "+avg2);
 for(i=0;i<12;i++)
 {
  for(k=0;k<24;k++)
  {
       total+=array[i][28][k];
  }
 }
 avg3=total/12;
  System.out.println("average number of customer on 29th of every month:   "+avg3);
 total=0;

 for(i=0;i<12;i++)
 {
  for(j=0;j<month[i];j++)
  {
  for(k=9;k<17;k++)
  {
      total+=array[i][j][k];
 }
}
}
 avg4=total/365;
 total=0;
 System.out.println("average number of customers on every day of hour 10 to 18:   "+avg4);
for(j=0;j<month[6];j++)
 {
  for(k=0;k<24;k++)
  {
       total+=array[6][j][k];
  }
 }
 avg6=total/month[6];
System.out.println("average number of customers on each day of July month:   "+avg6);
System.out.println("Total number of customers on each day of July month:   "+total);
 total=0;
 for(i=0;i<12;i++)
 {
  for(j=0;j<month[i];j++)
  {
  for(k=0;k<24;k++)
  {
      total+=array[i][j][k];
 }
}
sum+=total;
total1=total/month[i];
total=0;
total2+=total1;
total1=0;
}
avgmonth=total2/12;
avgyear=sum/365;
System.out.println("average number of customers on each month   "+avgmonth);
System.out.println("total number of customers on each month   "+total2);
System.out.println("average number of customers in year   "+avgyear);
System.out.println("total number of customers in year   "+sum);
int l;
float avg5;
total=0;
for(i=0;i<12;i++)
{
  int mon[]={5,7,12,16,23};
  for(j=0;j<5;j++)
  {
    for(k=7;k<12;k++)
      total+=array[i][mon[j]][k];
    for(l=15;l<24;l++)
      total+=array[i][mon[j]][l];
  }
}
 avg5=total/12;
 System.out.println("average number of customers on each month of 5th, 7th,12th ,16th, and 23rd of hour 8 to 12 and 16 to 24:  "+avg5);

}
}