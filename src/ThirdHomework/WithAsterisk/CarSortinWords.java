package ThirdHomework.WithAsterisk;

import java.util.Arrays;
import java.util.Scanner;

public class CarSortinWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из двух слов: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        String[] sortedWords = new String[words.length];

        for (int i = 0; i < words.length; i++){
            char[] letters = words[i].toCharArray();
            Arrays.sort(letters);
            sortedWords[i] = new String(letters).toLowerCase();
        }

        String result = String.join(" ", sortedWords);

        System.out.println("Результат: " + result);
    }
}
