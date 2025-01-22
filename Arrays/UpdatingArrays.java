import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu ={"espresso","iced coffee","macchiato"};
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);

        String[] newMenu = new String[5];

        for(int i=0;i<menu.length;i++)
        {
            newMenu[i] = menu[i];
    
        }
        newMenu[3] ="house blend";
        newMenu[4]= "dark roast";
        System.out.println(Arrays.toString(newMenu));
    }
    
}
