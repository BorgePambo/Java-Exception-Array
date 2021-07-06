package javaapparray;

import java.util.Scanner;

public class JavaAppArray {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] nome = {"Borge", "Pedro", "Love", "James", "David"};
        
        for(int i=0; i < nome.length; i++){
            try{
                System.out.print("Entre com Indice do Array: ");
                i = sc.nextInt();
                System.out.println(nome[i]);
                break;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("----------------------");
                System.out.println("Erro ao Acessar este indice: " + e.getMessage());
            }
         
        }
        
        
        sc.close();
        
    }
    
}
