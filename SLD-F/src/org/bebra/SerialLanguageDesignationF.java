package org.bebra;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SerialLanguageDesignationF {
    public static SLD_CORE sldc = new SLD_CORE();
    public static int max = 1496;
    public static String prompt;
    public static void main(String[] args) throws FileNotFoundException {
        int a = 1;
        Scanner prompter = new Scanner(System.in);
        while (a != 0) {
            prompt = prompter.nextLine();
            sldc.assembly();
        }


    }
}
