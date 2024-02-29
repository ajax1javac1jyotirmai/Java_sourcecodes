import java.util.Arrays;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[]=new int[]{1,4,20,3,10,5};
        int brr[]=new int[]{7,8,9};
        HashSet<Integer> h1=new HashSet<>();
        for(int i:arr){
            h1.add(i);
        }
        for(int j:brr){
            h1.add(j);
            
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i:h1){
            arr1.add(i);
        }
        for(int i:arr1){
            System.out.println(i);
        }
    }
      
     
}


import java.util.Arrays;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[]=new int[]{1,4,20,3,10,5};
        int brr[]=new int[]{7,8,9};
        int res[]=new int[arr.length+brr.length];
        int i=0;
        Arrays.sort(arr);
        Arrays.sort(brr);
        int l_a=arr.length;
        int l_b=brr.length;
        int start1=0;
        int start2=0;
        while(start1<l_a && start2<l_b){
            if(arr[start1]<=brr[start2]){
                res[i]=arr[start1];
                i++;
                start1++;
                
            }
            else{
                res[i]=arr[start2];
                i++;
                start2++;
                
            }
        }
        if(start1>=l_a && start2<l_b){
            while(start2<l_a){
                res[i]=arr[start2];
                i++;
                start2++;
            }
        }
         if(start1<l_b && start2>=l_a){
            while(start1<l_b){
                res[i]=arr[start1];
                i++;
                start1++;
            }
        }
        for(int ii:res){
            System.out.println(i);
        }
    }
     
}


 static int printUnion(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
 
        /* Print remaining elements of 
         the larger array */
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");
 
        return 0;
    }
 
