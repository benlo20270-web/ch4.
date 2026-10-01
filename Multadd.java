public class Multadd {
	public static double multadd(double a, double b, double c) {
		double result =
		a * b + c;
		return result;
}
	
	public static void  main (String[] args) {
		double a = 1.0;
		double b = 2.0;
		double c = 3.0;
		System.out.println(multadd(0.5, Math.cos(Math.PI / 4), 
		Math.sin(Math.PI / 4)));
		//log function is below
		System.out.println(multadd(1, Math.log(10), 
		Math.log(20)));
	}
	
    public class expsum {
		public static double expsum(double x) {
			double result = 
			(multadd(x, Math.pow(Math.E, -x), 0)) + Math.sqrt((multadd(1, 1, -Math.pow(Math.E, -x))));
			return result;
		
	}
}
}


		
