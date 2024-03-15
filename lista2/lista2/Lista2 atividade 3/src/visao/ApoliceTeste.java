
package visao;

import controle.Apolice;

public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice a = new Apolice();
        
        a.setNome("Pebinha");
        a.setIdade(25);
        a.setPremio(2000);
        a.setCidade("Rio de Janeiro");
        
        a.calcularPremio();
        a.Desconto();
        
        a.imprimir();
        
        
    } 
}
