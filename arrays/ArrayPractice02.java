import java.util.Scanner;

public class ArrayPractice02 {
    public static void main(String[] args) {

        //1.....print an array................

//        int arr[]={1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//        }

        //2.....enter the value in array..........

//        int arr[]=new int[5];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value in array...");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }
//        //here i am printing the array......
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" "+arr[i]);
//        }

//        //3........find the max value .....................
//
//        int arr[]={1,22,33,41,5,6,7,8,9};
//
//        int max=arr[0];
//        for (int i = 0; i <arr.length ; i++) {
//
//            if (max<arr[i]){
//
//                max=arr[i];
//            }
//        }
//        System.out.println(max);



      //4........find the max value .....................

//        int arr[]={11,22,33,41,5,6,7,8,9};
//
//        int min=arr[0];
//        for (int i = 0; i <arr.length ; i++) {
//
//            if (min>arr[i]){
//
//                min=arr[i];
//            }
//        }
//        System.out.println(min);

        //5......... the sum of array's value.................

//        int arr[]={2,1,4,6,4,7,5};
//        int n=arr.length;
//         int sum=0;
//        for (int i = 0; i <n; i++) {
//            sum=sum+arr[i];
//        }
//
//        System.out.println(sum);

        //6........multiply of the values...............

//        int arr[]={2,1,4,6};
//
//        int n=arr.length;
//        int multiply=1;
//
//        for (int i=0;i<n;i++){
//            multiply=multiply*arr[i];
//        }
//
//        System.out.println(multiply);


        //7........Reverse an array.........

//        int arr[]={1,2,3,4,5};
//        int reverse;
//        int n=arr.length;
//        for (int i = n-1; i >=0; i--) {
//
//            reverse=arr[i];
//            System.out.println(reverse);
//
//        }



        //8.......Search an element in array..................

//        int arr[]={1,12,14,16,114,227,335};
//        int search=14;
//        int index=-1;
//
//        int n=arr.length;
//
//        for (int i=0;i<n;i++){
//
//            if (arr[i]==search){
//                index=i;
//                break;
//            }
//
//        }
//        if (index !=-1){
//            System.out.println("Element found at index "+index);
//        }else {
//            System.out.println("Element not found..");
//        }
//



        //9....Count even and odd numbers............................

//        int[] arr = {11, 20, 33, 44, 55, 66};
//
//            int odd=0;
//            int even=0;
//            int n=arr.length;
//
//        for (int i = 0; i < n; i++) {
//                int d=arr[i];
//            if (d%2==0){
//                even=even+1;
//            }else {
//                odd=odd+1;
//            }
//
//        }
//        System.out.println("even numbers =" +even+ " odd numbers =" +odd);


        //10.............Sort an array in ascending order................

//            int arr[]={9,7,4,6,41,1,2,3};
//                 int n=arr.length;
//            for (int i=0;i< n;i++){
//                for(int j=i+1;j<n;j++){
//
//                    if (arr[j]<arr[i]){
//
//                        int temp=arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=temp;
//                    }
//                }
//
//
//            }
//
//    for (int i=0;i<n;i++){
//    System.out.println(arr[i]);
//}


        //11................Find duplicate elements................................


//        int[] arr = {10, 20, 30, 20, 40, 10};
//
//        int n=arr.length;
//        for (int i=0;i<n;i++){
//
//            boolean alreadyPrinted=false;
//            for (int j=0;j<i;j++){
//
//                if (arr[j]==arr[i]){
//                    alreadyPrinted=true;
//                    break;
//                }
//            }
//            if (alreadyPrinted){
//                continue;
//            }
//
//            for (int k=i+1;k<n;k++){
//                if(arr[i]==arr[k]){
//                    System.out.println("Duplicate:"+arr[i]);
//                    break;
//                }
//            }
//        }


        //12................Check  two arrays are equal or not.........................


//        int[] a = {10, 20, 30};
//        int[] b = {10, 20, 30};
//
//        boolean equal=true;
//
//        if (a.length!=b.length){
//            equal=false;
//        }else {
//            for (int i=0;i<a.length;i++){
//                if (a[i]!=b[i]){
//                    equal=false;
//                    break;
//                }
//            }
//        }
//
//        if (equal){
//            System.out.println("Arrays are equal:::");
//        }else{
//            System.out.println("Arrays are not equal:::");
//        }
//
//


        //13................Move all zeros to the end......................


        int[] arr = {0, 10, 0, 20, 30, 0, 40};

        int index=0;

        for (int i=0;i<arr.length;i++){

            if (arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while (index< arr.length){
            arr[index]=0;
            index++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

    }


}