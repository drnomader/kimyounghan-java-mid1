package enumeration.ex2;

public class Grade {
	public static final Grade BASIC = new Grade(); // x001
	public static final Grade GOLD = new Grade(); // x002
	public static final Grade DIAMOND = new Grade(); // x003

	// private 생성자 추가
	private Grade() {}
}
