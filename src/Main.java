public class Main {
    public static void main(String[] args) {
//                task1
        System.out.println();

        double salary = 15000;
        double total = 0;
        int months = 0;
        while (total <= 2459000) {
            total = total + salary;
            total = total * 1.01;
            months++;
            System.out.printf("Месяц %s  сумма накоплений равна %.2f рублей ", months, total);
            System.out.println();
        }

//        task2
        System.out.println();

        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

//        task3
        System.out.println();

        int population = 12_000_000;
        int birthRate = 0;
        int deathRate = 0;

        for (int years = 0; years < 11; years++) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * 8;
            population = population + birthRate - deathRate;
            System.out.println("Год " + years + " численность населения составляет - " + population);
        }

//        task4
        System.out.println();

        double capital = 15000;
        int countOfMonths = 0;
        while (capital <= 12_000_000) {
            capital = capital * 1.07;
            countOfMonths++;
            System.out.printf("Месяц - %s сумма накоплений - %.2f\n", countOfMonths, capital );
        }

//        task5
        System.out.println();

        double capitalTwo = 15000;
        int countOfMonthsTwo = 9 * 12;
        for( ; countOfMonthsTwo > 0; countOfMonthsTwo--) {
            capitalTwo = capitalTwo * 1.07;
            if (countOfMonthsTwo % 6 ==0) {
                System.out.printf("Месяцев до окончания - %s  сумма накоплений - %.2f\n", countOfMonthsTwo, capitalTwo );
            }
        }

//        task6
        System.out.println();

        int firstFriday = 1;
        for(int dayOfMonth = firstFriday; dayOfMonth < 32; dayOfMonth += 7) {
            System.out.printf("Сегодня пятница %s число, необходимо подготовить отчет\n", dayOfMonth);
        }

//        task7
        System.out.println();

        int nowYear = 2024;
        int pastEdge = nowYear - 200;
        int futureEdge = nowYear + 100;
        int periodOfComet = 79;
        for (int zeroYear = 0; zeroYear <= futureEdge; zeroYear += periodOfComet) {
            if (zeroYear >= pastEdge && zeroYear <= futureEdge) {
                System.out.println(zeroYear);
            }
        }
    }
}