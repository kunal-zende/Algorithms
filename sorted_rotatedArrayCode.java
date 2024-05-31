// when we have sorted array but it is now rotated on pivot element 
//then we can use this modified binary seach approach to search element with less time complexity

//IT IS MODIFIED BINARY SEARCH

public class sorted_rotatedArrayCode
 {

    public static int searching(int arr[] , int target,int si,int endi){
       if(si > endi){
        return -1;
       }

        int mid = si + (endi - si)/2;

       //case found
        if(arr[mid]== target ){
            return mid;
        }

        //on line 1 
        if(arr[si] <= arr[mid]){
            
            // case a: target on left of line
            if(arr[si] <= target && target<= arr[mid]){
                return searching(arr, target, si, mid-1);
            }else{
            // case b: target on right of line
            return searching(arr, target, mid+1, endi);
            }
        } 

        //on  2nd line
         else{
            // case c:  target on right of line
            if(arr[mid] <= target && target < arr[endi]){
              return  searching(arr, target, mid+1, endi);
            } //case d: target on left of line
            else{
                return searching(arr, target, si, mid-1);

            }

         }
            
    }

    public static void main(String args[]){
        int arr[] = {3, 5, 7, 0, 1, 2};
        int target = 3;
        int tarIndx = searching(arr, target, 0,arr.length-1);
        System.out.println(tarIndx);
    }
}
