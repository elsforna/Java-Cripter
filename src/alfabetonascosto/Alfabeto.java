/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfabetonascosto;

/**
 *
 * @author eliasforna
 */

public class Alfabeto {
        //Archivio dell"alfabeto latin -- array di stringhe
        private final String[] alf1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","x","y","x"," "};
        //Archivo lettere alfabeto nuovo -- array di stringhe
        private final String[] alf2 = {"x","-","_","_-","/-","/_","-_","-_-","/.",".","-./","_.-","..","__","0","_/","0.","/0","$","€","_..","<>","/._","_0.","x.","^"};
        
        public Alfabeto(String inserito){
            codifica(inserito);
        }
        public  void codifica(String inserito){
            //dichiarazione di stringhe per output e confronto
            String out = "";
            String confronto;
            
            //dichiarazione di iteratori i,j
            int i,j;
            
            //ciclo per caratteri di inserito
            for(i = 0;i<inserito.length();i++){
            //ciclo per elementi di alf1
                for(j=0;j<this.alf1.length;j++){
                    //confronta il carattere di inserito in posizione i con ogni posizione di alf1
                    if(inserito.charAt(i) == (char)this.alf1[j].charAt(0)){
                        //aggiunge alla stringa out la posizione j di alf2
                        out = out+this.alf2[j];
                        break;
                    }
                }
            }  
            System.out.println(out);
        }
  
}
