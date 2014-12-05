import java.util.Random;
public class MatrixSorter{
    public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
    findMin(mat3d)); 
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
    }

    public static int[][][] buildMat3d(){
 
        int array[][][] = new int[3][][];
        for(int y = 0; y<3; y++){
        array[y] = new int[3+2*y][];
        }
                for(int y = 0; y<3; y++){
                    for(int t = 0; t<3+2*y; t++){
        array[y][t] = new int[t+y+1];
        }
                }
        for(int x = 0; x<3; x++){
            for(int a = 0; a<3+2*x; a++){
                for(int b = 0; b<x+a+1; b++){
             array[x][a][b] = 1 + (int)(Math.random()*99);
        }
        }
        }
        
        return array;
        
    }
    
    public static void show(int[][][] array){
                for(int x = 0; x<3; x++){
                    System.out.println("----------------------- Slab " + (x+1));
            for(int a = 0; a<3+2*x; a++){
                for(int b = 0; b<x+a+1; b++){
            System.out.print(array[x][a][b] + " ");
        }
        System.out.println();
        }
        }
        System.out.println("-----------------");
        
    }
    public static int findMin(int[][][] array){
        int min = 100;
                for(int x = 0; x<3; x++){
            for(int a = 0; a<3+2*x; a++){
                for(int b = 0; b<x+a+1; b++){
             if(array[x][a][b] < min){
                min = array[x][a][b];
             }
        }
        }
        }
        
        return min;
    }
    public static void sort(int[][] array){
        int temp = 100;
                    
                                for(int x=0; x<5; x++){
            for(int a = 0; a<array[x].length-1; a++){
                for(int j = a+1; j<array[x].length; j++){
                if(array[x][a] < array[x][j]){
                    temp = array[x][a];
                    array[x][a] = array[x][j];
                    array[x][j] = temp;
                }
            }
        }
}
int sortArray[] = new int[array.length]; 
for(int t = 0; t<array.length; t++){
    
    sortArray[t] = array[t][0];  
    

}
int p;
int temporary;
int o;

        int n = sortArray.length;
        for (int j = 1; j < n; j++) {
            int key = sortArray[j];
            int i = j-1;
            while ( (i > -1) && ( sortArray[i] > key ) ) {
                sortArray[i+1] = sortArray[i];
                i--;
            }
            sortArray[i+1] = key;
            
        }
    
    

}
}