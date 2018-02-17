package calc;

public class calc {




	public static void main(String[] args) {
	
		calcFeetAndInchesToCentemeters(9, 3);
	}
	public static double calcFeetAndInchesToCentemeters(double feet, double inches ) {
	if((feet <0) || ((inches <0) || (inches >12))) {
		return -1;
	}
	
	double centimeters = (feet * 12) * 2.54;
	centimeters += inches * 2.54;
	System.out.println(feet +" feet and " + inches + " inches = " + centimeters + " centimeters");
	return centimeters;
	}
	
	
}

