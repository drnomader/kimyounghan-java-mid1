package lang.system;

import java.util.Arrays;

public class SystemMain {
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("currentTimeMillis = " + currentTimeMillis);

		long currentTimeNano = System.nanoTime();
		System.out.println("currentTimeNano = " + currentTimeNano);

		//환경변수
		System.out.println("System.getenv() = " + System.getenv());

		//시스템 속성
		System.out.println("System.getProperties() = " + System.getProperties());
		System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

		//배열 고속 복사
		char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
		char[] copiedArray = new char[5];
		System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

		System.out.println("copiedArray = " + copiedArray);
		System.out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray));

		//프로그램 종료
		System.exit(0);
	}
}
