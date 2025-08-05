package ThirdHomework.Arrow;

import java.util.Scanner;

public class ArrorFinder {
    public static int arrowsCounter(String input) {
        int count = 0;
        int i = 0;

        while (i <= input.length() - 5){
            if (input.charAt(i) == '>' && input.charAt(i + 1) == '>' &&
                input.charAt(i + 2) == '-' && input.charAt(i + 3) == '-' &&
                input.charAt(i + 4) == '>'){
                count++;
                i += 5;
            } else if (input.charAt(i) == '<' && input.charAt(i + 1) == '-' &&
                       input.charAt(i + 2) == '-' && input.charAt(i + 3) == '<' &&
                       input.charAt(i + 4) == '<'){
                count++;
                i += 5;
            }else{
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = sc.nextLine();

        int arrowCount = arrowsCounter(input);
        System.out.println("Количество стрелок: " + arrowCount);
    }

}
