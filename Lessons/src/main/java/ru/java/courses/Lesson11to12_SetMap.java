package ru.java.courses;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.swing.tree.TreeCellEditor;

public class Lesson11to12_SetMap {

    public static class User {

        private String name;
        private int age;
        private String phone;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public User(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем коллекцию пользователей
     * 2. Удаляем все дубли (одинаковое имя и возраст)
     * 3. Сортируем по имени и возрасту
     * 4. Возвращаем последнего пользователя
     */
    public static User task1(Collection<User> source) {

        TreeSet<User> set = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (o1.getName() + o1.getAge()).compareTo((o2.getName() + o2.getAge()));
            }
        });
        set.addAll(source);
        return set.last();
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем коллекцию пользователей
     * 2. Преобразовываем его в справочник [номер телефона -> пользователь]
     * 3. Один номер телефона на одного пользователя
     * 4. Вернуть количество записей в справочнике
     */
    public static int task2(Collection<User> source) {

        HashMap<String,User> map = new HashMap<>(source.size());

        for (User user : source) {
            map.put(user.getPhone(), user);
        }

       return map.size();

//        return (int) source
//                .stream()
//                .map(u -> u.getPhone())
//                .distinct()
//                .count();
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем список названий книг
     * 2. Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
     * 3. Все книги должны быть отсортированы по алфавиту с первой до последней полки
     * 4. Количество полок константное - 5 штук
     * 5. Вернуть книги распределенные по полкам
     *
     * Нумерация полок начинается с единицы!
     */
    public static Map task3(Collection<String> source) {

        int count = (int) Math.ceil(source.size() / 5d);
        int shelfNumber = 0;
//        int minBooksOnShelfCount = source.size() % count;

        ArrayList<String> books = new ArrayList<>(source);
        Collections.sort(books);

        HashMap<Integer, List<String>> result = new HashMap<>(5);

        while (shelfNumber < 5) {
            int index = shelfNumber * count;
            List<String> booksOnShelf = books.subList(index,Math.min(index + count,books.size()));
            result.put(shelfNumber,booksOnShelf);
            shelfNumber++;
        }


        return result;
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем книги, распределенные по полкам
     * 5. Вернуть справочник [название книги -> номер полки]
     */
    public static Map task4(Map<Integer, String> source) {

        HashMap<String , Integer> map = new HashMap<>();

        for (Entry<Integer, String > entry : source.entrySet()){
            map.put(entry.getValue(), entry.getKey());
        }

        return map;
    }
}
