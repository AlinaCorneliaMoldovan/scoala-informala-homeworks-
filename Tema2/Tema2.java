
import java.util.Scanner;

/**
 * @author Created by Alina Moldovan on 7/24/2017
 */

// Implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order. The sorting
// should be done based on the amount of revenue generated via sales. Each rep has a number of sales, and a quota / sale.
// After the sorting the first object should be the rep with the most revenue generated. The last object in the array
// should be the rep with the least revenue generated.


public class Tema2 {

    public static void main(String[] args) {
        int length1;
        int i, j, temp = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Introdu numarul de agenti: ");
        length1 = input.nextInt();

        int[] numar_obiecte_vandute = new int[length1];
        int[] valoare_unitara_obiecte_vandute = new int[length1];
        int[] val_totala = new int[length1];

        for (i = 0; i < length1; i++) {
            System.out.print("Introdu numarul de obiecte vandute de catre agentul numarul " + (i + 1) + ": ");
            numar_obiecte_vandute[i] = Integer.parseInt(input.next());
            System.out.print("Introdu valoarea unitara a produselor vandute de catre agentul numarul "
                    + (i + 1) + ": ");
            valoare_unitara_obiecte_vandute[i] = Integer.parseInt(input.next());
            val_totala[i] = numar_obiecte_vandute[i] * valoare_unitara_obiecte_vandute[i];
            System.out.print("Pentru agentul " + (i + 1) + ": numar_obiecte_vandute = " + numar_obiecte_vandute[i] +
                    "; valoare_unitara_obiecte_vandute = " + valoare_unitara_obiecte_vandute[i] + "; val_totala = "
                    + val_totala[i]);
            System.out.println();
        }
        System.out.println();
        System.out.println("Valorile totale ale obiectelor vandute de catre fiecare dintre agenti sunt:");
        for (i = 0; i < length1; i++) {
            System.out.print("Pentru agentul numarul " + (i + 1) + ": " + val_totala[i] + " lei");
            System.out.println();
        }
        System.out.println();
        System.out.println("Valorile vanzarilor sunt:");
        for (i = 0; i < length1; i++) {
            System.out.println("Agentul cu numarul " + (i + 1) + ": " + val_totala[i] + " lei");
        }
        for (i = 0; i < length1; i++) {
            for (j = i + 1; j < length1; j++) {
                if (val_totala[i] < val_totala[j]) {
                    temp = val_totala[i];
                    val_totala[i] = val_totala[j];
                    val_totala[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Ordinea vanzarilor: ");
        for (i = 0; i < length1; i++) {
            System.out.println("Agentul de pe locul nr " + (i + 1) + " a vandut in valoare de " + val_totala[i] + " lei");
        }
    }
}







