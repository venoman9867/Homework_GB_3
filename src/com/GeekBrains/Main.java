package com.GeekBrains;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных
слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще
дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().*/

    public static void main(String[] args) {
	String array[]=new String[]{"carrot","car","shark","carrot","airship","king","lion","king","carrot","rabbit","clone"};
        Map<String,Integer>countWords=new HashMap<>();
        for(String value:array){
            if(countWords.containsKey(value)){
                countWords.put(value,countWords.get(value)+1);
            }else{
                countWords.put(value,1);
            }
        }
        for (Map.Entry<String,Integer>entry:countWords.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}
