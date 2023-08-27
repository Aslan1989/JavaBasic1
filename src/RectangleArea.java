public class RectangleArea {
    public static void main(String[] args) {
        rectangleArea(3,5);
        circumferenceLength(2.5);

        System.out.println("The current account state is: " + amountInTheBank(1250,0.035,15));
    }
    // main

    public static void rectangleArea(double x, double y){
        double z = x*y;
        System.out.println("Площадь прямоугольника равна: " + z);
    }

    public static void circumferenceLength(double length){

        double pi = 3.14;
        double multi = 2*pi*length;
        System.out.println("Длина окружности равна: " + multi);
    }

    public static double amountInTheBank(double money, double percent, int years){
        return money * Math.pow(1 + percent,years);
    }
}
