/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfabetonascosto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author eliasforna
 */
public class AlfabetoNascosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Dichiarazione Input da tastiera
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        //Archivio dell'alfabeto latino
        ArrayList alf1 = new ArrayList();
        alf1.add("A");
        alf1.add("B");
        alf1.add("C");
        alf1.add("D");
        alf1.add("E");
        alf1.add("F");
        alf1.add("G");
        alf1.add("H");
        alf1.add("I");
        alf1.add("J");
        alf1.add("K");
        alf1.add("L");
        alf1.add("M");
        alf1.add("N");
        alf1.add("O");
        alf1.add("P");
        alf1.add("Q");
        alf1.add("R");
        alf1.add("S");
        alf1.add("T");
        alf1.add("U");
        alf1.add("W");
        alf1.add("X");
        alf1.add("Y");
        alf1.add("Z");
        alf1.add(" ");
        //Archivo lettere alfabeto nuovo
        ArrayList alf2 = new ArrayList(); 
        alf2.add("X");
         alf2.add("-");
          alf2.add("_");
           alf2.add("_-");
            alf2.add("/-");
             alf2.add("/_");
              alf2.add("-_");
               alf2.add("-_-");
                alf2.add("/.");
                 alf2.add(".");
                  alf2.add("-./");
                   alf2.add("_.-");
                    alf2.add("..");
                     alf2.add("__");
                      alf2.add("0");
                       alf2.add("_/");
                        alf2.add("0.");
                         alf2.add("/0");
                          alf2.add("$");
                           alf2.add("€");
                            alf2.add("_..");
                             alf2.add("<>");
                              alf2.add("/._");
                               alf2.add("_0.");
                                alf2.add("X.");
                                 alf2.add("^");
ArrayList ins = new ArrayList();
ArrayList out = new ArrayList();
//Inserimento Stringa confronto

String inserimento = "";
int i = -1;
int dim = 10000;
int consIndex = 0;


System.out.println("Inserisci la Stringa che vuoi convertire:");
try
{
    while(i<dim)
    {
        if(!"/stop".equals(inserimento))
        {
            inserimento = tastiera.readLine();
            //ins.add(inserimento);
            ins.add(i, inserimento);
            i++;
            consIndex = i;
        }
        else
        {
          
            break; 
        }
    }
    
}
catch(Exception e)
{
    System.out.println("Errore");
}


//Inserimento della scelta Conversione
int numeroSw = 0; 
System.out.println(ins.size());
try
{
    System.out.println("- Digita 1 se vuoi passare da Alfabeto Latino ad AlfabetoNuovo;\n" + "Digita 2 se vuoi passare da Alfabeto Nuovo ad Alfabeto Latino");
    inserimento = tastiera.readLine();
    //numeroSw = Integer.valueOf(inserimento);
    numeroSw = Integer.parseInt(inserimento);
    
}
catch(  IOException | NumberFormatException e)
{
    System.out.println("Errore");
}

switch(numeroSw)
    
{
   
    case 1:
        //Conversione latino-nuovo
        i = 0;
        int  j = 0;
        while(i<consIndex)
        {
            if(ins.get(i).equals(alf1.get(j)))
            {
                //
                System.out.println(alf2.size());
                //
                System.out.println(alf2.get(j)); 
                out.add(alf2.get(j));
                 i++;
            }
            else
            {
               
                j++;
               
            }
        }
        System.out.println(consIndex);
        //Stampa Conversione
        for(i = 0; i<consIndex; i++)
        {
            System.out.println(out.get(i));
            
          
        }
        
        
        
        
        
        
        
    break;
        case 2:
        break;
            default: System.out.println("Errore");
            break;
}


    
   
       
                                 
                                 

                        
                  
                  
                
           
              
        
    }
    
}
