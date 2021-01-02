package java_circulararray;


public class CircularArrayADT {
    
    public void print(char[] a, int ind, int n){
        
        
        char[] b = new char[(n*2)];
        
        for(int i=0; i < n; i++ ){
            b[i]=b[n+i]=a[i];
        }
        
        
        for(int i=ind; i < n+ind;i++){
            System.out.println(b[i]+" ");
        }
        
        
        
    }
    
    
}
