package java_circulararray;


public class CircularArrayADT {
    
    public void print(char[] a, int ind, int n){
        
        
        char[] b = new char[(n*2)];
        
        //populating auxillary array with data of original array data for twice
        for(int i=0; i < n; i++ ){
            b[i]=b[n+i]=a[i];
        }
        
        
        
        //printing data from the given index to the index-1 postion.
        for(int i=ind; i < n+ind;i++){
            System.out.print(b[i]+" ");
        }
        
        
        
    }
    
    
}
