import java.util.Scanner;
public class DiscountShop {
    public static void main(String[] args) {
        //Отстъпка в спортен магазин
        //Дрехи - 20%
        //Обувки - 10%
        //Всичко друго - 5%
        //Програма, която потребителя въвежда: Вид стока, Цена на артукула,
        //и се изчислява крайна сума с отстъпката


        Scanner input = new Scanner(System.in);
        System.out.println("Въведете вид на продукта: ");
        System.out.println("\t\t'1' - за дрехи: ");
        System.out.println("\t\t'2' - за обувки: ");
        System.out.println("\t\t'3' - за друго: ");
        int value = input.nextInt();

        if (value <=0 || value >=4) {
            System.out.println("\nНевалидна стойност! Must be from 1 to 3:  ");

        }else
            switch(value) {

                case 1: System.out.println("Избран продукт => Дрехи");
                    System.out.println("Моля въведете цена на продукта");
                    double price = input.nextDouble();
                    price = price - price*0.20;
                    System.out.printf("Цената на дрехите след отстъпка е: BGN %.2f%n ", price);
                    break;

                case 2: System.out.println("Избран продукт => Обувки");
                    System.out.println("Моля въведете цена на продукта");
                    double price2 = input.nextDouble();
                    price2 = price2 - price2*0.10;
                    System.out.printf("Цената на обувките след отстъпка е: BGN %.2f%n ", price2);
                    break;

                default: System.out.println("Избран продукт => Друго");
                    System.out.println("Моля въведете цена на продукта");
                    double price3 = input.nextDouble();
                    price3 = price3 - price3*0.05;
                    System.out.printf("Цената на друг артикул след отстъпка е: BGN %.2f%n ", price3);
                    break;

            }

    }
}
