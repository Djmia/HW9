public class ENUM {
    //First ENUM WeekDays
                enum WeekDays {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    //Second ENUM Colors
        enum colors {RED, GREEN, WHITE, BLUE, BLACK}

    public static void main(String[] args) {

                WeekDays myDay = WeekDays.FRIDAY;
                System.out.println("Today is a: " + myDay);

        colors myColor = colors.RED;
        switch (myColor) {
            case RED: System.out.println("This color is RED");break;
            case GREEN:System.out.println("This color is GREEN");break;
            case WHITE:System.out.println("This color is WHITE");break;
            case BLUE:System.out.println("This color is BLUE");break;
            case BLACK:System.out.println("This color is BLACK");break;


        }
    }
}

