// 1. remove duplicates if there 
// 2. if both have same no store

 public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
 
        // Removing duplicates from the first array
        for (int num : arr1) {
            set.add(num);
        }
 
        ArrayList<Integer> result = new ArrayList<>();
 
        // Avoiding duplicates and adding intersections
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }
 
        return result;
    }

//use two pointer
// if start> end or start<end ::: 
// startz==end :prinnt
  
