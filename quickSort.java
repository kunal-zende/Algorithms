public class quickSort {
    
    public static void quick_Sort(int arr[], int si, int endi){
        if(si >= endi){
            return;
        }

        int piIndex = partition(arr, si, endi);    //piIndex = pivote index
        quick_Sort(arr, si, piIndex-1);         //left side recursion 
        quick_Sort(arr, piIndex+1, endi);       //right side recursion 

    }

    public static int partition(int arr[], int si, int endi){
        
        int pivot = arr[endi];
        int i = si-1;               // to make space for elements less thsn pivot

        for(int j = si; j< endi; j++){
            if(arr[j] <= pivot){               //swapping small amd large 
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;                              // set pivot value
        int temp = pivot;
        arr[endi] = arr[i];
        arr[i] = temp;
        return i;                   // pivot index

    }

    public static void printArr(int arr[]){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,3, 7, 2, 4, 5};
        quick_Sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
