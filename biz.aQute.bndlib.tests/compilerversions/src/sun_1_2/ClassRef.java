package sun_1_2;

public class ClassRef {
	class Inner {
	};
	static {
		System.out.println(Inner.class);
	}
	
	public static void main() {
		System.out.println(javax.swing.Box.class);
	}
}