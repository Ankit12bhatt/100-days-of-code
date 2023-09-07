public class mergsortedarray {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
            int arr[]={1 , 2, 3, 7};
        int arr2[]={0 , 5, 7, 8, 11};
        int size=arr.length+arr2.length;
         int arr3[]=new int[size];
         int i = 0 ; 
         int j = 0 ;
         int index = 0;
         while(i< arr.length && j < arr2.length){
             if(arr[i] < arr2[j]){
                 arr3[index] = arr[i];
                 i++;
             }else{
                 arr3[index] = arr2[j];
                 j++;
             }
             index++;
         }
         
         while(i< arr.length && index < arr3.length){
             arr3[index] = arr[i];
             i++;
             index++;
         }
          while(j< arr2.length && index < arr3.length){
             arr3[index] = arr2[j];
             j++;
             index++;
         }
         
         for(int k = 0 ; k< arr3.length ; k++){
             System.out.println(arr3[k]);
         }
        }
    }
