
public class megeSort {
    
    public static void merge_sort(int arr[], int si, int endi){
        if(si >= endi){
            return;
         }

        
            int mid = si + (endi - si)/2;       //(si+endi)/2
            merge_sort(arr, si, mid);            // left part of array
            merge_sort(arr, mid+1, endi);        // right part of array
            merge(arr, si, mid ,endi);
        }

        public static void merge(int arr[], int si,int mid,int endi)
            {
                int i = si;     //iterration for left part
                int j = mid+1;  //iterration for right part
                int k = 0;      //iterration for temprory array
                int temp[] = new int[endi-si+1];

                while(i<=mid && j <= endi)
                    {
                        if(arr[i] < arr[j])
                            {
                            temp[k] = arr[i];
                                i++;
                            }

                            else{
                                temp[k]= arr[j];
                                j++;
                            }
                        k++;
                    }

                    while(i<=mid)           //left part
                        {
                            temp[k++] = arr[i++];
                            
                        }

                    while(j <= endi)        // right side
                     {
                        temp[k++] = arr[j++];
                     }    
            
                    for(k=0 , i = si; k < temp.length;  k++, i++) 
                     {
                        arr[i] = temp[k];
                    }                    
    }

    public static void printarr(int arr[]){
        for(int i = 0 ; i< arr.length ; i++)
            {
                System.out.print(arr[i]+" ");
            }
    }
    public static void main(String args[])
        {
            int arr[] = {3, 4, 2, 5,-2 };
            merge_sort(arr, 0 , arr.length-1);
            printarr(arr);
        }
}
