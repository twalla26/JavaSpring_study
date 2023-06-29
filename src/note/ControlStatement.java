package note;
import java.util.ArrayList;

public class ControlStatement {

    // if문
    public class Sample {
        public static void main(String[] args) {
            boolean money = true;
            if (money) {
                System.out.println("택시 타고 가라!");
            }
            else {
                System.out.println("걸어가라!");
            }
        }
    }

    // switch/case문
    public class Sample2 {
        public static void main(String[] args) {
            int month = 8;
            String monthString = "";
            switch (month) {
                case 1:
                    monthString = "January";
                    break;
                case 2:
                    monthString = "February";
                    break;
                case 3:
                    monthString = "March";
                    break;
                case 4:
                    monthString = "April";
                    break;
                case 5:
                    monthString = "May";
                    break;
                case 6:
                    monthString = "June";
                    break;
                case 7:
                    monthString = "July";
                    break;
                case 8:
                    monthString = "August";
                    break;
                case 9:
                    monthString = "September";
                    break;
                case 10:
                    monthString = "October";
                    break;
                case 11:
                    monthString = "November";
                    break;
                case 12:
                    monthString = "December";
                    break;
                default:
                    monthString = "Invalid month";
                    break;
            }
            System.out.println(monthString); // August
        }
    }

    // while문
    public class Sample3 {
        public static void main(String[] args) {
            int treeHit = 0;
            while (treeHit < 10) {
                treeHit++;
                System.out.println("나무를 " + treeHit + "번 찍었습니다.");
                if (treeHit == 10) {
                    System.out.println("나무 넘어갑니다.");
                }
            }
        }
    }

    // for문
    public class Sample4 {
        public static void main(String[] args) {
            String[] numbers = {"one", "two", "three"};
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }

    // for each문
    public class Sample5 {
        public static void main(String[] args) {
            String[] numbers = {"one", "two", "three"};
            System.out.println("-----방법 1-----");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            System.out.println("-----방법 2-----");
            for (String number : numbers) {
                System.out.println(number);
            }
        }
    }
}
