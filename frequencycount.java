// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[]=new int[]{7,7,7,8,9};
        ques2(arr);
    }
    public static void ques1(int arr[]){
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        for(int num:arr1){
            System.out.println(num);
        }
        
    }
    public static void ques2(int arr[]){
        int visited=-1;
        int fr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]=visited;
                    
                }
            }
                
                
            
            if(fr[i]!=visited){
                fr[i]=count;
            }
        }
        for(int j:fr){
            System.out.println(j);
        }
     
       
        
        
    
    }
}
