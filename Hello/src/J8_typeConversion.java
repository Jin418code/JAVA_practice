public class J8_typeConversion {
	public static void main(String[] args) {
		
		String strNum1 = "12345";
		String strNum2 = "67890";
		
		int tempNum1 = 1000;
		
		//String => int
		int intNum1 = Integer.parseInt(strNum1);  // "12345" => 12345
		int intNum2 = Integer.parseInt(strNum2);  // "67890" => 67890
		
		int sum = intNum1 + intNum2;
		
		double douNum1 = Double.parseDouble(strNum1);  // 12345.0
		
		// int => String
		String stringSum = Integer.toString(sum);
		System.out.println(stringSum); // 문자화함 " "
		
		String strNum3 = Integer.toString(tempNum1);
		System.out.println(strNum3); // "1000"
	}
}