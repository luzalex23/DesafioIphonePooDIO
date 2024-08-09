package com.musicplayer.demo;

import com.musicplayer.demo.core.entities.Iphone;
import com.musicplayer.demo.ultils.ConsoleUtils;

public class DemoApplication {

    public static void main(String[] args) {
        Iphone iphone = new Iphone(); // Usa a classe Iphone para todas as funcionalidades

        while (true) {
            System.out.println("\nEscolha uma funcionalidade:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("4. Sair");

            int escolha = ConsoleUtils.lerInteiro();

            switch (escolha) {
                case 1:
                    System.out.println("\nEscolha uma ação para o Reprodutor Musical:");
                    System.out.println("1. Tocar");
                    System.out.println("2. Pausar");
                    System.out.println("3. Selecionar Música");
                    int acaoReprodutor = ConsoleUtils.lerInteiro();
                    switch (acaoReprodutor) {
                        case 1:
                            iphone.tocar();
                            break;
                        case 2:
                            iphone.pausar();
                            break;
                        case 3:
                            System.out.print("Digite o nome da música: ");
                            String musica = ConsoleUtils.lerString();
                            iphone.selecionarMusica(musica);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\nEscolha uma ação para o Aparelho Telefônico:");
                    System.out.println("1. Ligar");
                    System.out.println("2. Atender");
                    System.out.println("3. Iniciar Correio de Voz");
                    int acaoTelefone = ConsoleUtils.lerInteiro();
                    switch (acaoTelefone) {
                        case 1:
                            System.out.print("Digite o número: ");
                            String numero = ConsoleUtils.lerString();
                            iphone.ligar(numero);
                            break;
                        case 2:
                            iphone.atender();
                            break;
                        case 3:
                            iphone.iniciarCorreioVoz();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\nEscolha uma ação para o Navegador na Internet:");
                    System.out.println("1. Exibir Página");
                    System.out.println("2. Adicionar Nova Aba");
                    System.out.println("3. Atualizar Página");
                    int acaoNavegador = ConsoleUtils.lerInteiro();
                    switch (acaoNavegador) {
                        case 1:
                            System.out.print("Digite a URL: ");
                            String url = ConsoleUtils.lerString();
                            iphone.exibirPagina(url);
                            break;
                        case 2:
                            iphone.adicionarNovaAba();
                            break;
                        case 3:
                            iphone.atualizarPagina();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
