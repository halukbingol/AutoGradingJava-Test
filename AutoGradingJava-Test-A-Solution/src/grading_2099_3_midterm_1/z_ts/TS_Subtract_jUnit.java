package grading_2099_3_midterm_1.z_ts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import grading_2099_3_midterm_1.StudentInfo;
import grading_2099_3_midterm_1.pack_a.pack_c.Subtracter;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_Subtract_jUnit {

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
	 * subtract
	 */

	@Test
	void subtract_3_1() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(2, Subtracter.subtract(3, 1));
	}

	@Test
	void adder_2_3() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(-1, Subtracter.subtract(2, 3));
	}

}
