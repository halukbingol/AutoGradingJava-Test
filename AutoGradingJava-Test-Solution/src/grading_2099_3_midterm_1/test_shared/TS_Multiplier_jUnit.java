package grading_2099_3_midterm_1.test_shared;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import grading_2099_3_midterm_1.pack_a.Multiplier;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_Multiplier_jUnit {

	/*
	 * jUnit working
	 */

	@Test
	void jUnitWorking() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		System.out.println("\nYou got 1 points since jUnit is working");
		assertEquals(1, 1);
	}

	/*
	 * multiply
	 */

	@Test
	void multiply_2_3() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(6, Multiplier.multiply(2, 3));
	}

	@Test
	void multiply_3_4() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(12, Multiplier.multiply(3, 4));
	}

}
