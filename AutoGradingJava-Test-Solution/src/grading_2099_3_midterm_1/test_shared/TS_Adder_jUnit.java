package grading_2099_3_midterm_1.test_shared;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import grading_2099_3_midterm_1.pack_a.Adder;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_Adder_jUnit {

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
	 * adder
	 */

	@Test
	void adder_1_2() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(3, Adder.add(1, 2));
	}

	@Test
	void adder_2_3() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(5, Adder.add(2, 3));
	}

}
