package alfabetonascosto;

import static alfabetonascosto.EasyInput.inputS;

public class AlfabetoNascosto {

    public static void main(String[] args) {
        
        String inserito;
     
        //Inserimento Stringa inserito
        inserito = inputS("Inserisci la stringa da convertire:");
        
        Alfabeto.codifica(inserito);
    
    }
    
}
