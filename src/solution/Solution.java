package solution;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] hashBytes = md.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }

            System.out.println(hexString.toString());

        } catch (NoSuchAlgorithmException e) {
            System.err.println("MD5 algorithm not found.");
        }
    }
}

