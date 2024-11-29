package cis111_2099_3_midterm_1.pack_b;

import cis111_2099_3_midterm_1.pack_a.Adder;
import cis111_2099_3_midterm_1.pack_a.Multiplier;

public class ProductOfSums {

	public static int multiplyAdd(int a, int b, int c, int d) {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		// below-0123456789-9876543210-V solution >>>>>>>>> V
		// ~~fake~~ return 0;

		int x = Adder.add(a, b);
		int y = Adder.add(c, d);
		int z = Multiplier.multiply(x, y);
		return z;

		// above-0123456789-9876543210-A solution <<<<<<<<< A

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}
	
}
