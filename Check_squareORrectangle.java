import java.util.Scanner;
public class Check_squareORrectangle {
    public static void main(String[] args) {
            //Напишете програма, която проверява по дадена дължина и широчина,
            //дали фигурата е квадрат или правоъгълник
            //Дължина и широчина да се въвеждат през конзолата

            Scanner input = new Scanner(System.in);
            System.out.println("Въведете страна 'А' = ");
            float SideA = input.nextFloat();
            System.out.println("Въведете страна 'B' = ");
            float SideB = input.nextFloat();

            boolean AequalB = SideA == SideB; //is it true
            boolean negativAB = SideA <= 0 || SideB <= 0; // is it true

            float P = SideA*2 + SideB*2;
            float S = SideA*SideB;




            if (negativAB) {
                System.out.println("Отрицателна ст-ст (или 0) моля въведете положителна!");
            } else if (AequalB) {
                System.out.println("Фигурата е квадрат");
                System.out.println("---------");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("---------");
                System.out.println("\nОбиколката P = " + P);
                System.out.println("\nЛицето S = " + S);


            } else {
                System.out.println("Фигурата е правоъгълник");
                System.out.println("------------");
                System.out.println("|          |");
                System.out.println("------------");
                System.out.println("\nОбиколката P = " + P);
                System.out.println("Лицето S = " + S);
            }


        }
    }

