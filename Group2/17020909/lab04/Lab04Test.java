public class Lab04Test {
	
	@Test
	public void findMaxInt1() {
		int temp=50;
		int temp0=Lab04.findMaxInt(50,10);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void findMaxInt2() {
		int temp=22;
		int temp0=Lab04.findMaxInt(22,11);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void findMaxInt3() {
		int temp=6;
		int temp0=Lab04.findMaxInt(4,6);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void findMaxInt4() {
		int temp=252;
		int temp0=Lab04.findMaxInt(24,252);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void findMaxInt5() {
		int temp=555;
		int temp0=Lab04.findMaxInt(555,214);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void findMinA1() {
		int temp=1;
		int[] A = new int[] {1,2,3,4,5};
		int temp0=Lab04.findMinA(A, 5);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void findMinA2() {
		int temp=5;
		int[] A = new int[] {63,5,656,35};
		int temp0=Lab04.findMinA(A, 4);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void findMinA3() {
		int temp=1;
		int[] A = new int[] {100,1};
		int temp0=Lab04.findMinA(A, 2);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void findMinA4() {
		int temp=54;
		int[] A = new int[] {134,54,222,333,555,666};
		int temp0=Lab04.findMinA(A, 6);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void findMinA5() {
		int temp=10;
		int[] A = new int[] {0,1000,100000};
		int temp0=Lab04.findMinA(A, 3);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void BMI1(() {
		String temp="Thieu can";
		String temp0=Lab04.BMI(45, 1.8f);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void BMI2(() {
		String temp="Binh thuong";
		String temp0=Lab04.BMI(65, 1.75f);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void BMI2(() {
		String temp="Thua can";
		String temp0=Lab04.BMI(55, 1.5f);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void BMI1(() {
		String temp="Beo phi";
		String temp0=Lab04.BMI(70, 1.55f);
		assertEquals(temp, temp0);
	}
	
	@Test
	public void BMI1(() {
		String temp="Binh thuong";
		String temp0=Lab04.BMI(75, 1.85f);
		assertEquals(temp, temp0);
	}
	
}