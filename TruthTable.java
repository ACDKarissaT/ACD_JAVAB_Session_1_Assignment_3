package truth.table;

public class TruthTable {         
	public static void main(String[] args) {
		System.out.println("0 Bitwise AND 0 is " + (0&0));
		System.out.println("0 Bitwise AND 1 is " + (0&1));
		System.out.println("1 Bitwise AND 0 is " + (1&0));
		System.out.println("1 Bitwise AND 1 is " + (1&1));
		System.out.println("0 Logical AND 0 is " + (false && false));
		System.out.println("0 Logical AND 1 is " + (false && true));
		System.out.println("1 Logical AND 0 is " + (true && false));
		System.out.println("1 Logical AND 1 is " + (true && true));
	}
}
