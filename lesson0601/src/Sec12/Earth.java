package Sec12;
//일반적으로 패키지를 실사용 할때는 도메인에 역순으로 많이 사용한다.
//com.naver.패키지명;

public class Earth {
       
	   // 상수 선언과 동시에 초기화
       static final double EARTH_RADIUS = 6400;
       
       //상수 선언
       static final double EARTH_SURFACE_AREA; 
       
       
       //정적 블럭을 이용하여 초기화
       static {
    	   EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;

       }
}
