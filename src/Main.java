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
        byte totalBanks = 120;
        byte whiteColour = 2;
        byte brownColour = 4;
        int totalColour = whiteColour + brownColour;

        int totalClass = totalBanks / totalColour; // всего классов
        int whiteTotal = whiteColour * totalClass; // белой краски всего
        int brownTotal = brownColour * totalClass; // коричневой краски всего
        System.out.println("В школе, где " + totalClass + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");

        byte bananas = 5;     //Кол-во ингридиентов
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;

        int bananasWeight = bananas * 80;  // переводим в граммы
        float milkWeight = milk * 1.05f;
        int iceCreamWeight = iceCream * 100;
        int eggsWeight = eggs * 70;

        float cocktail = (bananasWeight + milkWeight + iceCreamWeight + eggsWeight) / 1000f;
        System.out.println("Вес завтрака " + cocktail + " кг");

        // Задача 7
        System.out.println("Задача 7");

        // 250 гр. = 0.25 кг
        // 500 гр. = 0.5 кг

        int totalMass = 7000;
        short oneWight = 250;
        short twoWeight = 500;

        int oneSet = totalMass / oneWight;
        System.out.println( oneSet + " дней уйдет на похудение, если спортсмен будет терять 250 грамм в день");
        int twoSet = totalMass / twoWeight;
        System.out.println(twoSet + " дней уйдет на похудение, если спортсмен будет терять 500 грамм в день");
        int average = (oneSet + twoSet) / 2;
        System.out.println(average + " дней уйдет на похудение в среднем");

        // Задача 8
        System.out.println("Задача 8");

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;

        int yearMasha = masha * 12; // Прежний годовой доход
        int yearDenis = denis * 12;
        int yearKris = kris * 12;

        int mashaUp = masha + (masha / 10); // Повышенная з/п
        int denisUp = denis + (denis / 10);
        int krisUp = kris + (kris / 10);

        int yearMashaUp = mashaUp * 12; // Новый годовой доход
        int yearDenisUp = denisUp * 12;
        int yearKrisUp = krisUp * 12;

        int mashaDif = yearMashaUp - yearMasha; // Разница годового
        int denisDif = yearDenisUp - yearDenis;
        int krisDif = yearKrisUp - yearKris;

        System.out.println("Маша теперь получает " + mashaUp + " рублей. Годовой доход вырос на " + mashaDif + " рублей");
        System.out.println("Денис теперь получает " + denisUp + " рублей. Годовой доход вырос на " + denisDif + " рублей");
        System.out.println("Кристина теперь получает " + krisUp + " рублей. Годовой доход вырос на " + krisDif + " рублей");







    }
}