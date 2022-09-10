public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int first = 100;
        System.out.println("Значение переменной first с типом int равно " + first);
        byte second = 50;
        System.out.println("Значение переменной second с типом byte равно " + second);
        short third = 150;
        System.out.println("Значение переменной third с типом short равно " + third);
        long fourth = 300L;
        System.out.println("Значение переменной fourth с типом long равно " + fourth);
        float fifth = 3.14F;
        System.out.println("Значение переменной fifth с типом float равно " + fifth);
        double sixth = 14.345647;
        System.out.println("Значение переменной sixth с типом double равно " + sixth);

        // Задача 2
        System.out.println("Задача 2");
        float potatoesWeigth = 27.12f;
        long sugar = 987678965549L;
        byte cat = 4;
        short dog = 786;
        boolean catAdult = cat < 2;
        int peoples = 569;
        short cash = -159;
        int town = 27897;
        byte cents = 67;
        System.out.println(catAdult);

        // Задача 3
        System.out.println("Задача 3");
        byte ludmila = 23;
        byte ann = 27;
        byte kate = 30;
        int totalstudents = ludmila + ann + kate;
        short paperLists = 480;
        int listToStudent = paperLists / totalstudents;
        System.out.println("На каждого ученика рассчитано " + listToStudent + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        byte bootlesMinute = 8;  // Кол-во бутылок за 1 минуту

        int minute20 = bootlesMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + minute20 + " штук");

        int day = 24 * 60; // минут в сутках
        int dayCapacity = day * bootlesMinute;
        System.out.println("За сутки машина произвела бутылок " + dayCapacity + " штук");

        int threeDay = day * 3;
        int threeDayCapacity = threeDay * bootlesMinute;
        System.out.println("За 3 дня машина произвела бутылок " + threeDayCapacity + " штук");

        long mounth = day * 31;
        long mounthCapacity = mounth * bootlesMinute;
        System.out.println("За месяц машина произвела бутылок " + mounthCapacity + " штук");

        // Задача 5
        System.out.println("Задача 5");







    }
}