package basic;

public class Lesson5Homework {
    public static void main(String[] args) {
        System.out.println(isPositive(18));
        System.out.println(numberBetween100and200(100));
        weekend(6);
        welcome("Aslan","Isaev",'m');
    }

    public static boolean isPositive(int number) {
        return (number > 0) && (number % 17 == 0);
    }

    public static boolean numberBetween100and200(int number) {
        return (number >= 100 & number <= 200);
    }

    public static void weekend(int number) {
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        }

    }

    public static void welcome(String name, String surname, char gender){
        String greeting = "Здравствуйте уважаем";
        switch (gender)
        {
            case 'm': greeting +="ый ";
            break;
            case 'f': greeting += "ая ";
            break;
            default: greeting += "ое ";
        }
        greeting +=  name +" "+ surname;
        System.out.println(greeting);
    }

    public static double converter(double euro, char currency)
    {
        double sum;
        if (currency == 'F')
            sum = euro*396;
        else if (currency== 'U')
            sum = euro*1.06;

        else sum= euro* 2324;
        return sum;
    }
}
