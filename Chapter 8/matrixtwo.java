//Tanner Clements 03-25-2019

import java.util.Scanner;

public class matrixtwo {
    public static void main(String[] args) {
      
        double a[][]={{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
        double b[][]={{0.0,2.0,4.0},{1.0,4.5,2.2},{1.1,4.3,5.2}};    

      double[][] prnt = addMatrix(a,b);  
    }

        public static double[][] addMatrix(double[][] a, double[][] b){
            
            double[][] c = new double[3][3]; 

            for(int i =0; i<3; i++){
                for(int j=0; j<3; j++){
                    c[i][j]= a[i][j]+b[i][j];
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }return c;
        } 
        
    }        
