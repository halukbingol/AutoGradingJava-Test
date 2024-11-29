package cis111_2099_3_midterm_1.z_ts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis111_2099_3_midterm_1.pack_b.ProductOfSums;
import cis111_2099_3_midterm_1.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_ProductOfSums_jUnit {

	/*
	 * jUnit working
	 */

	@Test
	void zz_jUnitWorking() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StudentInfo.studentTag();
		System.out.println("\nYou got 1 points since jUnit is working.");
		assertEquals(1, 1);
	}

	/*
	 * multiplyAdd
	 */

	@Test
	void multiplyAdd_1_2_3_4() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(21, ProductOfSums.multiplyAdd(1, 2, 3, 4));
	}

	@Test
	void multiplyAdd_2_3_4_5() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(45, ProductOfSums.multiplyAdd(2, 3, 4, 5));
	}

}
