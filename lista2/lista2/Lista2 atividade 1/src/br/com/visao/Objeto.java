
package br.com.visao;

import br.com.controle.Discente;
import br.com.controle.Docente;
import br.com.controle.Estudante;

public class Objeto {
    
        public static void modificarEstatutoEMedia(Estudante e, int novoEstatuto, double novaMedia) {
        e.setEscolha(novoEstatuto);
        e.setMedia(novaMedia);
    }

    public static void main(String[] args) {
 

        Estudante e = new Estudante();
        e.setNome("Marcos");
        e.setEscolha(1);
        e.setMedia(9.5);
        modificarEstatutoEMedia( e,2, 8.0);
        e.escolher();
        System.out.println(e.getNome());
        System.out.println(e.Estatutos());
        System.out.println(e.media());
       System.out.println("\n");

       Docente doc = new Docente();
        doc.setNome("Carlos");
        doc.setSalario(1728.00);
        doc.definir(1);
        System.out.println(doc.getNome());
        System.out.println(doc.getSalario());
        System.out.println(doc.Profissoes()); 
        System.out.println("\n");
        
        Discente dis = new Discente();
        dis.setNome("Pedro");
        dis.setSalario(3000.00);
        dis.definir(2);
        dis.definirSalario(5250.00); 
        System.out.println(dis.getNome());
        System.out.println(dis.getSalario());
        System.out.println(dis.Profissoes());
    }
    
    
    
}
