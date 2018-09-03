import java.util.ArrayList;

public class NumberBaseConversionV3 {

	public static void DecimaltoBinary(int n) {
		int[] binary = new int[32];
		int index = 0;

		while (n > 0) {
			binary[index++] = n % 2;
			n = n / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void BinarytoDecimal(int n) {
		int temp = n;
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(temp>0){
		    array.add(temp % 10);
		    temp =temp / 10;
		}
		int AC=0;
		for(int i=0; i<array.size();i++){
			AC+=array.get(i)*Math.pow(2, i);
		}
		System.out.println(AC);
	}

	public static void main(String[] args) {
		
		DecimaltoBinary(15);
		System.out.println();
		BinarytoDecimal(1101);

	}

}
