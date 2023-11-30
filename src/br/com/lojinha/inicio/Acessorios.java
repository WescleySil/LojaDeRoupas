package br.com.lojinha.inicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Wescley Silva
 */
public class Acessorios {
    public void MostrarAcessorio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a seção de acessórios, qual acessório deseja comprar?(Digite o número)");
        String escolha = "0";
        System.out.println("1.Meias\n2.Brincos\n3.Oculos\n4.Voltar");
        escolha = scanner.nextLine();
        HandleAcessorio(escolha);
    }

    private void HandleAcessorio(String escolha) {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1");
        menu.add("2");
        menu.add("3");
        menu.add("4");
        Scanner scanner = new Scanner(System.in);
        switch (escolha) {
            default:
                if (!escolha.equals(menu)) {
                    System.out.println("!!Digite apenas números disponíveis no menu!!!");
                }
                MostrarAcessorio();
                break;
            case "1":
                System.out.println("Meias compradas com sucesso!!");
                System.out.println("Deseja comprar outro acessório?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                }
                MostrarAcessorio();
                break;
            case "2":
                System.out.println("Brincos comprados com sucesso!!");
                System.out.println("Deseja comprar outro acessório?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                }
                MostrarAcessorio();
                break;
            case "3":
                System.out.println("Oculos comprado com sucesso!!");
                System.out.println("Deseja comprar outro acessório?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                }
                MostrarAcessorio();
                break;
            case "4":
                Menu voltar = new Menu();
                voltar.MostrarMenu();
        }
    }
}
