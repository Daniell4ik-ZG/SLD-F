package org.bebra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SLD_CORE {
    public static SerialLanguageDesignationF SLDF = new SerialLanguageDesignationF();
    public static void assembly() throws FileNotFoundException {
        File com = new File("src/org/bebra/commands.sld");

        File com1 = new File(com.getAbsolutePath());

        Scanner comm = new Scanner(com1);
        String tokens = comm.nextLine();
        String[] tkns = tokens.split("    ");

        int i = 0;
        int a = 1;
        String word;
        String next;
        String prompt;

        if (SLDF.prompt.equals("пока") || SLDF.prompt.equals("ладно, пока") || SLDF.prompt.equals("досвидания") || SLDF.prompt.equals("ну, пока") || SLDF.prompt.equals("ну ладно, пока")) {
            System.exit(0);
        }
        if (SLDF.prompt.equals("как тебя зовут?")) {
            System.out.println("меня зовут Serial Language Designation-F (SLD-F)");
        }
        while (i != SLDF.max) {
                word = tkns[i].replace("ввод=", "");
                next = tkns[i + 1].replace("ответ=", "");

                if (SLDF.prompt.equals(word)) {
                    System.out.println(next);

                }

                i = i + 2;

        }
        i = 0;
    }
}
