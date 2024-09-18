package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void inc() {
        assertEquals(2,Main.inc(1));
    }

    @Test
    public void testPrintFizzBuzz() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.printFizzBuzz();

        String output = outputStream.toString();

        for (int i = 1; i <= 500; i++) {
            String expected;
            if (i % 5 == 0 && i % 7 == 0) {
                expected = "fizzbuzz";
            } else if (i % 5 == 0) {
                expected = "fizz";
            } else if (i % 7 == 0) {
                expected = "buzz";
            } else {
                expected = String.valueOf(i);
            }
            expected += System.lineSeparator(); //системный разделитель

            assertTrue(output.contains(expected), "Expected output not found: " + expected);
        }
    }

    @Test
    public void testReverseString() {
        // Перенаправляем вывод в поток
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.reverseString("make install");

        String output = outputStream.toString().trim(); // Убираем пробелы и символы новой строки

        assertEquals("llatsni ekam", output);
    }

    @Test
    public void testTwoRealRoots() {
        String expected = "Вещественные корни существуют:\nКорень 1: 2.0\nКорень 2: 1.0\n";
        assertEquals(expected, Main.squareRoots(1, -3, 2));
    }

    @Test
    public void testOneRealRoot() {
        String expected = "Вещественный корень существует:\nКорень: 1.5\n";
        assertEquals(expected, Main.squareRoots(1, -3, 2.25));
    }

    @Test
    public void testNoRealRoots() {
        String expected = "Нет вещественных корней\n";
        assertEquals(expected, Main.squareRoots(1, 0, 1));
    }
}
