package grading_2099_3_midterm_1;

/**
 * Please fill this with your info.
 * 
 * @author bingol
 */
public interface StudentInfo {

	String studentName = "aaa"; // your name here
	String studentLastName = "bbb"; // your last name here
	String studentNo = "12345678-123"; // your student no
	String course = "cis111"; // course ID
	String section = "1"; // your section

	/**
	 * Do not change {@code studentTag}.
	 */
	static void studentTag() {
		System.out.println("~".repeat(50));
		System.out.println("~ Course:\t" + course + "." + section);
		System.out.println("~ Student:\t" + studentLastName.toUpperCase() + "," + studentName + "\t" + studentNo);
		System.out.println("~".repeat(50));
	}

}
