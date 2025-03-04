package test1;

public class SelfTest014 {

    public static void main(String[] args) {
        for(int j = 2; j <= 4; j++) { 
            System.out.println(j + "단");
            for(int i = 1; i <= 9; i++) { 
                System.out.printf("%d * %d = %d\n", j, i, j * i);
            }
            System.out.println();
        }
    }
}
