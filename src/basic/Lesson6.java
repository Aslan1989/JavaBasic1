package basic;

public class Lesson6 {
    public static void main(String[] args) {
        printInterval(1,20,4);
        System.out.println(getSumOfInterval(1,20,4));

        // маша выдает 50 кредитов в месяц
        // Петя выдает в месяц 0.6 от производительности Маши
        // Вася выдает в четный месяц 0.9 от Пети и в нечетный о0.5 от маши
        int m =1; // месяц
        int sum = 0; // общее кол во кредитов выданных Машей, Петей и Васей
        while (sum < 2100)
        {
            sum+=50;
            sum+=0.6*50;
            if (m % 2 == 0)
            {
                sum += 0.9*0.6*50; // Вася в четный месячц
            }
            else {
                sum+=0.5*50; // Вася в нечетный месяц
            }
            m+= 1;
        }
        System.out.println("Month: " + m);

        // Распечатать исло Фибоначччи от 1 до 500
        // 0 1 1 2 3 5
        int a = 0;
        int b = 1;
        while (b <= 500)
        {
            System.out.println(b);
            int temp = b;
            b = b + a;
            a = temp;

        }

        System.out.println(factorial(5));

        int leftNumber =1;
        while (leftNumber <=9)
        {
            System.out.println("************");
            int rightNumber = 1;
            while (rightNumber <=9)
            {
                System.out.println("" + leftNumber + "*" + rightNumber + "=" +(leftNumber*rightNumber));
                rightNumber++;
            }
            leftNumber++;
        }
        System.out.println(printSumOfDigits(453));
    }
    // main

    // Напишите функцию возвращающую сумму цифр передаваемого в нее числа. Пример : 453 -> 4 + 5 + 3 = 12
    public static int printSumOfDigits(int number)
    {
        String t = "" + number; // "453"
        int i = 0;
        int sum = 0;
        while (i < t.length())
        {
            String d = "" + t.charAt(i);
            int digit = Integer.parseInt(d);
            sum += digit;
            i++;
        }
        return sum;
    }

    // Напишите функцию, возвращающую факториал от переданного в нее целого числа n! = 1*2*3* ...*n

    public static int factorial(int number)
    {
        int factorial = 1;
        int i = 1;
        while (i <= number)
        {
            factorial*=i;
            i++;
        }
        return factorial;
    }



    public static void printInterval(int a, int b, int c)
    {
        int i = a;
        while (i <= b)
        {
            System.out.println("number is: " + i);
            i += c;
        }
    }

    public static int getSumOfInterval(int a, int b, int c){
        int sum = 0;
        int i = a;
        while (i <= b)
        {
            sum += i;
            i += c;
        }
        return sum;
    }
}
