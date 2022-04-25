package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Dell\\Desktop\\sss.txt.txt");
        if (file.createNewFile()) {
            System.out.println("a file created... @ \"C:\\\\Users\\\\Dell\\\\Desktop\\\\sss.txt.txt\"");
        } else {
            System.out.println("a file already exists...");
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\sss.txt.txt"));
        System.out.println("Enter username: ");
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();  // Read user input
        try {
            FileWriter fileWriter =
                    new FileWriter("C:\\Users\\Dell\\Desktop\\sss.txt.txt", true);

            fileWriter.write(System.lineSeparator() + userName);

            System.out.println("wrote to file successfully...");
            fileWriter.close();
        } catch (IOException ioException) {
            System.out.println("disturbed.");
        }
    }

}
