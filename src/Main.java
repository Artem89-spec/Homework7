public class Main {
    public static void main(String[] args) {
        //Задача 1
        int total = 0;
        int money = 15000;
        int month = 0;
        while (total < 2_459_000) {
            month++;
            total += money;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.%n", month, total);
        }
        System.out.println();

        //Задача 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.printf("%d ", i);
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");


        //Задача 3
        double population = 12_000_000;//начальное население
        int numberYears = 0; // счетчик лет
        double ratioBirthRate = 17.0 / 1000; // 17 на 1000 человек в год
        double ratioMortalityRate = 8.0 / 1000; //8 на 1000 человек в год

        //обновляем численность населения поэтапно каждый год до 10 лет включительно
        while (numberYears < 10) {
            numberYears++;
            double totalBirth = ratioBirthRate * population; // общая рождаемость в год
            double totalMortality = ratioMortalityRate * population; //общая смертность в год
            double populationGrowth = totalBirth - totalMortality; //чистый прирост населения
            population += populationGrowth;
            System.out.printf("Год %d, численность населения составляет %.0f%n", numberYears, population);
        }
        System.out.println();

        //Задача 4
        double deposit = 15000; // сумма вносилась единожды и не менялась
        double interestRate = 0.07; // 7% ежемесячно фиксировано
        int numberMonth = 0; //счетчик месяцев
        while (deposit < 12_000_000) {
            numberMonth++;
            deposit += deposit * interestRate;
            // выводим номер месяца и текущую сумму накоплений
            System.out.printf("Месяц %d, сумма накоплений %.2f%n", numberMonth, deposit);
        }
        // выводим общее количество месяцев, необходимых для достижения цели
        System.out.printf("Нужно копить %d месяцев, чтобы собрать сумму в 12 миллионов рублей.%n", numberMonth);
        System.out.println();

        //Задача 5
        // стартовые переменные были объявлены ранее, заново их инициализирую
        deposit = 15000;
        numberMonth = 0;
        while (deposit < 12_000_000) {
            numberMonth++;
            deposit += deposit * interestRate;
            //вывожу сумму накоплений за каждый 6 месяц
            if (numberMonth % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %.2f%n", numberMonth, deposit);
            }
        }
        System.out.println();

        //Задача 6
        // стартовые переменные были объявлены ранее, заново их инициализирую
        deposit = 15000;
        numberMonth = 0;
        //9 лет это 108 месяцев
        while (numberMonth <= 108) {
            numberMonth++;
            deposit += deposit * interestRate;
            //вывожу сумму накоплений за каждый 6 месяц
            if (numberMonth % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %.2f%n", numberMonth, deposit);
            }
        }
        System.out.println();

        //Задача 7
        int reportingDay = 5; // 1 отчетный день
        int currentDay = 1; //текущий день в месяце
        //выводим дату каждой пятницы месяца, при условии, что в месяце 31 день
        while (currentDay <= 31) {
            if (currentDay == reportingDay) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.%n", currentDay);
                reportingDay += 7;
            }
            currentDay++;
        }
        System.out.println();

        //Задача 8
        int yearOfComet = 0;//начальное значение появления кометы
        int currentYear = 2025;//текущий год
        int followingYear = currentYear + 100;//диапазон последующих лет
        int previousYear = currentYear - 200;//диапазон предшествующих лет
        int period = 79; // период появления кометы

        while (yearOfComet <= currentYear) {
            if (yearOfComet >= previousYear ) {
                System.out.println(yearOfComet);
            }
            yearOfComet += period;
        }

        while (yearOfComet <= followingYear) {
            System.out.println(yearOfComet);
            yearOfComet += period;
        }
    }
}