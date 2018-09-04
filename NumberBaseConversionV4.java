import java.util.ArrayList;

public class NumberBaseConversionV4 {

	public static int DecimaltoBinary(int n) {
		int[] binary = new int[32];
		int index = 0;

		while (n > 0) {
			binary[index++] = n % 2;
			n = n / 2;
		}
		String str = "";
		for (int i = index - 1; i >= 0; i--) {
			str += binary[i];
		}
		int AC = Integer.parseInt(str);
		return AC;
	}

	public static int DecimaltoOctal(int n) {
		int[] binary = new int[32];
		int index = 0;
		while (n > 0) {
			binary[index++] = n % 8;
			n = n / 8;
		}
		String str = "";
		for (int i = index - 1; i >= 0; i--) {
			str += binary[i];
		}
		int AC = Integer.parseInt(str);
		return AC;
	}

	public static String DecimaltoHex(int n) {
		Integer num = new Integer(n);
		String hex = Integer.toHexString(num);
		return hex;
	}

	public static int BinarytoDecimal(int n) {
		int temp = n;
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (temp > 0) {
			array.add(temp % 10);
			temp = temp / 10;
		}
		int AC = 0;
		for (int i = 0; i < array.size(); i++) {
			AC += array.get(i) * Math.pow(2, i);
		}
		return AC;
	}

	public static int BinarytoOctal(int n) {
		int temp = BinarytoDecimal(n);
		int AC = DecimaltoOctal(temp);
		return AC;
	}
	
	public static String BinarytoHex(int n) {
		int temp = BinarytoDecimal(n);
		String AC = DecimaltoHex(temp);
		return AC;
	}

	public static String OctaltoDecimal(int n) {
		int temp = n;
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (temp > 0) {
			array.add(temp % 8);
			temp = temp / 8;
		}
		System.out.println(array);
		String str = "";
		for (int i = array.size()-1; i >= 0; i--) {
			str += array.get(i);
		}
		return str;
	}

	
	
	public static void main(String[] args) {
//		System.out.println(DecimaltoBinary(15));
//		System.out.println(DecimaltoOctal(15));
//		System.out.println(DecimaltoHex(15));
//		System.out.println(BinarytoDecimal(110111101));
//		System.out.println(BinarytoOctal(110111101));
//		System.out.println(BinarytoHex(110111101));
		System.out.println(OctaltoDecimal(144));
	}

}
