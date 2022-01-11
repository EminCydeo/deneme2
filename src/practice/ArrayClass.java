package practice;
import java.util.Arrays;
public class ArrayClass {
    public static void main(String[] args) {

String [] names={"John", "Smith", "Shay", "Breanna", "Josh"};


        System.out.println(Arrays.toString(names));
        System.out.println("---------------------");

        int [] numbers={1,2,35,6,5};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println("--------");

        char [] arr1={'a','b','c'};
        char[] arr2={'a','c','b'};

        System.out.println(Arrays.equals(arr1,arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));

        int[] scores={45,25,65,85,46};
        int [] scores2=Arrays.copyOf(scores, 7);
        System.out.println(Arrays.toString(scores2));
        int [] scores3=Arrays.copyOf(scores, 2);
        System.out.println(Arrays.toString(scores3));

        char[] elements={'A','B','C', 'D', 'E'};

        char[] element2=Arrays.copyOfRange(elements, 1,3);
        System.out.println(Arrays.toString(element2));






















    }
}
