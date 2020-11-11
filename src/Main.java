import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int val;
            do {
                System.out.print("Enter your size:");
                val = Integer.parseInt(sc.nextLine());
                if (val > 20)
                    System.out.println("Your array size exceeds the range of 20:");
            } while (val > 20);

            //create an array has size =< 20;
            int[] array = new int[val];
            int i = 0;
            while (i < array.length) {
                System.out.print("Enter elements of array:");
                int element = Integer.parseInt(sc.nextLine());
                array[i] = element;
                i++;
            }
            for (int e : array) {
                System.out.printf("%d,", e);
            }
            removeX(array,",");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void removeX(int[] array, String s) {

        array.toString();
        int last = array.length -1;
        for(int i = 0;i < array.length;i++){
            
        }
    }
}
