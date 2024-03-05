package Ch11.Sec04;

public class ResourceOpenCloseExam {

	public static void main(String[] args) {
		
		
		try(ReSourceOpenClose res = new ReSourceOpenClose("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();

		try(ReSourceOpenClose res = new ReSourceOpenClose("A")){
			String data = res.read2();
			//NumberFormatException 발생
			// 숫자타입으로 변환 불가능
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		
		ReSourceOpenClose res1 = new ReSourceOpenClose("A");
		ReSourceOpenClose res2 = new ReSourceOpenClose("B");
		
		try(res1; res2){
			String data1 = res1.read1();
			String data2 = res2.read2();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
