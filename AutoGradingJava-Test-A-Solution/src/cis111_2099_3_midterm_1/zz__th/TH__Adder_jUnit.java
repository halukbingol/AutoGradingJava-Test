package cis111_2099_3_midterm_1.zz__th;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis111_2099_3_midterm_1.pack_a.Adder;
import cis111_2099_3_midterm_1.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TH__Adder_jUnit {

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
	 * adder
	 */

	@Test
	void adder_0_0() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(0, Adder.add(0, 0));
	}

	@Test
	void adder_m1_1() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		assertEquals(0, Adder.add(-1, 1));
	}

}
