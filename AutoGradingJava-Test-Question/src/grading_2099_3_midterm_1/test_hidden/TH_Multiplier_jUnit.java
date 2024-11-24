package grading_2099_3_midterm_1.test_hidden;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import grading_2099_3_midterm_1.pack_a.Multiplier;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TH_Multiplier_jUnit {

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
	void multiply_0_0() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(0, Multiplier.multiply(0, 0));
	}

	@Test
	void multiply_1_0() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(0, Multiplier.multiply(1, 0));
	}

	@Test
	void multiply_0_1() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(0, Multiplier.multiply(0, 1));
	}

	@Test
	void multiply_1_1() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(1, Multiplier.multiply(1, 1));
	}

}
