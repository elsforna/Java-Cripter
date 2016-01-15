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
        String inserito;
        String out = "";
        
        int i,j;
        int dimS;
        //Dichiarazione Input da tastiera
        
        //Archivio dell"alfabeto latino
        //ArrayList alf1 = new ArrayList();
        
        //array di stringhe
        String[] alf1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","x","y","x"," "};
        
        //Archivo lettere alfabeto nuovo
        //ArrayList alf2 = new ArrayList(); 
        String[] alf2 = {"x","-","_","_-","/-","/_","-_","-_-","/.",".","-./","_.-","..","__","0","_/","0.","/0","$","€","_..","<>","/._","_0.","x.","^"};

//Inserimento Stringa confronto
        inserito = inputS("Inserisci la stringa da convertire:");
        String confronto;
        
        for(i = 0;i<inserito.length();i++){
            for(j=0;j<alf1.length;j++){
                //potrebbe dare ebola
                if(inserito.charAt(i) == (char)alf1[j].charAt(0)){
                    out = out+alf2[j];
                    break;
                }
           
            }
        }
        
        System.out.println(out);



//Inserimento della scelta Conversione



    
   
       
                                 
                                 

                        
                  
                  
                
           
              
        
    }
    
}
