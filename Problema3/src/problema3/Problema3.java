package problema3;

import java.util.Scanner;


public class Problema3 {

    public static void main(String[] args) {
        
        String hospede;
        final int diaria = 100;
        int idade;
        int meia = 0;
        int gratuidade = 0;
        int totalDiaria = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t--Hotel--\t\nDiária padrão de R$100,00");
        
        do{
            System.out.println("\nDigite nome do hóspede:");
            hospede = input.next();
            
            if(hospede.equals("pare") || hospede.equals("PARE")){
                break;
            }
            
            System.out.println("Digite idade do hóspede:");
            idade = input.nextInt();
            
            if(idade <= 4){
                System.out.println(hospede + " possui gratuidade.");
                gratuidade++;
            }else if(idade > 4 && idade < 80){
                totalDiaria += diaria;
            }else if(idade >= 80){
                System.out.println(hospede + " paga meia.");
                meia++;               
                totalDiaria += diaria / 2;
            }       
        }while(!hospede.equals("pare") && !hospede.equals("PARE"));
        
        System.out.println("Total de hospedagens: R$" + totalDiaria + "; " + gratuidade +" gratuidade(s);" + meia + " meia(s).");
    }    
}
