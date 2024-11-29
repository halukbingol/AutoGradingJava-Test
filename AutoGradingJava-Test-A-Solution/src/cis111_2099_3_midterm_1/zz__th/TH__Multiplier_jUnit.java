package cis111_2099_3_midterm_1.zz__th;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis111_2099_3_midterm_1.pack_a.Multiplier;
import cis111_2099_3_midterm_1.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TH__Multiplier_jUnit {

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
	 * multiply
	 */

	@Test
	void multiply_0_0() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(0, Multiplier.multiply(0, 0));
	}

	@Test
	void multiply_m1_1() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(-1, Multiplier.multiply(-1, 1));
	}

}
