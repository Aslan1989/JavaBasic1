package basic;

public class Lesson5Homework {
    public static void main(String[] args) {
        System.out.println(isPositive(18));
    }

    public static boolean isPositive(int number){
       return (number>0) && (number % 17 == 0);
    }

}
