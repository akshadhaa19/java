public class ArrayLoops {
    public static void main(String[] args) {
        int[][] grades = {
            {72,74,78,76} , {65,64,61,67} , {95,98,99,100}
        };

        for(int i=0;i<grades.length;i++)
        {
            switch (i) {
                case 0: System.out.print("\t harry: "); break;
                case 1: System.out.print("\t ron: "); break;
                case 2: System.out.print("\t hermoine: "); break;
            }
            for(int j=0;j<grades[i].length;j++)
            {

            System.out.print(grades[i][j] + " ");
        }
        System.out.println("\n");

    }
    }
}

