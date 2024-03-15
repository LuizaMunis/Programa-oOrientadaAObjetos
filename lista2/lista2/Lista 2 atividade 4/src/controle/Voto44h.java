
package controle;

public class Voto44h extends Urna {
    
    private int contador2 = 0;
    
    @Override
    public int Votar(int voto){
   contador2++;
    return contador2;
}
}
