package br.com.lojinha.inicio;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Wendel Teixeira
 */
public class RoupasF {
    public void MostrarRoupasF(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bem vindo a seção de Roupas Femininas, qual roupa deseja comprar?(Digite o número)");
    String escolha = "0";
    System.out.println("1.Vestido \n2.Macacão \n3.Camisa social \n4.Calça \n5.Cropped\n6.Voltar");
    escolha = scanner.nextLine();
    HandleRoupasF(escolha);

}

    private void HandleRoupasF (String escolha) {
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
                MostrarRoupasF();
                break;
            case "1":
                System.out.println("Vestido comprado com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                    break;
                }
                MostrarRoupasF();
                break;
            case "2":
                System.out.println("Macacão comprado com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                    break;
                }
                MostrarRoupasF();
                break;
            case "3":
                System.out.println("Camisa Social comprada com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                    break;
                }
                MostrarRoupasF();
                break;
            case "4":
                System.out.println("Calça comprada com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                    break;
                }
                MostrarRoupasF();
                break;
            case "5":
                System.out.println("Cropped comprada com sucesso!!");
                System.out.println("Deseja comprar outra roupa?\n1.sim 2.não (Digite um número)");
                if (!scanner.nextLine().equals("1")){
                    new Menu().MostrarMenu();
                    break;
                }
                MostrarRoupasF();
                break;
            case "6":
                Menu voltar = new Menu();
                voltar.MostrarMenu();
                break;
        }
    }
}
