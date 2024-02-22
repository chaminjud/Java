package sec08;

import java.util.Calendar;

public class EnumClassEx {

	public static void main(String[] args) {

		Week today = null;
		
		//Week today = Week.WEDNESDAY;
		
		//검퓨터에 있는 날짜 요일 시간을 얻으려면 java.util.Calendar
		//java.util.GregorianCalendar
		//enum(열거타입)은 대문자로 쓴다. 복합단어는 스네이크 표기법 이용 YEAR-MONTH
		Calendar now = Calendar.getInstance();
		
		int year =now.get(Calendar.YEAR); //연
		int month = now.get(Calendar.MONTH) + 1; //월
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		int week = now.get(Calendar.DAY_OF_WEEK); //요일 (1~7)
		int hour = now.get(Calendar.HOUR); //시
		int minute = now.get(Calendar.MINUTE); //분
		int second = now.get(Calendar.SECOND); //초
		
		//숫자를 열거상수로 변환후 변수에 저장해 사용
		switch(week) {
		case 1:
			today = Week.SUNDAY; 
			break;
			
		case 2:
			today = Week.MONDAY; 
			break;
			
		case 3:
			today = Week.TUESDAY; 
			break;
			
		case 4:
			today = Week.WEDNESDAY; 
			break;
			
		case 5:
			today = Week.THURSDAY; 
			break;
			
		case 6:
			today = Week.FRIDAY; 
			break;
			
		case 7:
			today = Week.SATURDAY; 
			break;
		}
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 봅니다.");
		}else if(today == Week.WEDNESDAY) {
			System.out.println("자바 공부를 합니다.");
		}else {
			System.out.println("쉽니다.");
		}
		
	}

}
