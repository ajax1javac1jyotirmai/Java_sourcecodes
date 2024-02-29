 public static String ques44(String str1){
        return new StringBuilder(str1).reverse().toString();
        
        
    }

 public static void ques44(String str1){
        String res="";
        for(int i=str1.length()-1;i>0;i--){
            res=res+str1.charAt(i);
            
            
           //System.out.println(str1[i]);  # will give error expected array
        }
        System.out.println(res);
       // return new StringBuilder(str1).reverse().toString();
        
        
    }
 public static void quess(String str3){
        char[] ch1=str3.toCharArray(str3);
        String res='';
        for(int i=ch1.length-1;i>0;i--){
            res=res+ch1[i];
            
        }
    }
