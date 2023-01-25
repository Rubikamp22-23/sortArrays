import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {12,14,1,5,73};
        Arrays.sort(numbers);
        for(int i=0;i<=numbers.length-1;i++){
            System.out.println(numbers[i]);
        }

    }
}