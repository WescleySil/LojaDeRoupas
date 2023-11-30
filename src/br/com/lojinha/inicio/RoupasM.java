package br.com.lojinha.inicio;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Carlos Eduardo Soares
 */
public class RoupasM {
    public void MostrarRoupasM(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a seção de Roupas Masculinas, qual roupa deseja comprar?(Digite o número)");
        String escolha = "0";
        System.out.println("1.Regata\n2.Camisa Social \n3.Moletom \n4.Camisa Esportiva \n5.Jaqueta\n6.Voltar");
        escolha = scanner.nextLine();
        HandleRoupasM(escolha);

    }

    private void HandleRoupasM(String escolha) {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1");
        menu.add("2");
        menu.add("3");
        menu.add("4");
        menu.add("5");
        menu.add("6");
        Scanner scanner = new Scanner(System.in);
        switch (escolha) {
            default:
                if (!escolha.equals(menu)) {
                    System.out.println("!!Digite apenas números disponíveis no menu!!!");
                }
                MostrarRoupasM();
                break;
            case "1":
                System.out.println("Regata comprada com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                }
                MostrarRoupasM();
                break;
            case "2":
                System.out.println("Camisa Social comprada com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                }
                MostrarRoupasM();
                break;
            case "3":
                System.out.println("Moletom comprado com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                }
                MostrarRoupasM();
                break;
            case "4":
                System.out.println("Camisa Esportiva comprada com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                }
                MostrarRoupasM();
                break;
            case "5":
                System.out.println("Jaqueta comprada com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                }
                MostrarRoupasM();
                break;
            case "6":
                Menu voltar = new Menu();
                voltar.MostrarMenu();
        }
    }
}
