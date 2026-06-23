
public class Array {
  
    

    // Averafe of array
static double getaverage(int[] arr){

    double sum = 0;

    for(int i:arr){
        sum+=i;
    }

    int size = arr.length;

    double avg = sum/size;

    return avg;

}


// Multiply by 10

static int[] multiplyby10(int[] arr){
    int size = arr.length;
    int newArray[] = new int[size];

    for(int i=0;i<size;i++){
        int element = arr[i];
        int newelement = element * 10;
        newArray[i]=newelement;
    }

    return newArray;

}



// Linear search

static boolean findtarget(int[] arr, int target){
    int size=arr.length;
    for(int i=0;i<size;i++){
        if(arr[i]==target){
            return true;
        }
    }

    return false;
}


static int maxelement(int[] arr){

    int max = arr[0];
    int size = arr.length;

    for(int i=0; i<size;i++){
        if(arr[i] > max){
            max=arr[i];
        }

    }

  return max;

}




// sum of positive and negative nos.

static int[] sumposneg(int[] arr){
    int possum = 0;
    int negsum = 0;

    for(int i=0;i<arr.length;i++){
        if(arr[i] > 0){
            possum+=arr[i];
        }
        else{
            negsum+=arr[i];
        }
    }


     int[] ans = {possum, negsum};
     return ans;
}




// No. of zero and one 

static int[] zeroone(int[] arr){
    int zerocount = 0;
    int onecount = 0;

    for(int i=0;i<arr.length;i++){
        if(arr[i] == 0){
            zerocount++;
        }
        else{
            onecount++;
        }
    }


     int[] ans = {zerocount, onecount};
     return ans;
}



// get unsorted element

static int unsortedelement(int[] arr){

    for(int i=0;i<arr.length;i++){
        if(arr[i+1] <= arr[i]){
           return arr[i+1];
        }
    }

    return -1;
}




// swapping of two adjacent elemnets

static void swapadjacent(int[] arr){

   for(int i=0;i<arr.length-1;i+=2){
    int temp = arr[i];
    arr[i] = arr[i+1];
    arr[i+1] = temp;
   }
}




// Print array ingersections elemmnts

static int[] intersection(int[] a, int[] b){
    
}














































public static void main(String[] args){

    // int[] arr = {2, 4, 1, 3};
    // double avg = getaverage(arr);
    // System.out.println(avg);


    // int[] arr = {1,2,3,4,5};
    // int[] ans = multiplyby10(arr);
    // System.out.println("New array: ");
    // for(int i:ans){
    //     System.out.print(i + " ");
    // }


    // int arr[] = {1,2,3,4,5};
    // System.out.print("Target is present : " + findtarget(arr, 7));



    // int arr[] = {10,20,50,100,950};
    // System.out.println("Max element: " + maxelement(arr));



    //  int arr[] = {1,-2,-5,9,4,-8,3,-7};
    //  int ansArr[] = sumposneg(arr);
    //  System.out.println("Positive sum: " + ansArr[0]);
    //  System.out.println("Negative sum: " + ansArr[1]);



    
    //  int arr[] = {0,1,0,1,0,1,1,1};
    //  int ansArr[] = zeroone(arr);
    //  System.out.println("Zero count: " + ansArr[0]);
    //  System.out.println("One count: " + ansArr[1]);


    // int arr[] = {1,2,5,4,9};
    // System.out.print("Unsorted element: " + unsortedelement(arr));


        int arr[] = {1,2,3,4,5,6};
        swapadjacent(arr);
        System.out.println("After swapping: ");
        for(int i:arr){
            System.out.print(i + " ");
        }

}








}



