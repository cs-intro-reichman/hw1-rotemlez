// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int currentvalue = Integer.parseInt(args [0]); 
    double rate = Double.parseDouble(args [1]) / 100.0;
    int n = Integer.parseInt( args [2]);
    double futureValue = currentvalue * Math.pow(1.0 + rate, n);
        System.out.println("After " + n + " years, $" + currentvalue + " saved at " + Double.parseDouble(args[1]) + "% will yield $" + (int)futureValue);
	}
}
