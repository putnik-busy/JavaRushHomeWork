package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);

        byte[] buffer1 = new byte[fileInputStream1.available()];
        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream1.read(buffer1);
        fileInputStream2.read(buffer2);

        FileOutputStream fileOutputStream = new FileOutputStream(file1);

        fileOutputStream.write(buffer2);
        fileOutputStream.write(buffer1);

        fileOutputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();
    }
}
