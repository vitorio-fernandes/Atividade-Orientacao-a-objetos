package Models;
import java.util.Scanner;

import Interface.InterfaceProdutos;
import Repository.RepositoryProdutos;

public class Menu {
    Scanner sc = new Scanner(System.in);
    InterfaceProdutos repositoryProdutos = new RepositoryProdutos();

    public void MenuPrincipal() {
        System.out.println("1- Menu Produtos");
        System.out.println("0- Sair");
        funcoesPrincipal();
    }

    public void funcoesPrincipal() {
        int entrada = sc.nextInt();

        switch (entrada) {
            case 1:
                MenuProdutos();
                funcoesProdutos();
                break;

            case 0:
                System.out.println("Encerrando o programa.....");
                System.exit(0);
                break;

            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }

    public void MenuProdutos() {
        System.out.println("1- Adicionar Produto");
        System.out.println("2- Remover Produto");
        System.out.println("3- Consultar Produtos");
        System.out.println("4- Voltar");
    }

    public void funcoesProdutos() {
      
        int menuProduto = sc.nextInt();

        switch (menuProduto) {
            case 1:
                System.out.println("Digite o tipo de Produto que deseja adicionar [1- Smartphone 2- Televisão]");
                int add = sc.nextInt();

                if (add == 1) {
                    System.out.println("Digite o nome do fabricante: ");
                    String fabricante = sc.next();
                    System.out.println("Digite o tamanho da tela: ");
                    float tamTela = sc.nextFloat();
                    System.out.println("Digite a capacidade da Bateria: ");
                    float tamBateria = sc.nextFloat();
                    Smatphone telefone = new Smatphone(tamTela, tamBateria, fabricante);
                    repositoryProdutos.adicionarProduto(telefone);
                    System.out.println("Produto adicionado com sucesso !\n");
                    break;
                } else if (add == 2) {
                    System.out.println("Digite o nome do fabricante: ");
                    String fabricante = sc.next();
                    System.out.println("Digite o tamanho da tela: ");
                    float tamTela = sc.nextFloat();
                    System.out.println("Digite o tipo de controle: ");
                    String controle = sc.next();
                    Televisao tv = new Televisao(tamTela, fabricante, controle);
                    repositoryProdutos.adicionarProduto(tv);
                    System.out.println("Produto adicionado com sucesso !\n");
                } else {
                    System.out.println("Opção Inválida!\n");
                }
                break;

            case 2:
                if (repositoryProdutos.getProdutos().isEmpty()) {
                    System.out.println("Não há produtos cadastrados !\n");
                } else {
                    repositoryProdutos.listarProdutos();
                    System.out.println("Digite o índice do Produto que deseja remover: ");
                    int indice = sc.nextInt();

                    if (indice <= 0 || indice > repositoryProdutos.getProdutos().size()
                            || indice < repositoryProdutos.getProdutos().size()) {
                        System.out.println("Índice Incorreto !\n");
                    } else {
                        repositoryProdutos.removerProduto(indice - 1);
                        System.out.println("Produto removido com sucesso !\n");
                    }
                }

                break;

            case 3:
                if (repositoryProdutos.getProdutos().isEmpty()) {
                    System.out.println("Não há produtos cadastrados !\n");
                }
                repositoryProdutos.listarProdutos();
                break;

            case 4:
                MenuPrincipal();
                break;

            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}
