import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lista {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.println("Ingrese un numero");
        num = Integer.parseInt(bufEntrada.readLine());
        int i = 1;

        while (i <= 12) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
