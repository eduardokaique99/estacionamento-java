import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao, opcao1, opcao2, opcao3 = 0;

        System.out.println("Estacionamento");

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Cadastrar vaga");
            System.out.println("3 - Cadastrar locação");
            System.out.println("4 - Listar veículo");
            System.out.println("5 - Listar vagas");
            System.out.println("6 - Listar locações");
            System.out.println("7 - Remover veículo");
            System.out.println("8 - Remover vaga");
            System.out.println("9 - Remover locação");
            System.out.println("10 - Sair");
            System.out.print("Opção: ");
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    do {
                        System.out.println("\n\nEscolha o veículo");
                        System.out.println("1 - Cadastrar carro");
                        System.out.println("2 - Cadastrar moto");
                        System.out.println("3 - Cadastrar bicicleta");
                        System.out.println("4 - Sair");
                        System.out.print("Opção: ");
                        try {
                            opcao1 = scanner.nextInt();
                        } catch (Exception e) {
                            opcao1 = 0;
                        }
        
                    switch (opcao1) {
                            case 1:
                                cadastrarCarro(scanner);
                                break;
                            case 2:
                                cadastrarMoto(scanner);
                                break;
                            case 3:
                                cadastrarBicicleta(scanner);
                                break;
                            case 4:
                                System.out.println("\nSaindo...\n\n");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                            }
                        } while (opcao1 != 4);
                        break;
                case 2:
                    cadastrarVaga(scanner);
                    break;
                case 3:
                    cadastrarLocacao(scanner);
                    break;
                case 4:
                        do {
                            System.out.println("\n\nEscolha o veículo");
                            System.out.println("1 - Listar carro");
                            System.out.println("2 - Listar moto");
                            System.out.println("3 - Listar bicicleta");
                            System.out.println("4 - Sair");
                            System.out.print("Opção: ");
                            try {
                                opcao2 = scanner.nextInt();
                            } catch (Exception e) {
                                opcao2 = 0;
                            }
        
                        switch (opcao2) {
                            case 1:
                                listarCarro(scanner);
                                break;
                            case 2:
                                listarMoto(scanner);
                                break;
                            case 3:
                                listarBicicleta(scanner);
                                break;
                            case 4:
                                System.out.println("\n\nSaindo...\n\n");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                            }
                        } while (opcao2 != 4);
                    break;
                case 5:
                    listarVaga(scanner);
                    break;
                case 6:
                    listarLocacao(scanner);
                    break;
                case 7:
                        do {
                            System.out.println("\n\nEscolha o veículo");
                            System.out.println("1 - Remover carro");
                            System.out.println("2 - Remover moto");
                            System.out.println("3 - Remover bicicleta");
                            System.out.println("4 - Sair");
                            System.out.print("Opção: ");
                            try {
                                opcao3 = scanner.nextInt();
                            } catch (Exception e) {
                                opcao3 = 0;
                            }
                        switch (opcao3) {
                                case 1:
                                    removerCarro(scanner);
                                    break;
                                case 2:
                                    removerMoto(scanner);
                                    break;
                                case 3:
                                    removerBicicleta(scanner);
                                    break;
                                case 4:
                                    System.out.println("\n\nSaindo...\n\n");
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                                    break;
                                }
                            } while (opcao3 != 4);
                        break;
                case 8:
                    removerVaga(scanner);
                    break;
                case 9:
                    removerLocacao(scanner);
                    break;
                case 10:
                    System.out.println("\n\nSaindo...\n\n");   
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 10);
        
    }
    


        public static void cadastrarCarro(Scanner scanner) {
            System.out.println("\n\nCadastro de Carro");
            System.out.println("Informe o nome do carro: ");
            String nome = scanner.next();
            System.out.println("Informe a placa do carro: ");
            String placa = scanner.next();
            System.out.println("Informe a cor do carro: ");
            String cor = scanner.next();

            Veiculo carro = new Carro(nome, placa, cor);
            System.out.println("\nCarro cadastrado com sucesso!\n" + carro);
        }

        public static void cadastrarMoto(Scanner scanner) {
            System.out.println("\n\nCadastro de Moto");
            System.out.println("Informe o nome da moto: ");
            String nome = scanner.next();
            System.out.println("Informe a placa da moto: ");
            String placa = scanner.next();
            System.out.println("Informe a quantidade de cilindradas: ");
            String cilindradas = scanner.next();

            Veiculo moto = new Moto(nome, placa, cilindradas);
            System.out.println("\nMoto cadastrada com sucesso!\n" + moto);
        }

        public static void cadastrarBicicleta(Scanner scanner) {
            System.out.println("\n\nCadastro de Bicileta");
            System.out.println("Informe o nome da bicicleta: ");
            String nome = scanner.next();
            System.out.println("Informe a marca da bicicleta: ");
            String marca = scanner.next();
            System.out.println("Informe a cor da bicicleta: ");
            String cor = scanner.next();

            Veiculo bicicleta = new Bicicleta(nome, marca, cor);
            System.out.println("\nBicicleta cadastrada com sucesso!\n" + bicicleta);
        }

        public static void cadastrarVaga(Scanner scanner) {
            System.out.println("\n\nCadastro de Vagas");
            System.out.println("Informe o número da vaga: ");
            int numero = scanner.nextInt();
            System.out.println("Informe o tipo da vaga: [C]-Carro [M]-Moto [B]-Bicicleta");
            String tipo = scanner.next();
            System.out.println("Informe o tamanho da vaga: ");
            String tamanho = scanner.next();
            System.out.println("Informe o valor da vaga: ");
            float valor = scanner.nextFloat();

            Vaga vaga = new Vaga(numero, tipo, tamanho, valor);
            System.out.println("\nVaga cadastrada com sucesso!\n" + vaga);
        }

        public static void cadastrarLocacao(Scanner scanner) {
            System.out.println("\n\nCadastro de Locação");
            System.out.println("----------------------------------");
            System.out.println("Veículos para Locação: ");
            for (Veiculo veiculo : Veiculo.veiculos) {
                    System.out.println(veiculo);
            }
            System.out.println("----------------------------------");
            System.out.println("Informe o id do veículo: ");
            int idVeiculo = scanner.nextInt();
        }

        public static void listarCarro (Scanner scanner) {
            System.out.println("\n\nCARROS");
            System.out.println("----------------------------------");
            for (Veiculo carro : Veiculo.veiculos) {
                    System.out.println(carro);
            }
            System.out.println("----------------------------------");
        }

        public static void listarMoto (Scanner scanner) {
            System.out.println("\n\nMOTOS");
            System.out.println("----------------------------------");
            for (Veiculo moto : Veiculo.veiculos) {
                    System.out.println(moto);
            }
            System.out.println("----------------------------------");
        }

        public static void listarBicicleta (Scanner scanner) {
            System.out.println("\n\nBICICLETAS");
            System.out.println("----------------------------------");
            for (Veiculo bicicleta : Veiculo.veiculos) {
                    System.out.println(bicicleta);
            }
            System.out.println("----------------------------------");
        }

        public static void listarVaga (Scanner scanner) {
            System.out.println("\n\nVAGAS");
            System.out.println("----------------------------------");
            for (Vaga vaga : Vaga.vagas) {
                    System.out.println(vaga);
            }
            System.out.println("----------------------------------");
        }

        public static void listarLocacao (Scanner scanner) {
            System.out.println("\n\nLOCAÇÃO");
            System.out.println("----------------------------------");
            for (Locacao locacao : Locacao.locacoes) {
                    System.out.println(locacao);
            }
            System.out.println("----------------------------------");
        }



        
        public static void removerCarro (Scanner scanner) {
            System.out.println("\n\nRemover Carro");
            System.out.println("Informe o ID do carro: ");
            int id = scanner.nextInt();
            for (Veiculo carro : Veiculo.veiculos) {
                if (carro.getId() == id) {
                    Veiculo.veiculos.remove(carro);
                    System.out.println("\nCarro excluído com sucesso!");
                    break;
                }
            }
        }

        public static void removerMoto (Scanner scanner) {
            System.out.println("\n\nRemover Moto");
            System.out.println("Informe o ID da moto: ");
            int id = scanner.nextInt();
            for (Veiculo moto : Veiculo.veiculos) {
                if (moto.getId() == id) {
                    Veiculo.veiculos.remove(moto);
                    System.out.println("\nMoto excluída com sucesso!");
                    break;
                }
            }
        }

        public static void removerBicicleta (Scanner scanner) {
            System.out.println("\n\nRemover Bicicleta");
            System.out.println("Informe o ID da bicicleta: ");
            int id = scanner.nextInt();
            for (Veiculo bicicleta : Veiculo.veiculos) {
                if (bicicleta.getId() == id) {
                    Veiculo.veiculos.remove(bicicleta);
                    System.out.println("\nBicicleta excluída com sucesso!");
                    break;
                }
            }
        }

        public static void removerVaga (Scanner scanner) {
            System.out.println("\n\nRemover Vaga");
            System.out.println("Informe o ID da Vaga: ");
            int id = scanner.nextInt();
            for (Vaga vaga : Vaga.vagas) {
                if (vaga.getId() == id) {
                    Vaga.vagas.remove(vaga);
                    System.out.println("\nVaga excluída com sucesso!");
                    break;
                }
            }
        }

        public static void removerLocacao (Scanner scanner) {
            System.out.println("\n\nRemover Locação");
            System.out.println("Informe o ID da Locação: ");
            int id = scanner.nextInt();
            for (Locacao locacao : Locacao.locacoes) {
                if (locacao.getId() == id) {
                    Locacao.locacoes.remove(locacao);
                    System.out.println("\nLocação excluída com sucesso!");
                    break;
                }
            }
        }
        }