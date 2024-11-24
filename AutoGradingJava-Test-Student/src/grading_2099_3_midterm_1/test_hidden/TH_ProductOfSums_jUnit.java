package grading_2099_3_midterm_1.test_hidden;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import grading_2099_3_midterm_1.pack_b.ProductOfSums;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TH_ProductOfSums_jUnit {

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
	 * multiplyAdd
	 */

	@Test
	void multiplyAdd_0_1_2_3() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(5, ProductOfSums.multiplyAdd(0, 1, 2, 3));
	}

	@Test
	void multiplyAdd_1_2_3_m5() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(-6, ProductOfSums.multiplyAdd(1, 2, 3, -5));
	}

}
