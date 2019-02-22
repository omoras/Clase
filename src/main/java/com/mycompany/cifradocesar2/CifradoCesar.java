/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cifradocesar2;

import java.util.Scanner;

/**
 *
 * @author orlan
 */
public class CifradoCesar {
    
    public CifradoCesar(){
        Scanner entrada =new Scanner(System.in);
        String datoEntrada;
        short codigo;
        char tipo;
        do{
            System.out.print("Introduce un texto: ");
            datoEntrada = entrada.nextLine();
        }while(datoEntrada.isEmpty());
        
        do{
            System.out.print("(c) cifrar o (d) descifrar?: ");
            tipo = entrada.next().charAt(0);
        }while(tipo != 'c' && tipo != 'd');
        
        do{
            System.out.print("Introduce el código: ");
            codigo = entrada.nextShort();
        }while(codigo == 0);
        if(tipo=='c'){
            System.out.println("Texto cifrado: " + cifradoCesar(datoEntrada, codigo));
        }else{
            System.out.println("Texto descifrado: " + descifradoCesar(datoEntrada, codigo));
        }
    }

    private String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }

    private String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
    }
}
