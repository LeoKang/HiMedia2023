package sec02.exam09;

public class Main {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

//		System.arraycopy(oldStrArray, 0, newStrArray, 2, oldStrArray.length);

		/*
		 * newStrArray[2] = oldStrArray[0];
		 * newStrArray[3] = oldStrArray[1];
		 * newStrArray[4] = oldStrArray[2];
		 */
		for (int i = 0; i < oldStrArray.length; i++) {
			newStrArray[i + 2] = oldStrArray[i];
		}

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
