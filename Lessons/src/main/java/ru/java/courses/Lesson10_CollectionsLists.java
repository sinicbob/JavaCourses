package ru.java.courses;

import java.util.*;

public class Lesson10_CollectionsLists {

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем список чисел
     * 2. Удаляем все дубли
     * 3. Сортируем список по возрастанию
     * 4. Преобразуем числа в строки
     * <p>
     * Подсказки:
     * Collections.sort() - сортировка
     * Удалять элементы из итерируемого списка нельзя - выпадет исключение
     */
    public static List<String> task1(List<Integer> source) {
        Collections.sort(source);
//        Set<Integer> set = new LinkedHashSet<>(source);
        List<String> strings = new ArrayList<String>(source.size());
        for(Integer i : source){
            if(!strings.contains(String.valueOf(i))){
                strings.add(String.valueOf(i));
            }
        }
        return strings;
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем на входе массив чисел
     * 2. Преобразовываем его к списку
     * 4. Все четные числа увеличиваем на единицу
     * 5. Возвращаем кусок списка с 3-го по 7-й элемент
     * <p>
     * Подсказка: на входе может быть любое количество чисел
     */
    public static List<Integer> task2(Integer... array) {
        List<Integer> list = new ArrayList<>(array.length);
        for(Integer i : array){
            if( i % 2 == 0){
                list.add(i + 1);
            }else{
                list.add(i);
            }
        }
        return (list.size() > 8) ? list.subList(3,list.size() - 1) : list.subList(3, list.size());
    }
}
