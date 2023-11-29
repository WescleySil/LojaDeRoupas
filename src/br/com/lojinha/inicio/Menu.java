package br.com.lojinha.inicio;

import java.util.Scanner;

/**
 *
 *
 * @author Wescley Silva
 */
public class Menu {
    public void MostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a Lojinha, para qual seção deseja ir?(Digite o número)");
        int escolha = 0;
        System.out.println("1. Calçados\n2.Acessórios\n3.Roupas Masculino\n4.Roupas Feminino\n5.Sair");
        escolha = scanner.nextInt();
        HandleMenu(escolha);
    }

    public void HandleMenu(int escolha){
        switch (escolha){
            default:
                System.out.println("Digite um número disponível no menu");
            case 5:
                System.out.println("Obrigado pela visita, volte sempre!");
        }
    }
}
