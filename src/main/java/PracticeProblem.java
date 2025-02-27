public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray() {
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static String[] createArray(String string1, String string2, String string3, String string4) {
		String[] array = {string1, string2, string3, string4};
		return array;
	}

	public static int findValue(int value, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String value, String[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(value)) {
				count++;

				if (count == 3) {
					return i;
				}
			}
		}
		return -1;
	}


}
