Q : Given an unsorted array Arr of size N of positive integers. 
    One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.
  
Ans : 
    class Solve {
      int[] findTwoElement(int arr[], int n) {
          int j = 0;
          while(j < n){
              int correct = arr[j] - 1;
              if(arr[correct] != arr[j])
                  swap(j, correct, arr);
              else j++;
          }
          for(int i = 0; i < n; i++){
              if(arr[i] != i + 1){
                  return new int[]{arr[i], i + 1};
              }
          }
          return new int[]{-1, -1};
      }
      void swap(int i , int j, int[] arr){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
      }
}
