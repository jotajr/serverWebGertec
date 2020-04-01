package br.edu.virtus.gertec.serverWebGertec.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class SupportFunctions {

    public static String getRandomWordBySize(int count, boolean fixedSeed) {
        String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder builder = new StringBuilder();
        Random generator = new Random(12345);
        while (count-- != 0) {
            double randomNumber = (fixedSeed ? (generator.nextDouble()) : (Math.random()));
            int character = (int) (randomNumber * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public static String getRandomWordBySize(int count) {
        return getRandomWordBySize(count, false);
    }

    public static String printFile(File file) throws IOException {

        StringBuilder fileContents = new StringBuilder();
        if (file == null) {
            return "";
        }

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                fileContents.append(line);
            }
        }
        return fileContents.toString();
    }

}
