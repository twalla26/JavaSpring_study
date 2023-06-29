public class HelloWorld {
    // class 앞의 public: 파일명과 클래스명이 같을 때 public을 명시해야 함.
    // 자바는 모든 것이 클래스 기반이므로 모든 함수는 메서드임.
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    // public: 메서드의 접근 제어자. 누구나 이 메서드에 접근 가능
    // static: 이 메서드는 인스턴스 생성 없이 실행할 수 있음.
    // void: 메서드의 return 값 없음.
    // String[]: 문자열을 나타내는 자바의 자료형
    // args: String[] 자료형에 대한 변수명
    // System.out.println(): 표준 출력으로 데이터를 보내는 자바의 내장 메서드. 문자열을 화면에 출력함.
}
