package com.empresa.andrahotel.view;

import com.empresa.andrahotel.model.Hotel;
import com.empresa.andrahotel.model.Quarto;
import com.empresa.andrahotel.model.StatusQuarto;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner entrada = new Scanner(System.in);
    Hotel hotel = new Hotel();

    public void exibir() {
        System.out.println("1 - Gerenciar Quartos");
        System.out.println("2 - Gerenciar Funcionários");
        System.out.println("1 - Gerenciar Hóspedes");
        System.out.println("1 - Gerenciar Reservas");
        System.out.println("Relatórios");
        System.out.println("0 - Sair");
        int opcao = entrada.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                case 1:

                    break;
            }
        }
    }

    public void gerenciarQuartos() {
        System.out.println("==== Gerenciar Quartos ====\n");
        System.out.println("1 - Adicionar Quarto");
        System.out.println("2 - Listar Quartos");
        System.out.println("3 - Buscar Quartos Disponíveis");
        System.out.println("4 - Voltar");
        int opcao = entrada.nextInt();

        while (opcao != 4) {

            switch (opcao) {
                case 1:
                    System.out.println("=== ADICIONAR QUARTO ===\n");
                    entrada.nextLine();
                    System.out.println("Digite o número do Quarto: ");
                    String numeroQuarto = entrada.nextLine();

                    System.out.println("Digite o andar: ");
                    int andar = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Digite o tipo de quarto: ");
                    String tipo = entrada.nextLine();

                    System.out.println("Digite a capacidade do quarto: ");
                    int capacidade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Digite o preço da diária: ");
                    double preco = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.println("Possui varanda? (true/false): ");
                    boolean varanda = entrada.nextBoolean();
                    entrada.nextLine();

                    System.out.println("Possui ar-condicionado? (true/false): ");
                    boolean arCondicionado = entrada.nextBoolean();
                    entrada.nextLine();

                    Quarto quarto = new Quarto(numeroQuarto, andar, tipo, capacidade, preco, StatusQuarto.DISPONIVEL, varanda, arCondicionado);
                    hotel.adicionarQuarto(quarto);
                    System.out.println("Quarto adicionado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("=== LISTAR QUARTOS ===\n");
                    for (Quarto q : hotel.getQuartos()) {
                        System.out.println(q);
                    }
                    break;

                case 3:
                    System.out.println("=== QUARTOS DISPONÍVEIS ===\n");
                    for (Quarto q : hotel.buscarQuartoDisponivel()) {
                        System.out.println(q);
                    }
                    break;
            }
        }
    }
}
