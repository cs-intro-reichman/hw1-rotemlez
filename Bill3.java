// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		 String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        double sum = Double.parseDouble(args[3]);
        double sum1 = Math.ceil(sum / 3.0);
        System.out.println("dear "+ name1 + " "+ name2 + " " +name3 + " pay" + " " +sum1 + " " + "shekels each. " );
	}
}
