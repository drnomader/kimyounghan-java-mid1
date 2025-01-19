package lang.object.tostring;

public class ToStringMain1 {
	public static void main(String[] args) {
		Object object = new Object();
		String string = object.toString();

		//toString()
		System.out.println("string = " + string);

		//object
		System.out.println("o = " + object);
	}
}
