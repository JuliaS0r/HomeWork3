public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int a = 654839;
        byte b = -123;
        short c = 30000;
        long d = 1234567800L;
        float e = 89.098754f;
        double f = -1.0987;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("Задача 2");
        float a1 = 27.12f;
        long b1 = 987678965549L;
        float c1 = 2.786f;
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g1 = 67;
        System.out.println("Значение переменной a1 с типом float равно " + a1);
        System.out.println("Значение переменной b1 с типом long равно " + b1);
        System.out.println("Значение переменной c1 с типом float равно " + c1);
        System.out.println("Значение переменной d1 с типом short равно " + d1);
        System.out.println("Значение переменной e1 с типом short равно " + e1);
        System.out.println("Значение переменной f1 с типом short равно " + f1);
        System.out.println("Значение переменной g1 с типом byte равно " + g1);

        System.out.println("Задача 3");
        byte ludPavlovna = 23;
        byte annSergeevna = 27;
        byte ekatAndreevna = 30;
        short paper = 480;
        byte sheet =(byte) (paper / (ludPavlovna + annSergeevna + ekatAndreevna));
        System.out.println("На каждого ученика рассчитано " + sheet + " листов бумаги");

        System.out.println("Задача 4");
        byte product = 16;
        byte time = 2;
        byte speed = (byte) (product / time);
        byte time20 = 20;
        int product20 = speed * time20;
        System.out.println("За 20 минут машина произвела " + product20 + " штук бутылок");
        short time1 = 24 * 60;
        int product1 =  speed * time1;
        System.out.println("За сутки машина произвела " + product1 + " штук бутылок");
        short time3 = 3 * 24 * 60;
        int product3 = speed * time3;
        System.out.println("За 3 дня машина произвела " + product3 + " штук бутылок");
        int timeMonth = 30 * 24 * 60;
        int productMonth = speed * timeMonth;
        System.out.println("За месяц машина произвела " + productMonth + " штук бутылок");

        System.out.println("Задача 5");






    }

}