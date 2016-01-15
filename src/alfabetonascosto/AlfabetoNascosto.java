/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfabetonascosto;

import static alfabetonascosto.EasyInput.inputS;


/**
 *
 * @author eliasforna
 */
public class AlfabetoNascosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dichiarazione di stringhe per input,output e confronto
        String inserito;
        String out = "";
        String confronto;
        
        //dichiarazione di iteratori i,j
        int i,j;
        
        //Archivio dell"alfabeto latin
        //array di stringhe
        String[] alf1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","x","y","x"," "};
        
        //Archivo lettere alfabeto nuovo
        //ArrayList alf2 = new ArrayList(); 
        String[] alf2 = {"x","-","_","_-","/-","/_","-_","-_-","/.",".","-./","_.-","..","__","0","_/","0.","/0","$","€","_..","<>","/._","_0.","x.","^"};

        //Inserimento Stringa inserito
        inserito = inputS("Inserisci la stringa da convertire:");
        
        //ciclo per caratteri di inserito
        for(i = 0;i<inserito.length();i++){
            //ciclo per elementi di alf1
            for(j=0;j<alf1.length;j++){
                //confronta il carattere di inserito in posizione i con ogni posizione di alf1
                if(inserito.charAt(i) == (char)alf1[j].charAt(0)){
                    //aggiunge alla stringa out la posizione j di alf2
                    out = out+alf2[j];
                    break;
                }
           
            }
        }
        
        System.out.println(out);
    
    }
    
}
