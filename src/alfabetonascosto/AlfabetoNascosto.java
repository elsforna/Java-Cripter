package alfabetonascosto;

import static alfabetonascosto.EasyInput.inputS;

public class AlfabetoNascosto {

    public static void main(String[] args) {
        
        String inserito;
        
        //Documentazione sul Software
        inputS("Codice che effettua la conversione di una stringa da Alfabeto Latino in Codice SCripter inserita in Input"
                + "\n - A/a = X\n - B/b = -\n - C/c = _\n - D/d = _-\n - E/e = /-\n - F/f = /_\n - G/g = __\n - H/h = -_-\n - I/i = /.\n - J/j = .\n - K/k = -./\n - L/l = _.-\n - M/m = ..\n - N/n = __\n - O/o = 0\n - P/p = _/\n - Q/q = 0.\n - R/r = /0\n - S/s = $\n - T/t = €\n - U/u = _..\n - W/w = <>\n - X/x = /._\n - Y/y = _0.\n - Z/z = X.\n - Space Between Letter = #\n - Space Between Words = ##\n \"Digitare il Carrage Return:\"   ");
        //Inserimento Stringa inserito
        inserito = inputS("Inserisci la stringa da convertire:");
        
        
        Alfabeto.codifica(inserito);
        
        inserito = inputS("Inserisci la stringa da decodificare:");
        
        Alfabeto.decodifica(inserito);
    
    }
    
}
