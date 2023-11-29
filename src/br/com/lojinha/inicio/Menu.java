package br.com.lojinha.inicio;

import java.util.ArrayList;
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
        String escolha = "0";
        System.out.println("1. Calçados\n2.Acessórios\n3.Roupas Masculino\n4.Roupas Feminino\n5.Sair");
        escolha = scanner.nextLine();
        HandleMenu(escolha);
    }

    public void HandleMenu(String escolha){
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1");
        menu.add("2");
        menu.add("3");
        menu.add("4");
        menu.add("5");
        switch (escolha){
            default:
                if(!escolha.equals(menu)){
                    System.out.println("!!Digite apenas números disponíveis no menu!!!");
                }
                MostrarMenu();
                break;
            case "1":
                //Calcados  calcados = new Calcados();
            case "5":
                break;
        }
    }
}
