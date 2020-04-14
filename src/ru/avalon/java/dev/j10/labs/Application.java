package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
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
	    String[] strings = {"Soda","Logka" ,"Foto", "Dom", "fant", "persona", "koshka", "kolos", "los", "papka",
		"gorod", "glas", "lokon", "woda", "vrema", "film", "dog", "lowad", "angel", "dogd"} ;

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = {new Persons("Ваня", LocalDate.of(2000,11,2)),
	    new Persons("Ира", LocalDate.of(2000, 12, 1)),
		new Persons("Катя", LocalDate.of(2000, 1, 25)),
		new Persons("Миша", LocalDate.of(1987, 2, 5)),
		new Persons("Ваня", LocalDate.of(1985, 6, 30)),
		new Persons("Женя", LocalDate.of(2000, 4, 9)),
		new Persons("Ира", LocalDate.of(2005, 9, 23)),
		new Persons("Слава", LocalDate.of(2009, 2, 9)),
		new Persons("Алена", LocalDate.of(2010, 2, 19)),
		new Persons("Гриша", LocalDate.of(2014, 3, 16)),
		new Persons("Ваня", LocalDate.of(2019, 11, 7)),
		new Persons("Алена", LocalDate.of(2000, 7, 1)),
		new Persons("Ира", LocalDate.of(1986, 4, 6)),
		new Persons("Миша", LocalDate.of(1850, 9, 9)),
		new Persons("Петя", LocalDate.of(1987, 4, 17)),
		new Persons("Света", LocalDate.of(1899, 7, 15)),
		new Persons("Женя", LocalDate.of(1987, 6, 19)),
		new Persons("Боря", LocalDate.of(2001, 9, 4)),
		new Persons("Яна", LocalDate.of(2003, 8, 3)),
		new Persons("Ксюша", LocalDate.of(2008, 3, 7))};




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
