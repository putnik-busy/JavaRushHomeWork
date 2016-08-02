package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
  Я бы сделал через:
1) Считал строку
2) Записал бы ее в массив char array[], с помощью метода toCharArray()
3) Создал бы новую строку
4) Проходил бы по массиву array, и записывал бы каждый его элемент в строку
5) Для превращения в заглавную букву использовал бы проверку, если перед символом в массиве array идет пробел,
 или это начало строки с помощью toUpperCase() переводил буквы в заглавные
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
    }


}
