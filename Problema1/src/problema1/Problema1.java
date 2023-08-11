package problema1;

import java.util.Scanner;

/**
 *
 * @author monocat-neko
 */
public class Problema1 {

    public static void main(String[] args) {
        
        int convidados;
        int cadeirasAdicionais;
        final int cadeirasAlfa = 150;
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t--Hotel-- \n\tAuditório \n");
        
        do{
        System.out.println("Digite o número de convidados para o auditório:");
        
        convidados = input.nextInt();
        
        if (convidados <= 0 || convidados > 350){
            System.out.println("Número de convidados Inválido.");
        }else if(convidados <= 150){
            System.out.println("Use o auditório Alfa.");
        }else if(convidados <= 220 && convidados > 150){
            cadeirasAdicionais = convidados - cadeirasAlfa;
            System.out.println("Use o auditório Alfa.\nInclua mais " + cadeirasAdicionais + " cadeira(s).");
        }else if(convidados <= 350 && convidados > 220){
            System.out.println("Use o auditório Beta.");
        }
        
        }while(convidados <= 0 || convidados > 350);
    }
    
}
