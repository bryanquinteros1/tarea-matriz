
import java.util.Scanner;

  public class matricees {
    
    private static String[][] com = new String[5][6];
    private static int [][]  sumafila = new  int[5][6];
    private static int [][] sumacolumna = new  int[5][6];
    private static int [][] matriz = new  int[5][6];   
    private static  final int resultado = 4;
    private static  final int promedio = 5;
    private static final int totalg = 4;
    
    
    private static void PromedioCliente(){
        for (int i = 1; i < com.length-1; i++) {
          TotalyPromediosporCliente(i);  
        }
    
    }
    
    
    public static void TotalyPromediosporCliente(int fila){
        for (int i = 1; i < com.length; i++) {
            int total = 0;
            for (int j = 1; j < com.length-3; j++) {
                for (int k = 1; k < 4; k++) {
                sumafila[j][i]=Integer.parseInt(com[fila][k]);
                total+=sumafila[j][i];
                com[fila][resultado]=String.valueOf(total);
                com[fila][promedio]=String.valueOf(total/3);
                }
                
            }
            
        }    
    }
    
   
    private static void SumaTotal(){
        for (int i = 1; i < com.length-1; i++) {
            Total(i);  
        }
    
    }
    
    
    public static void Total(int columnas){
        for (int i = 1; i < com.length; i++) {
            int total=0,total2=0,total3=0;
            for (int j = 1; j < com.length-3; j++) {
                for (int k = 1; k < 4; k++) {   
                sumacolumna[j][i]=Integer.parseInt(com[k][columnas]);
                total+=sumacolumna[j][i];
                com[totalg][columnas]=String.valueOf(total);
                
                sumacolumna[j][i]=Integer.parseInt(com[k][resultado]);
                total2+=sumacolumna[j][i];
                com[totalg][resultado]=String.valueOf(total2);
                
                sumacolumna[j][i]=Integer.parseInt(com[k][promedio]);
                total3+=sumacolumna[j][i];
                com[totalg][promedio]=String.valueOf(total3);
                    
                }
            }
            
        }
        
    }
    
   
     public static void ImprimirMatriz(String[][] Matriz) {
        for (int x = 0; x < Matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < Matriz[x].length; y++) {
                System.out.print(Matriz[x][y]);
                if (y != Matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
   
  
     
        
    }
    
  

    
        
       