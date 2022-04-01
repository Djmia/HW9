import java.util.Scanner;
public class SchoolRating {
    public static void main(String[] args) {
        //Училище - оценки
        //Под 25 - F
        //от 25 до 45 - E
        //от 45 до 50 - D
        //от 50 до 60 - C
        //от 60 до 80 - B
        //Над 80 - A
        //Програма, която по въведен резултат да изписва оценката


        Scanner input = new Scanner(System.in);
        System.out.println("Въведете резултат от изпита: " );
        int result = input.nextInt();

        if (result <= 0) {
            System.out.println("Оценката не може да бъде отрицателна ст-ст или 0!!! " );
        } else if (result <25) {
            System.out.println("Вашата оценка е: 'F' " );
        } else if (result >=25 && result <45) {
            System.out.println("Вашата оценка е: 'E' " );
        } else if (result >=45 && result < 50) {
            System.out.println("Вашата оценка е: 'D' " );
        } else if (result >=50 && result <60) {
            System.out.println("Вашата оценка е: 'C' " );
        } else if (result >=60 && result <80) {
            System.out.println("Вашата оценка е: 'B' " );
        }  else {
            System.out.println("Вашата оценка е: 'A' " );
        }
    }
}

