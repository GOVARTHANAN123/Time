
import times.Time;
import java.io.IOException;
import java.io.InputStreamReader;
package main;
class Solution{
	public static void main(String args[])throws IOException{
		Time obj=new Time();
		obj=new Time(0,0,0);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int s;
		System.out.println("1.nextsecond\t2.nextMinute\t3.nextHour\t4.previousSecond\t5.previousMinute\t6.previousHour");
		s=Integer.parseInt(bf.readLine());
		switch(s)
		{
			case 1:obj.nextSecond();
			        break;
			case 2:obj.nextMinute();
			        break;
			case 3:obj.nextHour();
			        break;
			case 4:obj.previousSecond();
			        break;
			case 5:obj.previousMinute();
			        break;
			case 6:obj.previousHour();
			        break;
			        		}
	}
}