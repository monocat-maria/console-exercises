package problema2;

import java.util.Scanner;

/**
 *
 * @author monocat
 */
public class Problema2 {

    public static void main(String[] args) {
        String hospede1;
        int idade1;
        String hospede2;
        int idade2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t--Hotel--\n\tTroca de quarto");
        
        System.out.println("Digite o nome do hóspede 1:");
        hospede1 = input.next();
        System.out.println("Digite idade do hóspede 1:");
        idade1 = input.nextInt();
        
        System.out.println("Digite o nome do hóspede 2:");
        hospede2 = input.next();
        System.out.println("Digite idade do hóspede 2:");
        idade2 = input.nextInt();
        
        if(idade1 >= 60 && idade1 > idade2){
            System.out.println("Quarto A:" + hospede1 + " com desconto de 40%.\nQuarto B:" + hospede2);
        }else if(idade1 > idade2){
            System.out.println("Quarto A:" + hospede1 + "\nQuarto B:" + hospede2);
        }else if (idade2 >= 60 && idade2 > idade1 ){
            System.out.println("Quarto A:" + hospede2 + " com desconto de 40%.\nQuarto B:" + hospede1);
        }else{
            System.out.println("Quarto A:" + hospede2 + "\nQuarto B:" + hospede1);
        }
        
    }
}
