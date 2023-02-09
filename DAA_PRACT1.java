// / ************* Algorithm***********

/*
BinarySearch(arr, x, low, high)
Step 1: Repeat Step 2 till low = high
Step 2: mid = (low + high)/2
if (x == arr[mid])
return mid
else if (x > arr[mid])
low = mid + 1
else
high = mid – 1

Step 3: Exit
*/


// **************C language Code**************
/* 
 #include <stdio.h>
int iterativeBinarySearch(int array[], int start_index, int
end_index, int element)
{
while (start_index <= end_index){
int middle = start_index + (end_index- start_index )/2;
if (array[middle] == element)
return middle;
if (array[middle] < element)
start_index = middle + 1;
else
end_index = middle - 1;
}
return -1;
}

int main(void){
int array[] = {1, 4, 7, 9, 16, 56, 70};
int n = 7;
int element = 1;
int found_index = iterativeBinarySearch(array, 0, n-1, element);
if(found_index == -1 ) {
printf("Element not found in the array ");
}
else {
printf("Element found at index : %d",found_index);
}
return 0;
}
 
*/






// ************java Code**************8//

public class DAA_PRACT1 {
    public static int BinarySearch(int arr[], int key){
        int start =0; int end = arr.length-1;

        while (start <= end) {
            int mid =  (int)start+(end-start)/2;;
            
            //comparison
            if (arr[mid]==key) {//key found
                return mid;
                }
            if (arr[mid]<key) {//right side
                    start = mid+1;
                }
            else{               //left side
                end= mid-1;
                }
        }   return -1;
    }  

   
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,80,99};
        int key = 5;

        int result = BinarySearch(arr, key);
        if (result== -1) {
            System.out.println("Nahi  Bhetla");
        } else {
            System.out.println("Bhetla at "+ result);
        }
        
    }
}
