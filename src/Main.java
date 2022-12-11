import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание 1");
            int capital = 15000;
            int bankAccount = 2_459_000;
            int total = 0;
            int month = 0;
            while (total <= bankAccount) {
                month=month+1;
                total = total + capital;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);
        System.out.println(month);
    }
    public static void task2() {
        System.out.println("Задание 2");
            int i = 1;
            while (i <= 10){
                System.out.print(i+ " ");
                i = i + 1;
            }
        System.out.println();
            for (i = 10; i > 0; i--){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate1000 = 17;
        int mortality1000 = 8;
        int size1000 = birthRate1000-mortality1000;
        int year = 1;
        while (year <= 10){
            System.out.println("Год " +year+", численность населения составляет "+population);
            year=year+1;
            population = population +(population / 1000 * size1000);
        }
    }
}