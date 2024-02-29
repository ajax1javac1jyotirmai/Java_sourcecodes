// 4) Java Program to print the duplicate elements of an array
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[]=new int[]{7,7,7,77,8,9,11,23,11,56,77,};
        ques3(arr);
    }
    public static void ques3(int arr[]){
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
                
           
            }
        }
       
    }
}

  
