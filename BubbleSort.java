import java.util.*;

public class BubbleSort{

    public static void bubble(int arr[]){

        for(int turn =0 ; turn< arr.length-1; turn++){
            for(int j =0; j < arr.length-1; j++){
                int temp = 0;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String args[]){
    int arr[] = {5, 4, 1,3,2};
    bubble(arr);
}
}