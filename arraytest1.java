 public class arraytest1{
 public static void main(String[] args){
        int arr [] = {3, 5, 1, 9};
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if( arr[i]> max)
            max = arr[i];

        }
    System.out.println(max);
}
}
class jjj{
    public static void main(String[] args){
        int arr [] = {7, 2, 10, 4};
        int min = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if( arr[i]<min)
            min = arr[i];

        }
    System.out.println(min);
}
}
class aaa{
    public static void main(String[] args){
        int marks[]={3,5,7,9};
        float avg, sum=0;
        int length = marks.length;
        for(int mark: marks){
            sum += mark;
             }
        avg = sum/length;
        System.out.println("The average mark is: "+ avg);
    }
}
 class oea{
    public static void main(String[]args){
        int arr[] ={2,3,4,5,6};
        int evencount = 0;
        int oddcount = 0;
        for(int num:arr){
            if(num % 2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            }
            System.out.println("Number of even numbers:"+ evencount); 
            System.out.println("Number of odd numbers:"+ oddcount); 
        }
        }
    class sl{
    public static void main(String[] args){
        int arr[] = {12, 35, 1, 10, 34};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i]>largest){
            secondLargest = largest;
            largest = arr[i];
        }
         
         else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
         }
    }
    
    System.out.println("second largest element :" + secondLargest);
    
}
}
 class even{
    public static void main (String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(i%2 ==0){
                sum += arr[i];
            }
        }
        System.out.println("sum of elements at even indices:" + sum);
    }
}
 class mt {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
  class sss{
    public static void main(String[] args){
        int arr [] ={3, 1, 4, 2};
        System.out.print("original array:  ");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
            
             int temp = 0;
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j]< arr[i]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;      
                }
            }
        }
        System.out.println("\n sorted array: ");
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i] + " ");
    }
}
class f {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5,3}; 
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;  
                    }
                }
                System.out.println(arr[i] + " -> " + count);
            }
        }
    }
}

 class ddd{
    public static  void main(String[] args){
        int arr[] = {1,2,2,3,4,4,5};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if( arr[i]==arr[j])
                {
                    System.out.println("Duplicate number:" +arr[i]);
                }
            }
        }
        
        System.out.println("No duplicates found");
    }
}
 
