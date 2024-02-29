 void fun(int arr[],int sum1,int n){
   for(int i=0;i<n;i++){
     int curr_sum=arr[i];
     if(curr_sum==sum1){
       sop("its a case");
       return;
     }
     else{
       for(j=i+1;j<n;j++){
         currsum=currsum+a[j];
         if(currsum==sum){
           sop("found");
           return
             }
       }
     }
   }
   slide window:
     1.  start=0;currsum=a[0]
     2. for(j=1 to n){ currsum=currsum+a[j] (for all cases)
                        1. currsum greater than sumgiven( currsum-start,start++) slide window
                        2. current sum equals sumgiven 
     
     
   
             
       
