import java.util.Date;
import java.util.Scanner;
public class MoviePrice {
    public static void main(String[] args) {

        //Кино: 7 членно семейство,
        //2 - пенсионери, 2 - възрастни,
        //1 студент, 1 - непълнолетен(ученик), 1 - дете на 11 години (ученик)
        //Отстъпки:
        //Пенсионери - 10%
        //Студенти - 30%
        //Ученици - 50%
        //Деца до 7 години - 100%
        //Колко ще плати семейството???


        double DiscPensioners = 0.10;
        double DiscStudents = 0.30;
        double DiskSchool = 0.50;
        double DiskKidsTo7Years = 0;
        double DiskReborn = 0;

        Date today = new Date();
        System.out.println("Днес е: " + today);
        System.out.println("====================================");

        Scanner input = new Scanner(System.in);
        System.out.println("Въведете редовна цена на билета:");
        int price = input.nextInt();

        if (price <= 0) {
            System.out.println("Цената на билета не може да е < или = на '0' !");
        } else {

            System.out.println("Въведете брой Пенсионери:");
            int pensioners = input.nextInt();
            double pensPrice = price * pensioners - price * pensioners * DiscPensioners;

            System.out.println("Въведете брой хора на редовна цена (родители и деца над 18 години):");
            int reborn = input.nextInt();
            double rebornPrice = price * reborn;

            System.out.println("Въведете брой Студенти:");
            int students = input.nextInt();
            double studPrice = price * students - price * students * DiscStudents;

            System.out.println("Въведете брой Ученици:");
            int school = input.nextInt();
            double schoolPrice = price * school - price * school * DiskSchool;

            System.out.println("Въведете брой Деца под 7 години:");
            int kids = input.nextInt();
            double kidsPrice = price * kids * DiskKidsTo7Years;

            String kind = "Вид";
            String one = "Пенсионери";
            String two = "Възрастни";
            String tree = "Студенти";
            String fout = "Ученици";
            String five = "Деца до 7г";
            String discount = "Отстъпка";
            String Total = "Тотал";
            String price2 = "Обща цена";
            String price1 = "Цена";
            String count = "Брой";

            System.out.println("\nРедовна цена на билета: BGN " + price);
            System.out.println("========================================");
            System.out.printf("|%-12s|%-12s|%-12s|%-12s|%-12s|%-12s|%n", kind, one, two, tree, fout, five);
            System.out.printf("|%-12s|%-12d|%-12d|%-12d|%-12d|%-12d|%n", count, pensioners, reborn, students, school, kids);
            System.out.printf("|%-12s|%-12d|%-12d|%-12d|%-12d|%-12d|%n", price1, price * pensioners, price * reborn, price * students, price * school, price * kids);
            System.out.printf("|%-12s|-%-11.2f|-%-11.2f|-%-11.2f|-%-11.2f|-%-11s|%n", discount, price * DiscPensioners * pensioners, price * DiskReborn * reborn, price * DiscStudents * students, price * DiskSchool * school, kids * price);
            System.out.printf("|%-12s|%-12.2f|%-12.2f|%-12.2f|%-12.2f|%-12.2f|%n", price2, pensPrice, rebornPrice, studPrice, schoolPrice, kidsPrice);

            double finalPrice = pensPrice + studPrice + schoolPrice + kidsPrice + rebornPrice;
            System.out.printf("%n|%-12s|%-12.2f%n", Total, finalPrice);

        }
    }
}