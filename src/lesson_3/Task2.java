/*
* Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana",
"apricot", "avocado", "broccoli", "carrot",
"cherry", "garlic", "grape", "melon", "leak", "kiwi",
"mango", "mushroom", "nut", "olive", "pea", "peanut",
"pear", "pepper", "pineapple", "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово,
запрашивает ответ у пользователя, сравнивает его с загаданным словом
и сообщает, правильно ли ответил пользователь.
Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Угаданные в прошлые ответы буквы запоминать не надо.
То есть при следующем ответе: carpet (ковер, не фрукт, но это всего лишь пример),
будет выведено:
####e##########
 */

package lesson_3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana",
                        "apricot", "avocado", "broccoli", "carrot",
                        "cherry", "garlic", "grape", "melon",
                        "leak", "kiwi", "mango", "mushroom",
                        "nut", "olive", "pea", "peanut",
                        "pear", "pepper", "pineapple", "pumpkin", "potato"};
        guessGame(words);
    }

    public static void guessGame(String[] words) {
        boolean isWinner = false;
        Scanner scanner = new Scanner(System.in);
        String guessedWord = guessWord(words);
        String userAnswer;
        System.out.println("Я загадал одно слово (по-английски). Это название фрукта или овоща.\n" +
                "Попробуйте его отгадать, а я буду давать вам небольшие подсказки по ходу игры.\n" +
                "Если сдаетесь, введите exit. Итак, начали!");
        do {
            System.out.print("Ваш вариант?: ");
            userAnswer = scanner.nextLine().toLowerCase();
            if (userAnswer.equals("exit")) {
                System.out.print("Ничего, в другой раз отгадаете. ");
                break;
            }
            else if (userAnswer.equals(guessedWord)) {
                System.out.print("Вы угадали! ");
                isWinner = true;
            } else {
                System.out.println(compareWords(userAnswer, guessedWord));
            }
        }
        while (!isWinner);
        System.out.printf("Это было слово %s.", guessedWord);
    }

    public static String guessWord(String[] words) {
        Random random = new Random();
        int i = random.nextInt(words.length);
        return words[i];
    }

    public static String compareWords(String userAnswer, String guessedWord) {
        boolean isComparable = false;
        StringBuffer result = new StringBuffer();
        char maskChar = '*';

        int maxIndex = Math.min(userAnswer.length(), guessedWord.length());

        for (int i = 0; i < maxIndex; i++) {
            if (guessedWord.charAt(i) == userAnswer.charAt(i)) {
                isComparable = true;
                result.append(guessedWord.charAt(i));
            } else {
                result.append(maskChar);
            }
        }
        if (!isComparable) {
            return "Вообще не похоже!";
        }
        return maskResult(result, maskChar).toString();
    }

    public static StringBuffer maskResult(StringBuffer result, char maskChar) {
        int maskLength = 15;
        int maskCharQty = maskLength - result.length();
        result.append(String.valueOf(maskChar)
                .repeat(Math.max(0, maskCharQty)));
        return result;
    }

}
