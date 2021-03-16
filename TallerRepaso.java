/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrepaso;

import static java.lang.System.exit;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTIAGO CUERVO
 */
public class TallerRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public static void Ejercicio1()
    {
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        int num1,num2,sum,rest,res;
        System.out.println("Digite numero 1");
        num1 = n1.nextInt();
        System.out.println("Digite numero 2");
        num2 = n2.nextInt();
        sum = num1 + num2;
        rest = num1 - num2;
        res = num1 % num2;
        System.out.println("Suma = "+ sum);
        System.out.println("Resta = "+ rest);
        System.out.println("Residuo = "+ res);
    }
    public static void Ejercicio2()
    {
        Scanner lsv = new Scanner(System.in);
        String serVivo;
        System.out.println("Escriba el nombre de un ser vivo");
        serVivo = lsv.next();
        
        
        if(serVivo.equalsIgnoreCase("ornitorrinco"))
        {
            System.out.println("Pertenece al Reino Animal");
        }else
        {
            if(serVivo.equalsIgnoreCase("roble"))
            {
             System.out.println("Pertenece al Reino Vegetal");
            } else
            {
                if(serVivo.equalsIgnoreCase("champiñon"))
                {
                    System.out.println("Pertenece al Reino Fungi");
                }else
                {
                    if(serVivo.equalsIgnoreCase("amebas"))
                    {
                        System.out.println("Pertenece al Reino Protista");
                    }else
                    {
                       if(serVivo.equalsIgnoreCase("bacilos"))
                        {
                            System.out.println("Pertenece al Reino Monera");
                        } else
                       {
                           System.out.println("----------------Error Extremadamente prohibido------------");
                       }
                    }
                }
            }
        }            
    }
    public static void Ejercicio3() {
        int numN = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero entre el 1 y 7"));
        switch(numN)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Nota musical = Do");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Nota musical = Re");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Nota musical = Mi");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Nota musical = Fa");
                break;  
            case 5:
                JOptionPane.showMessageDialog(null, "Nota musical = Sol");
                break;    
            case 6:
                JOptionPane.showMessageDialog(null, "Nota musical = La");
                break;  
            case 7:
                JOptionPane.showMessageDialog(null, "Nota musical = Si");
                break;    
            default:
                JOptionPane.showMessageDialog(null,"Error, no está dentro del rango" );
        }
    }
    public static void Ejercicio4() {
        int i;
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero para rango"));
        for(i = 0; i <= num; i++)
        {
            JOptionPane.showMessageDialog(null, i);
        }
        
    }
    
    public static void Ejercicio5()
    {
        int i;
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero para rango"));
        for(i = 0; i <= num; i = i + 3)
        {
            JOptionPane.showMessageDialog(null, i);
        }
    }
    public static void Ejercicio6()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero para saber si es par o impar"));
        if(num % 2 == 0)
        {
            JOptionPane.showMessageDialog(null,"Es un numero par");
        }else
        {
            JOptionPane.showMessageDialog(null, "Es un numero Impar");
        }
    }
    public static void Ejercicio7()
    {
        int rango = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un rango - Serie Fibonacci"));
        int numSig = 0,valInicial1=0,valInicial2=1;
        while(numSig < rango)
        {
            JOptionPane.showMessageDialog(null, numSig);
            valInicial1 = valInicial2;
            valInicial2 = numSig;
            numSig = valInicial1 + valInicial2;            
        }
    }
    public static void Ejercicio8()
    {
        int Cont = 17,intentos,num,i=0;
        for(intentos = 0; intentos < 3; intentos++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la Contraseña"));
            if(num == Cont)
            {
                JOptionPane.showMessageDialog(null, "Acceso Permitido");
                break;
            }else
            {
                JOptionPane.showMessageDialog(null,"Acceso Denegado");
                i = i + 1;
            }
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null,"La clave ha sido bloqueada");
        }
    }
    public static void Ejercicio9()
    {
        int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite cantidad de notas a promediar (Notas entre 1.0 y 5.0)"));
        int i;
        double promedio, notas, acum = 0;
        for(i = 1; i <= cant; i++)
        {
            notas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite nota "+ i));
            acum = acum + notas;
        }
        promedio = acum/cant;
        
        if(promedio >= 3.0)
        {
            JOptionPane.showMessageDialog(null, "Felicidades...Aprobó, Promedio = "+promedio);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ups...Reprobado, Promedio = " + promedio);
        }
    }
    public static double Ejercicio10(double ca,double co)
    {
        double h;
        h = Math.sqrt(Math.pow(ca, 2) + Math.pow(co, 2));
        return(h);
    }
}
