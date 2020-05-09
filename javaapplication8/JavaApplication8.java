package javaapplication8;

import java.util.Scanner;
import java.util.Random;

public class JavaApplication8 {

    
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.println("vienvenido a la pila de xlobox3");
      int opcion, tam, cont=0,aux;
       
      
      System.out.println("digite el tamaño de la pila: ");
      tam=lector.nextInt();
      
      int lista[]= new int [tam];
      int lista1[]= new int [tam];
      int lista2[]=new int[tam];
      int lista3[]=new int[tam];
      do{
          System.out.println("1-llenar");
          System.out.println("2-digite pilas ");
          System.out.println("3-mostrar: ");
          System.out.println("4-eliminar ");
          System.out.println("5-ordenar");
          System.out.println("6-salir");
          opcion = lector.nextInt();
          
          
          switch (opcion){
              
              case 1:
               
                     System.out.print("llenar pilaA:\n ");
                   for(int i=0;i<tam;i++){
         lista1[i]=(int)(Math.random()*-200+(200)+1);
        
                  System.out.println(" "+lista1[i]);
                  }
                 System.out.print("llenar pilaB:\n ");
                 for(int i=0;i<tam;i++){
         lista2[i]=200+(int)(Math.random()*(-200)+1);
         
                  System.out.println(" "+lista2[i]);
                 }
         System.out.print("llenar pilaC:\n ");
         for(int i=0;i<tam;i++){
         lista3[i]=200+(int)(Math.random()*(-200));
         
                  System.out.println(" "+lista3[i]);
         }
                  break;
                  
              case 2:
                  if(cont<tam){
              int i;
                for(i=0;i<tam;i++){
                  System.out.println("digite pilaA: ");
                  lista[cont]=lector.next().charAt(0);
                               
                }
                for(i=0;i<tam;i++){
                  System.out.println("digite pilaB: ");
                  lista[cont]=lector.next().charAt(0);
                  
                }   
                for(i=0;i<tam;i++){
                  System.out.println("digite pilaC: ");
                  lista[cont]=lector.next().charAt(0);
                 
                }
              }else{
                  System.out.println("pila llena");
              }
   
          break;
              case 3:
           System.out.println("Los datos son: ");                 
                    if (tam > 0) {
                        
                          System.out.println("\npilaA: ");
                        for(int i = 0; i < tam; i++) {
                          
                            System.out.println(" " +lista1[i]);
                        }
                     System.out.println("\npilaB: ");
                    for (int i = 0; i < tam; i++) {
                         
                            System.out.println(" "+ lista2[i]);
                        }
                    System.out.println("\npilaC: ");
                    for (int i = 0; i < tam; i++) {
                          
                            System.out.println(" "+ lista3[i]);
          }
                    }else {
                        System.out.println("la pila esta vacia ");
                    }
                    break;
              case 4:
                  
                  if (tam> 0) {
                       System.out.println("dato elmininado");
                        tam--;  
                                             
                    } else {
                        System.out.println("Ya no hay datos para eliminar");
                    }
                    break;
              case 5:
                  if(tam>0){
                  for(int j=0;j<tam;j++){
                      for(int i=0;i<tam-1;i++){
                          if(lista1[i]>lista1[i+1]){
                              aux=lista1[i];
                              lista1[i]=lista1[i+1];
                              lista1[i+1]=aux;
                          }
                      }
                  }for(int j=0;j<tam;j++){
                      for(int i=0;i<tam-1;i++){
                          if(lista2[i]>lista2[i+1]){
                              aux=lista2[i];
                              lista2[i]=lista2[i+1];
                              lista2[i+1]=aux;
                          }
                      }
                  }for(int j=0;j<tam;j++){
                      for(int i=0;i<tam-1;i++){
                          if(lista3[i]>lista3[i+1]){
                              aux=lista3[i];
                              lista3[i]=lista3[i+1];
                              lista3[i+1]=aux;
                          }
                      }
                  }System.out.println("numeros ordenados de menor a mayor");
                  }else{
                      System.out.println("no hay elementos para ordenar");
                      
                  }                
                   break;
              case 6:
                  break;
              default:
                  
                  System.out.println("escoja la opcion que ve no se la invente");
          }}while(opcion!=6);
    }
    
}
