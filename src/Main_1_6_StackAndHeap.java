
public class Main_1_6_StackAndHeap {
	
	private String str = new String("hello");

	public void print() {
		int i = 0;
		while (i++ < 100) {
			System.out.println(this.str);
		}
	}
	
	public static void main(String[] args) {
		Main_1_6_StackAndHeap program = new Main_1_6_StackAndHeap();
		program.print();
		// After the print method ends, variable i has served its purpose and is not required.
		// But the variable str still can be used, so it needs to be kept irrespective of the execution lifetime of print mehod.
	}
}
