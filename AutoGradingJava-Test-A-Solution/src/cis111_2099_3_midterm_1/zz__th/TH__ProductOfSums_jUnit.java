package cis111_2099_3_midterm_1.zz__th;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis111_2099_3_midterm_1.pack_b.ProductOfSums;
import cis111_2099_3_midterm_1.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

/**
 * TestHidden
 * 
 * @author bingol
 */
class TH__ProductOfSums_jUnit {

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
	void multiplyAdd_1_m1_2_3() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(0, ProductOfSums.multiplyAdd(1, -1, 2, 3));
	}

	@Test
	void multiplyAdd_5_7_m3_3() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(0, ProductOfSums.multiplyAdd(25, 7, -3, 3));
	}

}
