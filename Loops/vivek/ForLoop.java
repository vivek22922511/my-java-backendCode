public class ForLoop {

  public static void main(String[] args) {

      //1...............
//        for(int i=0;i<=10;i++){
//            System.out.print(i);
//        }


      //2...................

for(int i=1;i<=5;i++){

    for(int j=1;j<=5;j++){
        System.out.print("* ");
    }
    System.out.println(" ");
}


     //3..................
//
//    int i=1;
//    while (i<=5){
//        int j=1;
//        while (j<=5){
//            System.out.print(" "+i+" "+j);
//            j++;
//        }
//        i++;
//    }
//      System.out.println("");



      //4.....................

      int i=1;
do {
    System.out.print(" "+i);
    i++;
}while (i<=10);

  }
}
