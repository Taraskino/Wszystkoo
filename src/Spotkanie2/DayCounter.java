package Spotkanie2;

public class DayCounter {
    public static void main(String[] args) {
        int yearIn = 2016;
        int monthIn = 1;
        if (args.length > 0){
            monthIn = Integer.parseInt(args[0]);
        }
        if (args.length > 1){
            yearIn = Integer.parseInt(args[1]);
        }

        System.out.println(monthIn + "/" + yearIn + " ma " + countDays(monthIn,yearIn) + " dni!");
    }

    static int countDays(int month, int year){
        int count = -1;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12: count = 30; break;
            case 2:
            if(year % 4 == 0){
                count = 29;
            } else {
                count = 28;
            }
  }
        return count;
    }
}
