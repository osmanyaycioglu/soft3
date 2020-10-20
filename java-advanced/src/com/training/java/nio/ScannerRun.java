package com.training.java.nio;

import java.util.Scanner;

public class ScannerRun {

    public static void main(final String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter name : ");
            String nextLoc = scanner.next();

            System.out.println("enter number : ");
            int nextIntLoc = scanner.nextInt();

            System.out.println("Name : " + nextLoc + " number : " + nextIntLoc);
        } catch (NullPointerException eLoc) {
            eLoc.printStackTrace();
        } catch (IllegalArgumentException | IllegalStateException eLoc) {
            eLoc.printStackTrace();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

    }

    public static void main2(final String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("enter name : ");
            String nextLoc = scanner.next();

            System.out.println("enter number : ");
            int nextIntLoc = scanner.nextInt();

            System.out.println("Name : " + nextLoc + " number : " + nextIntLoc);
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

}
