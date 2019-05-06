
package javaapp;
//biblioteca con la opcion de JOptionPane
import javax.swing.*;

public class Javaapp {

    /**
     * @param args the command line arguments
     */
        //clase principal o index
    public static void main(String[] args) {
        //opcion de menu
       int opcion;
        //menu en cadena de caracteres
        String menu="***MENU***\n elija el ejercicio que desea hacer\n1. Sumar\n2. restar\n3. multiplicar \n4.dividir \n5. lado de cuadrado \n6.estaturas \n7.base y altura de triangulo \n8. salir\n Digite una opcion";
//ejecutable menu
do {
opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
switch(opcion){
    case 1:sumar();
    break;

    case 2: restar();
    break;

    case 3: multiplicar();
    break;

    case 4: dividir();
    break;
    
    case 5: cuadrado();
    break;
    
    case 6: estaturas() ;
    break;
    
    case 7: triangulo();
    break;
    
    case 8: System.exit(0);
    break;
    //Opcion default si el usuario ingresa otro numero diferente del caso
    default: JOptionPane.showMessageDialog(null,"opcion no es valida");
}
}
    //Condicion mientras que la opcion sea diferente de
    while(opcion!=8);
}
    //fase de operaciones en clases publicas
    public static void sumar(){
        double num1,num2,res;
        num1= Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 1"));
        num2= Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 2"));
        res=num1+num2;
        JOptionPane.showMessageDialog(null,num1+" + "+num2+" = "+res);
    }
    public static void restar(){
        double num1,num2,res;
        num1= Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 1"));
        num2= Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 2"));
        res=num1-num2;
        JOptionPane.showMessageDialog(null,num1+" - "+num2+" = "+res);
}
    public static void multiplicar(){
        double num1,num2,res;
        num1= Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 1"));
        num2= Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 2"));
        res=num1*num2;
        JOptionPane.showMessageDialog(null,num1+" * "+num2+" = "+res);
}
    public static void dividir(){
        double num1,num2,res;
        num1= Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 1"));
        num2= Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 2"));
        if(num2==0){
            JOptionPane.showMessageDialog(null,"No es posible dividir por cero");
        }else{
            res=num1/num2;
            JOptionPane.showMessageDialog(null,num1+" - "+num2+" = "+res);
        }
}
    public static void cuadrado(){
        double lado,per,area;
        lado = Double.parseDouble(JOptionPane.showInputDialog("ingrese el lado del cuadrado"));
        per=4*lado;
        area=Math.pow(lado,2);
        JOptionPane.showMessageDialog(null,"el lado del cuadrado es "+lado);
        JOptionPane.showMessageDialog(null,"el perimetro del cuadrado es "+ per);
        JOptionPane.showMessageDialog(null,"el area del cuadrado es "+area);
    }
    public static void estaturas(){
        double est1,est2,est3,prom;
        est1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura de la persona 1"));
        est2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura de la persona 2"));
        est3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura de la persona 3"));
        prom=(est1+est2+est3)/3;
        JOptionPane.showMessageDialog(null,"el promedio de las estaturas es "+prom);
    }
    public static void triangulo(){
        double b,h,area;
        b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base de el triangulo"));
        h=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
        area=0.5*(b*h);
        JOptionPane.showMessageDialog(null,"El area del triangulo es "+area);
    }
}

