/* Exercise 8: (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the results. */

public class Main {
	public static void main(String[] args) {
		long l = 0xF;
		System.out.println(Long.toBinaryString(l));
		l = 0xFFF;
		System.out.println(Long.toBinaryString(l));
		l = 017;
		System.out.println(Long.toBinaryString(l));
		l = 0xF;
		System.out.println(Long.toOctalString(l));
		l = 0xFFF;
		System.out.println(Long.toHexString(l));
	}
}

// Out:
//  1111
//  111111111111
//  1111
//  17
//  fff
