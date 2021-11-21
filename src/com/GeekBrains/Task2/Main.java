package com.GeekBrains.Task2;

import java.util.Scanner;

public class Main {
    /*2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще
дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().*/

    public static void main(String[] args) {
        TelephoneBook l = new TelephoneBook();
        TelephoneBook p = new TelephoneBook();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Выберите одно из 2-х действий: \n1.Добавить запись\n2.Найти номер по фамилии\n3.Введите 0 чтобы закончить.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите фамилию");
                    String family = scanner.next();
                    System.out.println("Введите номер телефона");
                    String number = scanner.next();
                    l.add(family, number);
                    break;//не могу вывести номер телефона, после этого брейка в дебаге данные пропадают(
                case 2:
                    System.out.println("Введите фамилию по которой нужно найти телефон");
                    String g = scanner.next();
                    System.out.println("Номер абонента: "+p.get(g));
                    break;
            }
        } while (choice != 0);
    }
}
