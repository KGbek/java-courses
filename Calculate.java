public class Calculate{
	
	public static void main(String[] arg){
		System.out.println("Calculate....");

	int first = Integer.valueOf(arg[0]);
	int second = Integer.valueOf(arg[1]);
	int summ = first / second;
	System.out.println("Summ " + summ);

	double d1 = Double.valueOf(arg[2]);
	double d2 = Double.valueOf(arg[3]);
	double res = d1 * d2;
	System.out.println("Result is : " + res);

	float f1 = Float.valueOf(arg[4]);
	float f2 = Float.valueOf(arg[5]);
	float resf = f1 - f2;
	System.out.println("Result: " + resf);

	short s1 = Short.valueOf(arg[6]);
	short s2 = Short.valueOf(arg[7]);
	short ress = s1 + s2;
	System.out.println("Result short: " + ress);
	}
}