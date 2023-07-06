package jump2java;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.HashSet;

class DataType {
    // Number
    int age = 22;
    long countOfStar = 8764827384923849L;

    float pi = 3.14F;
    double morePi = 3.14159265358979323846;
    double d1 = 123.4;
    double d2 = 1.234e2; // 1.234 * (10 ^ 2) = 123.4

    int octal = 023; // 8진수, 19
    int hex = 0xC; // 16진수, 12

    // Bool
    boolean isSuccess = true;
    boolean isTest = false;

    // Char
    char a1 = 'a'; // ' 를 써야 함.
    char a2 = 97;
    char a3 = '\u0061';

    // String
    String a = "Happy Java"; // 리터럴 표기: 객체 생성 없이 고정된 값을 그대로 대입
    String b = "a";
    String c = "123";

    String aa = new String("Happy Java"); // 항상 새로운 String 객체를 만듦.
    String bb = new String("a");
    String cc = new String("123");

    public class Sample {
        public static void main(String[] args) {
            String a = "hello";
            String b = new String("hello");
            System.out.println(a.equals(b)); // true
            System.out.println(a == b); // false
            // equals: 문자열 내장 메서드, 두 문자열이 같은지 확인해줌.
            // 문자열을 비교할 땐 '=='을 사용해선 안됨. '=='은 '두 개의 자료형이 동일한 객체인지 판별하는 연산자'이기 때문
        }
    }

    public class Sample2 {
        public static void main(String[] args) { // 문자열 포매팅 함수
            System.out.println(String.format("I eat %s apples.", 3)); // I have 3 apples.
            System.out.printf("I eat %d apples.", 3); // I eat 3 apples.
        }
    }

    // StringBuffer
    public class Sample3 {
        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer(); // StringBuffer sb 객체 생성
            sb.append("hello");
            sb.append(" ");
            sb.append("jump to java");
            String result = sb.toString(); // string으로 변환
            System.out.println(result); // hello jump to java
        }
    }

    public class Sample4 {
        public static void main(String[] args) {
            String result = ""; // 그냥 string 객체일 경우, 값을 변경할 수 없기에 계속 새로운 객체를 생성함.
            result += "hello";
            result += " ";
            result += "jump to java";
            System.out.println(result); // hello jump to java
        }
    }

    // Array
    int[] odds = {1, 3, 5, 7, 9};
    String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

    public class Sample5 {
        public static void main(String[] args) {
            String[] weeks = new String[7]; // 동적 할당하여 객체를 생성할 경우 배열의 길이는 고정되어야 함.
            weeks[0] = "월";
            weeks[1] = "화";
            weeks[2] = "수";
            weeks[3] = "목";
            weeks[4] = "금";
            weeks[5] = "토";
            weeks[6] = "일";
        }
    }

    // List
    // 배열보다 편리한 메서드가 많음. 리스트는 길이가 동적으로 변함.
    //      ArrayList
    public class Sample6 {
        public static void main(String[] args) {
            ArrayList pitches = new ArrayList();
            pitches.add("138");
            pitches.add("129");
            pitches.add("142");
            pitches.add(0, "133"); // 첫번째 위치에 133 삽입.
            System.out.println(pitches.get(1)); // 138
            System.out.println(pitches.size()); // 4
            System.out.println(pitches.contains("142")); // true
            System.out.println(pitches.remove("129")); // true

            ArrayList<String> pitches2 = new ArrayList<>(); // Generics
            pitches2.add("123");

            String one = (String) pitches.get(0); // Object 자료형이 String으로 형변환이 필요함.
            String two = pitches2.get(0); // String이 그대로 String으로 나옴. 형 변환이 필요없음.
        }
    }

    // Map
    // Dictionary와 비슷한 형태임.
    //      HashMap
    public class Sample7 {
        public static void main(String[] args) {
            HashMap<String, String> map = new HashMap<>();
            map.put("people", "사람");
            map.put("baseball", "야구");
            System.out.println(map.get("people")); // 사람 출력
            System.out.println(map.keySet()); // [baseball, people] 출력
        }
    }

    // Set
    public class Sample8 {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
            System.out.println(set); // [e, H, l, o]
            // 중복 허용 X, 순서 없음 -> 인덱싱 불가
            // --> 중복을 제거하기 위한 필터로 사용됨.
        }
    }

    public class Sample9 {
        public static void main(String[] args) {
            HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
            HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

            HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection 생성
            intersection.retainAll(s2); // 교집합 수행
            System.out.println(intersection); // [4, 5, 6] 출력

            HashSet<Integer> union = new HashSet<>(s1); // s1으로 union 생성
            union.addAll(s2); // 합집합 수행
            System.out.println(union); // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

            HashSet<Integer> substract = new HashSet<>(s1); // s1으로 substract 생성
            substract.removeAll(s2); // 차집합 수행
            System.out.println(substract); // [1, 2, 3] 출력
        }
    }

    // Enum
    // 서로 관련 있는 여러 개의 상수 집합 정의
    public class Sample10 {
        enum CoffeeType {
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        };
        public static void func1(String[] args) {
            System.out.println(CoffeeType.AMERICANO); // AMERICANO 출력
            System.out.println(CoffeeType.ICE_AMERICANO); // ICE_AMERICANO 출력
            System.out.println(CoffeeType.CAFE_LATTE); // CAFE_LATTE 출력
        }
        public static void func2(String[] args) {
            for (CoffeeType type : CoffeeType.values()) {
                System.out.println(type); // 위와 같이 출력됨
            }
        }
    }

    // 형변환
    public class Sample11 {
        public static void main(String[] args) {
            String num = "123";
            int n1 = Integer.parseInt(num); // int 형의 wrapper 클래스인 Integer 클래스 사용
            System.out.println(n1); // 123 출력

            int n2 = 123;
            String num1 = String.valueOf(n2); // String.valueOf : 정수 -> 문자열
            String num2 = Integer.toString(n2); // Integer.toString : 정수 -> 문자열
            System.out.println(num1);
            System.out.println(num2);
        }
    }

    // final
    // final은 값을 단 한번만 설정할 수 있게 강제하는 키워드임.
    public class Sample12 {
        public static void main(String[] args) {
            final int n = 123;
            // n = 456; 컴파일 에러 발생
        }
    }
}
