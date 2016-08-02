package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        FileInputStream inputStreamReader = new FileInputStream(filename);
        FileOutputStream inputStreamReader2 = new FileOutputStream(filename2);
        FileOutputStream inputStreamReader3 = new FileOutputStream(filename3);
        int simvol;
        int size = inputStreamReader.available();
        int chet = inputStreamReader.available() % 2;
        int count = 0;
        System.out.println(chet);
        if (chet == 1)
        {
            while ((inputStreamReader.available() > 0))
            {
                simvol = inputStreamReader.read();
                if (count > size / 2)
                {
                    inputStreamReader3.write(simvol);
                    count++;
                } else
                {
                    inputStreamReader2.write(simvol);
                    count++;
                }
            }
        } else if (chet == 0)
        {
            while ((inputStreamReader.available() > 0))
            {
                int read = inputStreamReader.read();
                if (count >= size / 2)
                {
                    inputStreamReader3.write(read);
                    count++;
                } else
                {
                    inputStreamReader2.write(read);
                    count++;
                }
            }
        }
        reader.close();
        inputStreamReader.close();
        inputStreamReader2.close();
        inputStreamReader3.close();
    }
}
