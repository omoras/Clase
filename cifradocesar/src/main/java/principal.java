/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c-les
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] abecedario = new char [26];
        int b=0;
        for (char a='a'; a<='z';a++){
            abecedario[b]=a;
            b++;
        }
        
        String texto="los dias de la semana";
        String textosinespacios= texto.replaceAll(" ", "");
        char [] s = textosinespacios.toCharArray();
        int clave=5;
        int j=0;
        
        for (int i=0;i<=s.length;i++){
            /*for (int x=0;x<=abecedario.length;x++){
                if (abecedario[x]==s[i]){
                    System.out.print(abecedario[j]);
                }
            }
            /*
            while (abecedario[j]!=s[i]){
                j++; 
            }*/
            System.out.print(s[i]);
        }
    }
    
}
