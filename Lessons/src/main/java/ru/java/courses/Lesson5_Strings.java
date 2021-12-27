package ru.java.courses;

import java.util.Arrays;
import java.util.HashSet;

public class Lesson5_Strings {

    /**
     * Дан массив строк, необходимо удалить из него все дубли,
     * оставшиеся строки объединить в одну в порядке следования в массиве.
     *
     * <p>
     * Подсказка: массив может быть пустой
     *
     * @param strings массив строк
     *
     * @return полученную строку.
     */
    public static String task1(String[] strings) {
        strings = Arrays.stream(strings).distinct().toArray(String[]::new);
        return String.join("", strings);
    }

    /**
     * Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида:
     * “Название книги” И.И.Автора
     * <p>
     * Подсказка: Кавычек может не быть, а вместо инициалов полное имя
     *
     * @param pairs массив из пар строк
     *
     * @return  массив из полученных строк отсортированный по названию книг по алфавиту.
     */
    public static String[] task2(String[][] pairs) {
        String[] result = new String[pairs.length];
        String[] autor;
        for(int i = 0 ,j = 0; i < pairs.length;i++){
            autor = pairs[i][j+1].split(" ");
            String res = autor[0].charAt(0) + ". " + autor[1].charAt(0) + ". " + autor[2];
            result[i] = "\"" + pairs[i][j].replace("\"","") + "\"" + " " + res;
        }
//        Arrays.stream(result).forEach(System.out::println);
        return result;
    }

    /**
     * Дана строка, необходимо найти два символа и вернуть подстроку между ними.
     * <p>
     * Подсказка: одного или обоих символов может нет быть
     *
     * @param str исходная строка
     * @param symb1 первый символ
     * @param symb2 второй символ
     *
     * @return подстроку между найденными символами
     */
    public static String task3(String str, char symb1, char symb2) {
        int x = 0, y = 0;
        for(int i = 0; i < str.length(); i++){
            if(String.valueOf(str.charAt(i)).equals(String.valueOf(symb1))){
                x = i;
            }
            if(String.valueOf(str.charAt(i)).equals(String.valueOf(symb2))){
                y = i;
            }
        }
        if(x > y){
            return  str.substring(y + 1, x);
        }
        return (x == 0 | y == 0) ? "" : str.substring(x + 1,y);
    }
}
