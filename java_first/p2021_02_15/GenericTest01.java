package p2021_02_15;

class TestClass {
	private int member;		// 필드

	public void setValue(int value) {
		member = value;
	}

	public int getValue() {
		return member;
	}
}

class GenericTest01 {
	public static void main(String[] args) {
		TestClass obj01 = new TestClass();
//		obj01.member = 3;   접근 안됨
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());
	}
}
