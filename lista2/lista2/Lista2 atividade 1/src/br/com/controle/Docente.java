
package br.com.controle;

public class Docente extends Empregado {
    private String profissao;

    @Override
    public int definir(int funcao) {
        switch (funcao) {
            case 1:
                profissao = "Professor";
                break;
            case 2:
                profissao = "Monitor";
                break;
            case 3:
                profissao = "Demonstrador";
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


