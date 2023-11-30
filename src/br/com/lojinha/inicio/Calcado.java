package br.com.lojinha.inicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nathan Monteiro Silva
 */
public class Calcado {
    public void MostrarCalcado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a seção de calçados, qual calçado deseja comprar?(Digite o número)");
        String escolha = "0";
        System.out.println("1.Tênis esportivo\n2.Tênis Social\n3.Tênis casual\n4.Sandalias\n5.Voltar");
        escolha = scanner.nextLine();
        HandleCalcado(escolha);

    }

    private void HandleCalcado(String escolha) {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1");
        menu.add("2");
        menu.add("3");
        menu.add("4");
        menu.add("5");
        Scanner scanner = new Scanner(System.in);
        switch (escolha) {
            default:
                if (!escolha.equals(menu)) {
                    System.out.println("!!Digite apenas números disponíveis no menu!!!");
                }
                MostrarCalcado();
                break;
            case "1":
                System.out.println("Tênis esportivo comprado com sucesso!!");
                System.out.println("Deseja comprar outro sapato?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                    break;
                }
                MostrarCalcado();
                break;
            case "2":
                System.out.println("Tênis Social comprado com sucesso!!");
                System.out.println("Deseja comprar outro sapato?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                    break;
                }
                MostrarCalcado();
                break;
            case "3":
                System.out.println("Tênis casual comprado com sucesso!!");
                System.out.println("Deseja comprar outro sapato?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                    break;
                }
                MostrarCalcado();
                break;
            case "4":
                System.out.println("Sandalia comprada com sucesso!!");
                System.out.println("Deseja comprar outra sandalia?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                    break;
                }
                MostrarCalcado();
                break;
            case "5":
                Menu voltar = new Menu();
                voltar.MostrarMenu();
                break;
        }
    }

}
