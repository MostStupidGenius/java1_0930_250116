package day02.inheritance.abstractKey;

public class AbsChild extends AbstractClass {

	@Override
	public void abstPrint(String text) {
		System.out.print(text);
	}

	@Override
	public void abstPrint(String text, boolean enter) {
		if (enter) {
			System.out.println(text);
		} else {
			System.out.print(text);
		}
	}
}
