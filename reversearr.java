class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[]=new int[]{7,7,7,77,8,9,11,23,11,56,77,};
        String br[]={"hello","i", "am","jhon"};
        ques4(br);
    }
    public static void ques4(String arr[]){
        for(int i=arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }
    }
