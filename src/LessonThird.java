import java.util.Arrays;
import java.util.Random;

public class LessonThird {
    public static void main(String[] args) {
        int[] g = Arrayss ();
        for(int s = 0 ; s<= g.length-1;s++){
            System.out.print(g[s] + " ");
        }
        System.out.println("");
        for(int s = 0 ; s<= g.length-1;s++){
            SortArray(g);
            System.out.print(g[s] + " ");
        }
        System.out.println("");
        for(int s = 0 ; s<= g.length-1;s++){
           System.out.print(g[s] + " ");
        }
        System.out.println("");
        String[] str = StringArrays();
        for(int s = 0 ; s<= str.length-1;s++) {

            System.out.print(str[s] + " ");
        }
        System.out.println("");
        for(int s = 0 ; s<= str.length-1;s++) {
            Arrays.sort(str);
            System.out.print(str[s] + " ");
        }
        System.out.println("");
    }

    public static int[] Arrayss () {
        int arr[] = new int[8];
        for (int x = 0; x <= arr.length-1; x++) {
            arr[x] = (int) (Math.random() * 100);
        }

        return arr;
    }
    public static void SortArray(int[] arr){
        Arrays.sort(arr);
    }
    public static String[] StringArrays(){
        String str[] = new String [10];
        Random random = new Random();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int s = 0 ; s <= str.length-1 ; s++) {
            int number = random.nextInt(alphabet.length-1);
            int numberr = random.nextInt(alphabet.length-1);
            int numberrr = random.nextInt(alphabet.length-1);
            int numberrrr = random.nextInt(alphabet.length-1);
            String Name = new StringBuilder().append(alphabet[number]).append(alphabet[numberr]).append(alphabet[numberrr]).append(alphabet[numberrrr]).toString();
            str[s] = (Character.toUpperCase(Name.charAt(0))+ Name.substring(1));;
        }
        return str;
    }
}
