package lang.string.builder;

public class LoopStringBuilder {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("Hello Java ");
		}
		long endTime = System.currentTimeMillis();

		String result = sb.toString();
		System.out.println("result = " + result);
		System.out.println("startTime = " + startTime);
		System.out.println("endTime = " + endTime);
		System.out.println("time = " + (endTime - startTime) + "ms");
	}
}
