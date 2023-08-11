package problema4;

import java.util.Scanner;
/*. Monte um algoritmo em que o usuário poderá cadastrar e pesquisar hóspedes. O 
algoritmo deve oferecer um menu com três opções ao usuário: 1- cadastrar; 2-
pesquisar; 3- sair. A opção “cadastrar” deve permitir que o usuário informe um 
nome de hóspede, gravando-o em memória (máximo de 15 cadastros; caso atinja 
essa quantidade, mostre “Máximo de cadastros atingido”). A opção “pesquisar” deve
permitir que o usuário informe um nome e, caso seja encontrado um nome 
exatamente igual, mostre a mensagem “Hóspede (nome) foi encontrado no índice
(índice onde foi cadastrado)”. Se o nome não foi encontrado, mostre “Hóspede não 
encontrado”. O algoritmo deve permitir que o usuário realize essas operações 
repetidas vezes, até que use a opção “3”, que encerra o algoritmo.*/

/**
 *
 * @author monocat
 */
public class Problema4 {

    public static void main(String[] args) {
        String opcao;
        int i = 0;
        int numeroCadastro = 0;
        String pesquisaHospede;
        char continuar;
        String[] hospede = new String[15];
        
        Scanner input = new Scanner(System.in);
   
        do{
            System.out.println("\t--Hotel--\nSistema do Hotel");
            System.out.println("Selecione uma opção: 1 - cadastrar; 2 - pesquisar; 3 - sair ");
        
            opcao = input.next();
        
            switch(opcao){
            case "1":
                do{
                        if(i < hospede.length){   
                            numeroCadastro =+ i + 1;
                            System.out.println("Informe nome do hóspede " + numeroCadastro + ":");
                            hospede[i] = input.next();
                            i++;
                  
                            System.out.println("Informar outro hóspede? s/n");
                            continuar = input.next().charAt(0);
                        }else{
                            System.out.println("Máximo de cadastros atingido.");
                            break;
                        }
                        
                }while(continuar == 's');              
                break;   
            
            case "2":
                System.out.println("Pesquise um nome de hóspede:");
                pesquisaHospede = input.next();
                boolean pesquisaArray = false;
                
                for(i = 0; i < hospede.length; i++){
                    if(pesquisaHospede.equals(hospede[i])){
                        System.out.println("Hóspede " + hospede[i] + 
                        " foi encontrado no índice " + i + ".");
                        pesquisaArray = true;
                    }
                }              
                if(pesquisaArray == false){
                        System.out.println("Hóspede não encontrado.");
                    }
                                     
                i = numeroCadastro;
                break;

            case "3":
                System.out.println("Sistema encerrado.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        }while(!opcao.equals("3"));
       
    }
    
}
