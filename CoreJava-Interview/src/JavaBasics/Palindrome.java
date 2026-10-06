package JavaBasics;

public class Palindrome {

    public static void main(String[] args) {
		
    	int num = 1221;
    	int num2 = num;
    	int temp = 0;
    	int r = 0;
    	
    	while (num2 > 0) {
			r = num2 % 10;
			temp = temp * 10 + r;
			num2 = num2 / 10;
		}
    	if (temp == num) {
			System.out.println(num + " is palindrome");
		}else {
			System.out.println(num + " is not palindrome");
		}
	}
}