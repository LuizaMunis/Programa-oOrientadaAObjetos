package br.com.controle;

public class Discente extends Empregado {
    private String profissao;

    @Override
    public int definir(int funcao) {
        switch (funcao) {
            case 1:
                profissao = "Escritorio";
                break;
            case 2:
                profissao = "Manutencao";
                break;

            default:
                profissao = "Desconhecido";
        }
        return funcao;
    }

    public String Profissoes() {
        return profissao;
    }
}
