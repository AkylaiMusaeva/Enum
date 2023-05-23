import javax.swing.plaf.synth.Region;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Regions[] region=Regions.values();
       // System.out.println(Arrays.toString(region));//первый вариант
        for (Regions r: region) {                               //второй вариант
            System.out.println(r.name()+" : "+r.getDifference() );
        }




    }
}