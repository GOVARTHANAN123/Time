import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Solution{
	public static void main(String args[])throws IOException
	{
		Circle obj=new Circle();
		Triangle obj1=new Triangle();
		Rectangle obj2=new Rectangle();
 		int sw;
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Circle\t2.Triangle\t3.Rectangle");
		sw=Integer.parseInt(bf.readLine());
		switch(sw)
		{
	    case 1:
	            System.out.println("Enter Radius");
		        obj.radius=Double.parseDouble(bf.readLine());
		        obj.area();
		        break;
		case 2:
		        System.out.println("Enter height");
                obj1.height=Double.parseDouble(bf.readLine());
                System.out.println("Enter base");
		        obj1.base=Double.parseDouble(bf.readLine());
		        obj1.area();
		        break;
		case 3:
		        System.out.println("Enter length");
                obj2.length=Double.parseDouble(bf.readLine());
                System.out.println("Enter breadth");
                obj2.breadth=Double.parseDouble(bf.readLine());
	 	        obj2.area();
	 	        break;
	   }
	}
}