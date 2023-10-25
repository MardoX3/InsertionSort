import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double arr[] = random();
        sort(arr);
        for(int k =1; k < arr.length; k++){
            System.out.print(arr[k]+" | ");
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
    }
        public static double[] random () {
            System.out.println("Wpisz długość tablicy: ");
            Scanner scanner = new Scanner(System.in);
            int arraySize = scanner.nextInt();
            double[] arr = new double[arraySize];
            System.out.println("Generowanie tablicy... ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Math.random()* 1000;
            }
            return arr;

        }
    }
