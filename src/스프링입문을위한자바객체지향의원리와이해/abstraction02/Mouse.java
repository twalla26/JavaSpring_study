package 스프링입문을위한자바객체지향의원리와이해.abstraction02;

public class Mouse {
    public String name;
    public int age;
    public static int countOfTail = 1;

    public void sing() {
        System.out.println(name + " 찍찍!!");
    }
}
