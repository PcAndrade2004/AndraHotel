package com.empresa.andrahotel.view;

import com.empresa.andrahotel.model.*;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner entrada = new Scanner(System.in);
    Hotel hotel = new Hotel();

    public void exibir() {
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n==== HOTEL ANDRADE ====");
            System.out.println("1 - Gerenciar Quartos");
            System.out.println("2 - Gerenciar Funcionários");
            System.out.println("3 - Gerenciar Hóspedes");
            System.out.println("4 - Gerenciar Reservas");
            System.out.println("5 - Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: gerenciarQuartos(); break;
                case 2: gerenciamentoFuncionario(); break;
                case 3: gerenciarHospedes(); break;
                case 4: gerenciarReservas(); break;
                case 5: System.out.println("Encerrando o sistema..."); break;
            }
        }
    }

    public void gerenciarQuartos() {
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n==== Gerenciar Quartos ====");
            System.out.println("1 - Adicionar Quarto");
            System.out.println("2 - Listar Quartos");
            System.out.println("3 - Buscar Quartos Disponíveis");
            System.out.println("4 - Voltar");
            opcao = entrada.nextInt();

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

                case 4:
                    System.out.println("Voltando ao menu principal...\n");
                    break;
            }
        }
    }

    public void gerenciamentoFuncionario() {
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n==== Gerenciar Funcionários ====");
            System.out.println("1 - Adicionar Recepcionista");
            System.out.println("2 - Adicionar Gerente");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Calcular Folha de Pagamento");
            System.out.println("5 - Voltar");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("=== Adicionar Recepcionista ===\n");
                    entrada.nextLine();
                    System.out.println("Digite a matrícula: ");
                    String matricula = entrada.nextLine();

                    System.out.println("Digite o nome: ");
                    String nome = entrada.nextLine();

                    System.out.println("Digite o CPF: ");
                    String cpf = entrada.nextLine();

                    System.out.println("Digite o salário base: ");
                    double salario = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.println("Digite o turno: ");
                    String turno = entrada.nextLine();

                    Recepcionista rec = new Recepcionista(matricula, nome, cpf, salario, turno);
                    hotel.adicionarFuncionario(rec);
                    System.out.println("Recepcionista adicionada com sucesso!\n");
                    break;

                case 2:
                    System.out.println("=== Adicionar Gerente ===\n");
                    entrada.nextLine();
                    System.out.println("Digite a matrícula: ");
                    String matricula1 = entrada.nextLine();

                    System.out.println("Digite o nome: ");
                    String nome1 = entrada.nextLine();

                    System.out.println("Digite o CPF: ");
                    String cpf1 = entrada.nextLine();

                    System.out.println("Digite o salário base: ");
                    double salario1 = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.println("Digite o departamento: ");
                    String departamento = entrada.nextLine();

                    System.out.println("Digite o percentual de bônus: ");
                    double percentualBonus = entrada.nextDouble();
                    entrada.nextLine();

                    Gerente g = new Gerente(matricula1, nome1, cpf1, salario1, departamento, percentualBonus);
                    hotel.adicionarFuncionario(g);
                    System.out.println("Gerente adicionado com sucesso!\n");
                    break;

                case 3:
                    System.out.println("=== Listar Funcionários ===\n");
                    for (Funcionario f : hotel.getFuncionarios()) {
                        System.out.println(f);
                    }
                    break;

                case 4:
                    System.out.println("=== Calcular Folha de Pagamento ===\n");
                    System.out.println("Total: R$ " + String.format("%.2f", hotel.calcularFolhaPagamento()));
                    break;

                case 5:
                    System.out.println("Voltando ao menu principal...\n");
                    break;
            }
        }
    }

    public void gerenciarHospedes() {
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n==== Gerenciar Hóspedes ====");
            System.out.println("1 - Adicionar Hóspede");
            System.out.println("2 - Listar Hóspedes");
            System.out.println("3 - Voltar");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("=== Adicionar Hóspede ===\n");
                    entrada.nextLine();
                    System.out.println("Digite o nome: ");
                    String nome = entrada.nextLine();

                    System.out.println("Digite o CPF: ");
                    String cpf = entrada.nextLine();

                    System.out.println("Digite o email: ");
                    String email = entrada.nextLine();

                    System.out.println("Digite o telefone: ");
                    String telefone = entrada.nextLine();

                    System.out.println("Digite a nacionalidade: ");
                    String nacionalidade = entrada.nextLine();

                    Hospede hospede = new Hospede(nome, cpf, email, telefone, nacionalidade);
                    hotel.adicionarHospede(hospede);
                    System.out.println("Hóspede adicionado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("=== Listar Hóspedes ===\n");
                    for (Hospede h : hotel.getHospedes()) {
                        System.out.println(h);
                    }
                    break;

                case 4:
                    System.out.println("Voltando ao menu principal...\n");
                    break;
            }
        }
    }

    public void gerenciarReservas() {
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n==== Gerenciar Reservas ====");
            System.out.println("1 - Adicionar Reserva");
            System.out.println("2 - Listar Reservas");
            System.out.println("3 - Voltar");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("=== Adicionar Reserva ===\n");
                    entrada.nextLine();
                    System.out.println("Digite o ID da reserva: ");
                    String id = entrada.nextLine();

                    System.out.println("Digite o número do quarto: ");
                    String numeroQuarto = entrada.nextLine();

                    System.out.println("Digite o ano do check-in: ");
                    int anoIn = entrada.nextInt();
                    System.out.println("Digite o mês do check-in: ");
                    int mesIn = entrada.nextInt();
                    System.out.println("Digite o dia do check-in: ");
                    int diaIn = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Digite o ano do check-out: ");
                    int anoOut = entrada.nextInt();
                    System.out.println("Digite o mês do check-out: ");
                    int mesOut = entrada.nextInt();
                    System.out.println("Digite o dia do check-out: ");
                    int diaOut = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Digite o número de pessoas: ");
                    int numPessoas = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Inclui café da manhã? (true/false): ");
                    boolean cafe = entrada.nextBoolean();
                    entrada.nextLine();

                    Quarto quarto = hotel.buscarQuartoPorNumero(numeroQuarto);
                    if (quarto == null) {
                        System.out.println("Quarto não encontrado!\n");
                        break;
                    }

                    Reserva reserva = new Reserva(id,
                            java.time.LocalDate.of(anoIn, mesIn, diaIn),
                            java.time.LocalDate.of(anoOut, mesOut, diaOut),
                            quarto.getValorDiaria(),
                            0,
                            "",
                            numPessoas,
                            cafe,
                            StatusReserva.CONFIRMADO,
                            quarto);

                    quarto.setStatus(StatusQuarto.OCUPADO);
                    System.out.println("Reserva criada com sucesso!\n");
                    System.out.println(reserva.gerarDescrisaoFatura());
                    break;

                case 2:
                    System.out.println("=== Listar Reservas ===\n");
                    break;

                case 3:
                    System.out.println("Voltando ao menu principal...\n");
                    break;
            }
        }
    }
}