package LmsTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Күндөргө enum түзүңүз (Monday, Tuesday ...)
         Консолдон бир күндү белгилеңиз. Эгер Monday болсо - анда "Дуйшөмбү куну жава окуйм" же Tuesday болсо - анда "Шейшемби күнү англис тили сабагын окуйм" деп күнгө жараша кайсы сабакты окуганыңызды консолго чыгарыңыз.
         Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.*/
        while(true){
        System.out.print("Input a week day:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine().toUpperCase();
        switch (name){
            case "MONDAY"-> System.out.println(Days.MONDAY.getDayName());
            case "TUESDAY"-> System.out.println(Days.TUESDAY.getDayName());
            case "WEDNESDAY"-> System.out.println(Days.WEDNESDAY.getDayName());
            case "THURSDAY"-> System.out.println(Days.THURSDAY.getDayName());
            case "FRIDAY"-> System.out.println(Days.FRIDAY.getDayName());
            case "SATURDAY"-> System.out.println(Days.SATURDAY.getDayName());
            case "SUNDAY"-> System.out.println(Days.SUNDAY.getDayName());
            }
        }
    }
}
