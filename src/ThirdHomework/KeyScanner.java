package ThirdHomework;

import java.util.Scanner;

public class KeyScanner {
    public static final String QWERTY = "qwertyuiopasdfghjklzxcvbnm";

    public static char getLeftLetter(char letter) throws IllegalAccessException {
        int index = QWERTY.indexOf(letter);

        if(index == -1){
            throw new IllegalAccessException("Введенный символ не является маленькой буквой английского алфавита.");
        } else if (index == 0){
            return QWERTY.charAt(QWERTY.length() - 1);
        } else {
            return QWERTY.charAt(index - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите маленькую букву английского алфавита: ");
        String input = sc.nextLine();

        if (input.length() != 1){
            System.out.println("Ошибка: требуется ввести один символ.");
        } else {
            char letter = input.charAt(0);
            try {
                char leftLetter = getLeftLetter(letter);
                System.out.println("Слева от буквы '" + letter + "' находится буква '" + leftLetter + "'.");
            }catch (IllegalAccessException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
