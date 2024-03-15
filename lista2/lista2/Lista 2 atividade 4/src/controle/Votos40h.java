
package controle;

public class Votos40h extends Urna{
    private int contador1 = 0;
    
    @Override
    public int Votar(int voto){
      contador1++;
    return contador1;
}

}
