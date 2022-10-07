package com.gmail.maxenamiro;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		// Считайте строку текста с клавиатуры.
		// Подсчитайте сколько раз в нем встречается символ «b».
		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть текст англійською:");

		String text = sc.nextLine();

		char[] sym = text.toCharArray();

		int count = 0;
		for (int i = 0; i < sym.length; i++) {
			if (sym[i] == 'b') {
				count = count + 1;
			}
		}
		System.out.println(count + " символів 'b' у тексті\n" + "-------------------------------------");

		// Вводится строка из слов, разделенных пробелами.
		// Найти самое длинное слово и вывести его на экран.

		System.out.println("Напишіть декілька слів через пробіл");

		String slova = sc.nextLine();
		String none = "";

		String[] res = slova.split("[ ]");
		for (int i = 0; i < res.length; i++) {
			int a = res[i].length();
			if (a > none.length()) {
				none = res[i];
			}
		}

		System.out.println("Найдовше слово в тексті - " + none.toString());

		// Выведите на экран 10 строк со значением числа Пи.
		// Причем в первой строке должно быть 2 знака
		// после запятой, во второй 3, в третьей 4 и т. д.
		
		for (int i = 2; i < 12; i++) {
			System.out.printf("%." + i + "f \n", Math.PI);
		}

	}

}
