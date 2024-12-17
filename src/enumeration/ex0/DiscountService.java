package enumeration.ex0;

public class DiscountService {

	public int discount(String grade, int price) {
		int discountPercent = 0;

		if (grade.equals("BASIC")) {
			discountPercent = 10;
		} else if (grade.equals("GOLD")) {
			discountPercent = 20;
		} else if (grade.equals("DIAMOND")) {
			discountPercent = 30;
		} else {
			System.out.println(grade + " : 할인 X");
		}
		// (discountPercent / 100) 로 괄호 묶으면 소수점 값 날라감
		return price * discountPercent / 100;
	}
}
