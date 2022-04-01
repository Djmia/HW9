import java.util.Scanner;
public class WorkBonus {

        public static void main(String[] args) {
            //Бонус от 5%
            //Ако е рабтил повече от 5 г. - 5%
            //Ако е рабтил повече от 10 г. - 7%
            //Ако е рабтил повече от 15 г. - 10%
            //Програма, която по въведена заплата и стаж, изчислява бонуса


            Scanner input = new Scanner(System.in);
            System.out.println("Въведете вашата заплата: " );
            double salary = input.nextFloat();
            System.out.println("Въведете години стаж във фирмата: " );
            int yars = input.nextInt();

            boolean minSalary = salary < 780; //is it true
            boolean minYars = yars <0 || yars >68; //is it true

            if (minSalary || minYars) {
                System.out.println("Невалидни входни параметри! \nЗаплата или стаж " );

            } else if (yars < 5) {
                System.out.println("Стажа ви е по-малък от 5 години" );
                System.out.println("Вие сте извън условията за начисляване на бонус" );
            } else if (yars >= 5 && yars <10) {
                salary = salary*0.05;
                System.out.println("Стажа ви е в периода от 5 до 10 год." );
                System.out.printf("Вашият бонус е: BGN %.2f%n ", salary );

            } else if (yars >=10 && yars <15) {
                salary = salary*0.07;
                System.out.printf("Вашият бонус е: BGN  %.2f%n", salary);
            } else {
                salary = salary*0.10;
                System.out.printf("Вашият бонус е: BGN  %.2f%n", salary);
            }



        }
    }

