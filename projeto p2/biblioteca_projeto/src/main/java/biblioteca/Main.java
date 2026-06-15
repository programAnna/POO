package biblioteca;

import biblioteca.DAO.Banco;
import biblioteca.classes.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Cria o banco e as tabelas
        Banco.criarTabelas();

        try {

            System.out.println("=== SISTEMA DE BIBLIOTECA ===\n");

            // Criando biblioteca
            Bibliotecapoo biblioteca = new Bibliotecapoo("Biblioteca Central");

            // Categorias
            List<String> categorias = Arrays.asList(
                    "Programação",
                    "Tecnologia",
                    "Educação"
            );

            // Criando obra
            Livro livro = new Livro(
                    "Java Orientado a Objetos",
                    "Deitel",
                    2024,
                    categorias,
                    "978-123456789"
            );

            // Cadastrando obra com 2 cópias
            biblioteca.cadastrarObra(livro, 2);

            System.out.println("Livro cadastrado com sucesso!\n");

            // Criando leitor
            Leitor leitor = new Leitor(
                    "Ana Silva",
                    "123.456.789-00",
                    "11-99999-8888",
                    "ana@email.com",
                    "Senha123"
            );

            System.out.println("Leitor cadastrado: " + leitor.getNome());

            // Procurando uma cópia disponível
            Copia copia = biblioteca.buscar("Java Orientado a Objetos")
                    .orElseThrow(() -> new Exception("Livro não encontrado"));

            System.out.println("\nCópia encontrada:");
            System.out.println(copia);

            // Empréstimo
            Operacao emprestimo = new Emprestimo(leitor, copia);
            biblioteca.processar(emprestimo);

            // Tentativa de empréstimo da mesma cópia
            try {

                System.out.println("\nTentando emprestar novamente...");

                biblioteca.processar(
                        new Emprestimo(leitor, copia)
                );

            } catch (BibliotecaException e) {

                System.out.println(
                        "Erro esperado: " + e.getMessage()
                );
            }

            // Devolução
            biblioteca.processar(
                    new Devolucao(leitor, copia)
            );

            // Reserva
            biblioteca.processar(
                    new Reserva(leitor, copia)
            );

            // Histórico
            System.out.println("\n=== HISTÓRICO ===");

            for (Operacao op : biblioteca.getHistorico()) {

                System.out.println(
                        op.getClass().getSimpleName()
                );
            }

        } catch (Exception e) {

            System.out.println(
                    "\nErro: " + e.getMessage()
            );

            e.printStackTrace();

        }
    }
}