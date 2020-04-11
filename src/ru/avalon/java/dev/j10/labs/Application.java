package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = new String [] {"Soda","Logka" ,"Foto", "Dom", "fant", "persona", "koshka", "kolos", "los", "papka",
		"gorod", "glas", "lokon", "woda", "vrema", "film", "dog", "lowad", "angel", "dogd"} ;

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Persons[20];
	    persons[0] = new Persons("Ваня", 2005, 2, 3);
	    persons[1] = new Persons("Ира", 2000, 12, 1);
		persons[2] = new Persons("Катя", 2000, 1, 25);
		persons[3] = new Persons("Миша", 1987, 2, 5);
		persons[4] = new Persons("Ваня", 1985, 6, 30);
		persons[5] = new Persons("Женя", 2000, 4, 9);
		persons[6] = new Persons("Ира", 2005, 9, 23);
		persons[7] = new Persons("Слава", 2009, 2, 9);
		persons[8] = new Persons("Алена", 2010, 2, 19);
		persons[9] = new Persons("Гриша", 2014, 3, 16);
		persons[10] = new Persons("Ваня", 2019, 11, 7);
		persons[11] = new Persons("Алена", 2000, 7, 1);
		persons[12] = new Persons("Ира", 1986, 4, 6);
		persons[13] = new Persons("Миша", 1850, 9, 9);
		persons[14] = new Persons("Петя", 1987, 4, 17);
		persons[15] = new Persons("Света", 1899, 7, 15);
		persons[16] = new Persons("Женя", 2000, 6, 19);
		persons[17] = new Persons("Боря", 2001, 9, 4);
		persons[18] = new Persons("Яна", 2003, 8, 3);
		persons[19] = new Persons("Ксюша", 2008, 3, 7);




        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new SortClass();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new ComparatorClass();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
       sort.sort(strings, comparator);


		for (Person person : persons ) {
			System.out.println(person);
		}
			for (String string : strings) {
				System.out.println(string);
			}

    }
}
