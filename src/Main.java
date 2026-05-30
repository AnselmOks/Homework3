public class Main {
    public static void main(String[] args) {

        //Задача 1
        byte varByte = 1;
        short varShort = 1;
        int varInt = 1;
        long varLong = 1L;
        float varFloat = 1.0F;
        double varDouble = 1.0;
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);

        //Задача 2
        float varFloat2 = 27.12F;
        long varLong2 = 987678965549L;
        short varShort2 = 2786;
        short varShort3 = 569;
        short varShort4 = -159;
        short varShort5 = 27897;
        byte varByte2 = 67;

        //Задача 3
        byte numStudentsLP = 23;
        byte numStudentsAS = 27;
        byte numStudentsEA = 30;
        short numOfPapers = 480;
        System.out.println("На каждого ученика рассчитано " +
                numOfPapers / (numStudentsLP + numStudentsAS + numStudentsEA)
                + " листов бумаги");

        //Задача 4
        byte productivity = 16;
        byte time = 2;
        int productivity20 = productivity / time * 20;
        int productivityDay = productivity / time * (60 * 24);
        int productivity3Days = productivity / time * (60 * 24 * 3);
        int productivityMonth = productivity / time * (60 * 24 * 30);
        System.out.println("За 20 минут машина произвела " + productivity20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivity3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок");

        //Задача 5
        byte totalJars = 120;
        byte whiteJarsPerRoom = 2;
        byte brownJarsPerRoom = 4;
        int numRooms = totalJars / (whiteJarsPerRoom + brownJarsPerRoom);
        System.out.println("В школе, где " + numRooms + " классов, нужно " +
                whiteJarsPerRoom * numRooms + " банок белой краски и " +
                brownJarsPerRoom * numRooms + " банок коричневой краски");

        //Задача 6
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        short milkWeightPer100 = 105;
        byte iceCream = 2;
        byte weightIceCream = 100;
        byte eggs = 4;
        byte weightEgg = 70;

        int recipeInGrams = bananas * bananaWeight + (milk / 100 * milkWeightPer100) + iceCream * weightIceCream +
                eggs * weightEgg;
        System.out.println("Рецепт в граммах " + recipeInGrams);
        float recipeInKilograms = recipeInGrams / 1000F;
        System.out.println("Рецепт в килограммах " + recipeInKilograms);

        //Задача 7
        short lossWeight1 = 250;
        short lossWeight2 = 500;
        short goalWeight = 7000;
        System.out.println("Если худеть на 250 граммов в день, то потребуется " + goalWeight / lossWeight1 + " дней");
        System.out.println("Если худеть на 500 граммов в день, то потребуется " + goalWeight / lossWeight2 + " дней");
        System.out.println("В среднем потребуется " +
                (goalWeight / lossWeight1 + goalWeight / lossWeight2) / 2 + " дней");

        //Задача 8
        float salaryMasha = 67760F;
        float salaryDenis = 83690F;
        float salaryKristina = 76230F;
        float newSalaryMasha = salaryMasha * 1.1F;
        float newSalaryDenis = salaryDenis * 1.1F;
        float newSalaryKristina = salaryKristina * 1.1F;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на "
                + (newSalaryMasha * 12 - salaryMasha * 12) + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на "
                + (newSalaryDenis * 12 - salaryDenis * 12) + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на "
                + (newSalaryKristina * 12 - salaryKristina * 12) + " рублей");

        //Test2

    }
}