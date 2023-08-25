package edu.dio.projeto;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametro2 = terminal.nextInt();
        terminal.close();
        try { 
            contar(parametro1,parametro2);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if(parametro1 >= parametro2){
           throw new ParametrosInvalidosException();
        }else{
            int contagem = parametro2 - parametro1;
            for(int x = 0; x < contagem; x++){
                System.out.println("O numero agora é: " + (x + 1));
            }
        }
    }
}
