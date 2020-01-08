
public class Main_1_2_UnreachableCode {
	private static final boolean DEBUG = false;
	public static void main(String[] args) {
		// historically developers used combination of boolean variable + if to exclude or include debug statements.
		// Java designers decided to permit this type of unreachable code
		if (DEBUG) {
			System.out.println("Unreachable code but works");
		}
//		while (DEBUG) {
//			System.out.println("Unreachable code but does not compile!");
//		}
	}
}
