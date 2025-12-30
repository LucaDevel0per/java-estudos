package semanaTres.Basics;

public class Conditions {
    static void main() {

        boolean isRaining = false;

        if (isRaining) System.out.println("Bring an umbrella!");
         else {
            System.out.println("It will be sunny.");
        }

         int time = 22;

         if (time < 18) {
             System.out.println("Good Afternoon!");
         } else if (time < 20) {
             System.out.println("Good evening.");
         } else {
             System.out.println("Good Morning.");
         }


         int day = 1;
         switch (day) {
             case 1:
                 System.out.println("Sunday");
                 break;
             case 2:
                 System.out.println("Monday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Tuesday");
                 break;
             default:
                 System.out.println("Looking forward to the weekend.");
         }
    }
}
