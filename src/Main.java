public class Main {
    public static void main(String[] args) {
        byte tyk = 1;
        short tyDyk = 2;
        int tyDyDyk = 3;
        long tyDyDyDyk = 4L;
        float fyr = (float)5.0;
        double fyrFyr = 6.0;
        System.out.println("Задача 1" );
        System.out.println("Значение переменной tyk с типом byte равно 1" );
        System.out.println("Значение переменной tyDyk с типом short равно 2" );
        System.out.println("Значение переменной tyDyDyk с типом int равно 3" );
        System.out.println("Значение переменной tyDyDyDyk с типом long равно 4" );
        System.out.println("Значение переменной fyr с типом float равно 5.0" );
        System.out.println("Значение переменной fyrFyr с типом double равно 6.0" );

        double apple = 27.12;
        long plum = 987678965549L;
        float pumpkin = 2.786f;
        short peach = 569;
        int grass = -159;
        int bananaaa = 27897;
        byte tomato = 67;

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int students = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paper = 480;
        int sheets = paper/students;
        System.out.println(" ");
        System.out.println("Задача 3");
        System.out.println("На одного ученика рассчитано " + sheets + " листов бумаги");

        byte bottleInMinute = 16 / 2;
        int twentyMinutes = bottleInMinute * 20;
        int twentyFourHours = bottleInMinute * 60 *24;
        int threeDays = twentyFourHours * 3;
        int oneMonth = twentyFourHours * 30;
        System.out.println(" ");
        System.out.println("Задача 4");
        System.out.println("За 20 имнут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + twentyFourHours + " штук бутылок");
        System.out.println("За трое суток машина произвела " + threeDays + " штук бутылок ");
        System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок");

        short cansOfPaint = 120;
        short whitePaint = 120 / 3;
        int brownPaint = cansOfPaint - whitePaint;
        int classesInSchool = cansOfPaint / 6;
        System.out.println(" ");
        System.out.println("Задача 5");
        System.out.println("В школе где " + classesInSchool + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        int banana = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;
        int g = banana + milk + iceCream + eggs;
        float kg = (float) g / 1000;
        System.out.println(" ");
        System.out.println("Задфча 6");
        System.out.println("На завтрак спортсмен съедает " + g + " грамм, или " + kg + " килограмм еды.");

        short weight = 7000;
        short min = 250;
        short max = 500;
        int minDays = weight / max;
        int maxDays = weight / min;
        int averageNumberOfDays = (minDays + maxDays) / 2;
        System.out.println(" ");
        System.out.println("Задача 7");
        System.out.println("При потере веса на 500 гр. в день для достижения необходимого результата спортсмену понадобится " + minDays + " дней.");
        System.out.println("При потере веса на 250 гр. в день для достижения необходимого результата спортсмену понадобится " + maxDays + " дней.");
        System.out.println("В среднем для похудения на 7 кг, при соблюдении рекомендованной диеты, спортсмен потратит " + averageNumberOfDays + " день.");
        //Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило:
        // чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет,
        // получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым
        // доходом с нынешней зарплатой и после повышения.
        //Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //
        //Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
        float masha = 67760.0f;
        float denis = 83690.0f;
        float kristina = 76230.0f;
        float salaryM = masha / 100 * 110f;
        float salaryD = denis / 100 * 110f;
        float salaryK = kristina / 100 * 110f;
        float incomeForTheYearM = (salaryM - masha) * 12f;
        float incomeForTheYearD = (salaryD - denis) * 12f;
        float incomeForTheYearK = (salaryK - kristina) * 12f;
        System.out.println(" ");
        System.out.println("Задача 8");
        System.out.println("Маша теперь получает " + salaryM + "р., годовой доход увеличился на " + incomeForTheYearM + "р.");
        System.out.println("Денис теперь получает " + salaryD + "р., годовой доход увеличился на " + incomeForTheYearD + "р.");
        System.out.println("Кристина теперь получает " + salaryK + "р., годовой доход увеличился на " + incomeForTheYearK + "р. ");


    }
}