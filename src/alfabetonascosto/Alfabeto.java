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
        static final String[] alf1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};
        //Archivo lettere alfabeto nuovo -- array di stringhe
        static final String[] alf2 = {"x","-","_","_-","/-","/_","-_","-_-","/.",".","-./","_.-","..","__","0","_/","0.","/0","$","€","_..","<","<>","/._","_0.","x.","##"};
        
        
        public static void codifica(String inserito){
            //dichiarazione di stringhe per output e confronto
            String out = "";
            String confronto;
            
            //dichiarazione di iteratori i,j
            int i,j;
            
            //ciclo per caratteri di inserito
            for(i = 0;i<inserito.length();i++){
            //ciclo per elementi di alf1
                for(j=0;j<alf1.length;j++){
                    //confronta il carattere di inserito in posizione i con ogni posizione di alf1
                    if(inserito.charAt(i) == (char)alf1[j].charAt(0)){
                        //aggiunge alla stringa out la posizione j di alf2
                        //out = out+alf2[j]+"    #    ";
                        out = out+alf2[j]+"#";
                        break;
                    }
                }
            }  
            System.out.println(out);
        }
        
        public static void decodifica(String inserito){
            //dichiarazione di stringhe per output e confronto
            String out = "";
            String confronto;
            
            //dichiarazione di iteratori i,j
            int i,j,index;
            String sub;
            //ciclo per caratteri di inserito
            while(inserito.length() != 0){
            //ciclo per elementi di alf1
               // if(inserito.length() != 2){
                //System.out.println("Strigna: "+inserito+"LEN: "+inserito.length()+"I: "+i+"\n");
                index = inserito.indexOf('#');
                //System.out.println(index);
                sub = inserito.substring(0,index);
                //System.out.println(sub);
                
                    for(j=0;j<alf1.length;j++){
                        //confronta il carattere di inserito in posizione i con ogni posizione di alf1
                        if(sub.equals(alf2[j])){
                            //aggiunge alla stringa out la posizione j di alf2
                            //out = out+alf2[j]+"    #    ";
                            out = out+alf1[j];
                            break;
                        }
                    }
                    //inserito = inserito.replace(alf2[i],alf1[i]);
                    inserito = inserito.substring(index+1,inserito.length());
                    //System.out.println(inserito);
                //} 
              //System.out.println("Strigna: "+inserito+"LEN: "+inserito.length()+"I: "+i+"\n");
            
            }
            System.out.println(out);
  
    }
        
}
