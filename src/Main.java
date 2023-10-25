import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        boolean x = false;
        while (x == false) {
            System.out.println();
            System.out.println("InsertionSort");
            System.out.println("Wybierz opcję");
            System.out.println("1.Losowanie");
            System.out.println("2.Własne dane");
            System.out.println("0. Wyjście");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    double arr[] = random();
                    sort(arr);
                    break;
                case "2":
                    double arr1[] = write();
                    sort(arr1);
                    break;
                case "0":
                    x = true;
                    break;
            }

        }
    }

    public static void sort(double[] doublearray) {
        double temp;
        int n = doublearray.length;
        for (int i = 1; i < n; i++) {
            temp = doublearray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (doublearray[j] > temp) {
                    doublearray[j + 1] = doublearray[j];
                    doublearray[j] = temp;
                }
            }
        }
        for (int k = 1; k < doublearray.length; k++) {
            if (k % 10 == 0) System.out.println();
            System.out.print(doublearray[k] + " | ");
        }
    }

    public static double[] random() {
        System.out.println("Wpisz długość tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        double[] arr = new double[arraySize];
        System.out.println("Generowanie tablicy... ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) Math.round(Math.random() * 10000) / 100;
        }
        return arr;

    }

    public static double[] write() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dlugosc tablicy: ");
        int arraySize = scanner.nextInt();
        double[] arr = new double[arraySize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Wpisz dane do tablicy: ");
            arr[i] = loadNumber();

        }
        return arr;

    }


    public static double loadNumber() {
        Scanner scanner = new Scanner(System.in);
        String strnumber = scanner.nextLine();
        boolean isNumber = true;
        for (int i = 0; strnumber.length() > i; i++) {
            if (strnumber.charAt(i) < 48 || strnumber.charAt(i) > 57) {
                System.out.println("To nie liczba kolego");
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            return parseDouble(strnumber);
        } else {
            System.out.println("Wpisz liczbe");
            return loadNumber();
        }
    }
}

