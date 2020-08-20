package util;

public class PrintUtil {

	public static void printView(char viewChar, int viewCount) {
		for (int i = 0; i < viewCount; i++) {
			System.out.print(viewChar);
		}
		System.out.println();
	}
}

