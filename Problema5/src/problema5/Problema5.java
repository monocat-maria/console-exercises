package problema5;

import java.util.Scanner;

/**
 *
 * @author monocat
 */
public class Problema5 {

    public static void main(String[] args) {
        String hotel[][] = new String[4][3];
        int andar;
        int quarto;
        int i;
        int j;
        char continuar;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Informe o andar e o quarto:");
            System.out.println("Andar(1 ao 4):");
            i = input.nextInt();
            i = i - 1;
           
            System.out.println("Quarto(1 ao 3):");
            j = input.nextInt();
            j = j - 1;
            
            hotel[i][j] = "   |     X    |";
             
            System.out.println("Deseja informar outra ocupação? s/n");
            continuar = input.next().charAt(0);  
        }while(continuar == 's');
        
            // Print
            System.out.print("|-------|----------|-----|----------|-----|----------|\n");
            System.out.println("|ANDAR  | QUARTO 1 |     | QUARTO 2 |     | QUARTO 3 |");
            System.out.println("|-------|----------|-----|----------|-----|----------|");
            
            for(i = hotel.length - 1; i >= 0; i--){
                System.out.print("| " + (i + 1) + " ");
                for(j = 0; j < hotel[i].length;j++){
                    if(hotel[i][j] == null){
                        hotel[i][j] = "   |desocupado|";
                    }                  
                    System.out.print(" " + hotel[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("|-------|----------|-----|----------|-----|----------|");
    } 
}
