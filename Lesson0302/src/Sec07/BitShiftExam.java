package Sec07;

public class BitShiftExam {

	public static void main(String[] args) {

		int num1 = 1;
		int rs1 = num1 << 3;
		int rs2 = num1 * (int) Math.pow(2, 3);
		System.out.println(rs1);
		System.out.println(rs2);
		
		int num2 = -8;
		int rs3 = num2 >> 3;
		int rs4 = (int) (num2 / Math.pow(2, 3));
		System.out.println(rs3);
		System.out.println(rs4);
		
		
		//1. 정수 772를 2진수로 표기하라
		int val = 772;
		String strVal = Integer.toBinaryString(val);
		while(strVal.length() < 32) {
			strVal = "0" + strVal;
		}
		System.out.println(strVal);
		
		//2. 우측으로 3byte 이동 후 마지막 1바이트만 읽어라
		// 00000000 00000000 00000011 00000100 => 00000000 => 0
		byte byte1 = (byte) (val >>> 24);
		System.out.println(byte1);
		
		//3. 우측으로 2byte 이동 마지막 1비트만 읽어라
		// 00000000 00000000 00000011 00000100 => 00000000 00000000 => 0
		byte byte2 = (byte) (val >>> 16);
		System.out.println(byte2);
		
		//4. 우측으로 1바이트 이동 마지막 1바이트만 읽어라
		// 00000000 00000000 00000011 00000100  => 00000011 => 3
		byte byte3 = (byte) (val >>> 8);
		System.out.println(byte3);
		
		//5. 마지막 1바이트를 읽어라
		// 00000000 00000000 00000011 00000100 => 00000100 => 4
		byte byte4 = (byte) val;
		System.out.println(byte4);
		
		
	}
}
