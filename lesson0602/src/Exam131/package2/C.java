package Exam131.package2;

// 전부다 import 한다
import Exam131.package1.*;

public class C {
  //필드 선언
	A a1 = new A(true);
	// A a2 = new A(1); default 생성자는 다른 패키지에서 사용할 수 없다
	// A a3 = new("문자"); private 생성자는 다른 클래스 및 패키지에서 사용 불가능
}
