package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Topics_6_Exceptions {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("hello.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello!\n");
            bufferedWriter.write("More data here\n");
            bufferedWriter.write("Goodbye!\n");

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
