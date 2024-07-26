package example;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num = 153;
		int original = num;
		int result = 0;
		
		while(num != 0) {
			int digits = num % 10;
			result += Math.pow(digits, 3);
			num /= 10;
		}
		
		boolean isArmstrong = result == original;
		System.out.println(original + " is Armstrong: " + isArmstrong);
		
	}

}
