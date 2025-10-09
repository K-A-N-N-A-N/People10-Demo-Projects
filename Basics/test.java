public class test{

    //Enums
    enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    enum PowerLevel{
        LOW(25), MEDIUM(50), HIGH(75), VERY_HIGH(100);

        int power;

        PowerLevel(int value){
        power = value;
    }
    }

    public static void main(String[] args){
        Days DayArray[] = Days.values();

        System.out.println("Days of the week :");
        for(Days d: DayArray){
            System.out.print(d+" ");
        }

        System.out.println("\n\nPower Levels :");
        System.out.println("LOW : "+PowerLevel.LOW.power);
    }
}