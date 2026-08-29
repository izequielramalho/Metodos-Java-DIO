package estudos.Izequiel.metódos.criacao;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nExercícios Calculadora");
            Calculadora.soma(10, 20);
            Calculadora.subtracao(40, 10);
            Calculadora.multiplicacao(10, 3);
            Calculadora.divisao(60, 2);

        System.out.println("\nExercícios Mensagem");
            Mensagem.obterMensagem(5);
            Mensagem.obterMensagem(20);
            Mensagem.obterMensagem(15);

        System.out.println("\nExercícios Empréstimo");
            Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
            Emprestimo.calcular(1000,Emprestimo.gitTresParcelas());
            Emprestimo.calcular(1000, 5);



    }
}
