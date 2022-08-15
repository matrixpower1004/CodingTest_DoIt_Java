package com.matrix.chapter03;
// 형변환 예제
public class Ch03_Ex001_1 {
	public static void main(String[] args) {
		// 형변환 String -> 숫자형(int, double, float) 
		String sNum2 = "1234";
		int i1 = Integer.parseInt(sNum2);
		int i2 = Integer.valueOf(sNum2);
		double d = Double.valueOf(sNum2);
		float f = Float.valueOf(sNum2);
		long l = Long.parseLong(sNum2);
		short s = Short.parseShort(sNum2);
		System.out.println("int i1 = " + i1);
		System.out.println("int i2 = " + i2);
		System.out.println("double d = " + d);
		System.out.println("float f = " + f);
		System.out.println("long l = " + l);
		System.out.println("short s = " + s);
		System.out.println("---------------------------------");
		
		// 형변환 숫자형 -> String
		String[] s2 = new String[6];
		int i3 = 1234;
		s2[0] = String.valueOf(i3);
		s2[1] = Integer.toString(i3);
		float f1 = (float) 1.23;
		double d1 = 1.23;
		s2[2] = String.valueOf(f1);
		s2[3] = String.valueOf(d1);
		s2[4] = Float.toString(f1);
		s2[5] = Double.toString(d1); 
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		System.out.println(s2.getClass().getSimpleName());
	}
}
