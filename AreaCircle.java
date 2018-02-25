import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(areaCalculator(in.nextDouble()));
	}

	
	public static double areaCalculator(double radius) {
			
		return Math.PI * Math.pow(radius, 2);
	}
}
 
