package edu.projetos_intermediarios.catalogo_filmes;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CatalogoFilmes catalogoFilmes = new CatalogoFilmes();
        Scanner scan = new Scanner(System.in);
        int opcao = -1;

        // Adicionando alguns filmes para testes iniciais
        catalogoFilmes.adicionarFilme("Blade Runner 2049", "Denis Villeneuve", 2017);
        catalogoFilmes.adicionarFilme("As vantagens de ser invisivel", "Stephen Chbosky", 2012);
        catalogoFilmes.adicionarFilme("Duna", "Denis Villeneuve", 2021);

        while (opcao != 0) {
            System.out.println("### Catálogo de Filmes ###");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Listar todos os Filmes");
            System.out.println("3. Buscar Filme por Autor");
            System.out.println("4. Buscar Filme por Título");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Por favor, digite um número.");
                continue;
            }

            switch (opcao){
                case 1 -> {
                    System.out.print("Digite o título: ");
                    String titulo = scan.nextLine();
                    System.out.print("Digite o diretor: ");
                    String diretor = scan.nextLine();
                    System.out.print("Digite o anoLancamento de lançamento: ");
                    int anoLancamento = Integer.parseInt(scan.nextLine());
                    catalogoFilmes.adicionarFilme(titulo, diretor, anoLancamento);
                }
                case 2 -> catalogoFilmes.listarFilmes();
                case 3 -> {
                    System.out.print("Digite o nome do diretor para buscar: ");
                    String diretorBusca = scan.nextLine();
                    List<Filme> filmesEncontrados = catalogoFilmes.buscarPorDiretor(diretorBusca);
                    if (filmesEncontrados.isEmpty()) {
                        System.out.println("Nenhum filme encontrado para este diretor.\n");
                    } else {
                        System.out.println("Filmes encontrados:");
                        for (Filme filme : filmesEncontrados) {
                            System.out.println(filme);
                        }
                        System.out.println(" ");
                    }
                }
                case 4 -> {
                    System.out.print("Digite o título para buscar: ");
                    String tituloBusca = scan.nextLine();
                    Filme filmeEncontrado = catalogoFilmes.buscarPorTitulo(tituloBusca);
                    if (filmeEncontrado != null) {
                        System.out.println("Filme encontrado: " + filmeEncontrado+"\n");
                    } else {
                        System.out.println("Nenhum Filme encontrado com este título.\n");
                    }
                }
                case 0 -> System.out.println("Saindo do programa...\n");
                default -> System.out.println("Opção inválida!\n");
            }
        }
        scan.close();
    }
}
