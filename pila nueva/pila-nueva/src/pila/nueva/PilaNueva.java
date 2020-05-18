package pila.nueva;

import java.util.Random;
import java.util.Scanner;


public class PilaNueva {

    private static int i;

    
    public static void main(String[] args) {
      Scanner lector=new Scanner(System.in);
         System.out.println("vienvenido a la pila de xlobox3 \n");
      int opcion, tam, cont=0,aux;
       int lista1,lista2,lista3;
      
      System.out.println("digite el tamaño de la pilaA: ");
      lista1=lector.nextInt();
      System.out.println("digite el tamaño de la pilaB: ");
      lista2=lector.nextInt();
      
          
      int pilaA[]= new int [lista1];
      int pilaB[]= new int [lista2];
      int pilaC[]= new int [lista1+lista2];
      
      
      do{
          
          System.out.println("1-llenar");
          System.out.println("2-digitar pilaC ");
          System.out.println("3-mostrar pilas ");
          System.out.println("4-vaciar ");
          System.out.println("5-ordenar");
          System.out.println("6-salir");
          opcion = lector.nextInt();
          
          
          switch (opcion){
              
              case 1:
               
                     System.out.print("llenar pilaA:\n ");
             for(int i=0; i<lista1; i++){
                 pilaA[i]=(int)(Math.random()*200+1);
                 System.out.println(""+pilaA[i]);
             }
             System.out.print("llenar pilaB:\n ");
             for(int i=0; i<lista2; i++){
                 pilaB[i]=(int)(Math.random()*200+1);
                 System.out.println(""+pilaB[i]);
             }
                  break;
                  
              case 2:
                  for(int i=0; i<lista1;i++){
                      pilaC[i]=pilaA[i];
                  }
              int l=0;
              for(int i=lista1; i<pilaC.length; i++){
                  pilaC[i]=pilaB[l];
                  l++;
              }
              cont=1;
              System.out.println("valores de pilaC");
              
   
          break;
          case 3:
           System.out.println("Los datos son: "); 
           System.out.print("pilaA:\n ");
                    for(int i=0; i<lista1; i++){
                        System.out.println(" "+pilaA[i]);
                    }
                    System.out.print("pilaB:\n ");
                    for(int i=0; i<lista2; i++){
                        System.out.println(" "+pilaB[i]);
                    }
                    
                    if(cont==1){
                        for(int i=0; i<pilaC.length; i++){
                        System.out.println("pilaC: "+pilaC[i]);
                     }
                    }
                    if(cont==2){
                        for(int i=0; i<pilaC.length; i++){
                        System.out.println("pilaC: "+pilaC[i]);
                     }
                    }
                    break;
              case 4:
                  lista1=0;
                  lista2=0;
                  cont=0;
                  System.out.println("pila vacia");
                  
                    break;
              case 5:
                      
                  for(int i=0; i<pilaC.length-1; i++){
                      for(int j=0;j<pilaC.length-1; j++){
                          if(pilaC[j]>pilaC[j+1]){
                              aux=pilaC[j];
                              pilaC[j]=pilaC[j+1];
                              pilaC[j+1]=aux;
                          }
                      }
                  }System.out.println("valores ordenados");
                  cont=2;
                   break;
              default:
                  System.out.println("escoja la opcion que ve no se la invente");
          }}while(opcion!=6);
    }
    
}
