public class Main {
    public static void main(String[] args) {
        //Задача 1
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

        //Задача 2
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

        //Задача 3
        byte ludPavlovna = 23;
        byte annSergeevna = 27;
        byte ekatAndreevna = 30;
        short paper = 480;
        byte sheet =(byte) (paper / (ludPavlovna + annSergeevna + ekatAndreevna));
        System.out.println("На каждого ученика рассчитано " + sheet + " листов бумаги");

        //Задача 4
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

        //Задача 5
        byte color = 120;
        byte white1 = 2;
        byte brown1 = 4;
        byte color1 = (byte) (white1 + brown1);
        byte numClass = (byte) (color / color1);
        byte white = (byte) (numClass * white1);
        byte brown = (byte) (numClass * brown1);
        System.out.println("В школе, где " + numClass + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

        //Задача 6
        byte quantityBanana = 5;
        byte oneBanana = 80;
        short banana = (short) (quantityBanana * oneBanana);
        short quantityMilk = 200;
        byte milk100 = 105;
        short milk = (short) (quantityMilk * milk100);
        byte quantityIce = 2;
        byte oneIce = 100;
        short ice = (short) (quantityIce * oneIce);
        byte quantityEgg = 4;
        byte oneEgg = 70;
        short egg = (short) (quantityEgg * oneEgg);
        int weightSportG = banana + milk + egg + ice;
        int grPerKg = 1000;
        float weightSportKg = weightSportG/(float)grPerKg;
        System.out.println("Вес спортивного завтрака - " + weightSportG + " граммов");
        System.out.println("Вес спортивного завтрака - " + weightSportKg + " килограмм");

        //Задача 7
        short weight250 = 250;
        short weight500 = 500;
        byte allWeight = 7;
        int grPKg = 1000;
        int day250 = allWeight * grPKg / weight250;
        System.out.println("Максимальное количество - " + day250 + " дней");
        int day500 = allWeight * grPKg / weight500;
        System.out.println("Минимальное количество - " + day500 + " дней");
        int dayMiddle = (day250 + day500) / 2;
        System.out.println("Среднее количество - " + dayMiddle + " день");

        //Задача 8
        float masha = 67760.0F;
        float mashaMoney = (float) (masha * 1.1);
        float moneyM = mashaMoney - masha;
        System.out.println("Маша теперь получает " + mashaMoney + " рублей. Годовой доход вырос на " + moneyM + " рублей");
        float denis = 83690.0F;
        float denisMoney = (float) (denis * 1.1);
        float moneyD = denisMoney - denis;
        System.out.println("Денис теперь получает " + denisMoney + " рублей. Годовой доход вырос на " + moneyD + " рублей");
        float kris = 76230.0F;
        float krisMoney = (float) (kris * 1.1);
        float moneyK = krisMoney - kris;
        System.out.println("Кристина теперь получает " + krisMoney + " рублей. Годовой доход вырос на " + moneyK + " рублей");









    }

}