import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"tommy","joel","ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear,staffLastYear.length);
        for(int i=0;i<staffThisYear.length ; i++)
        {
            staffThisYear[i] = staffLastYear[i];
        }
        staffThisYear[1] = "abby";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
    
}
