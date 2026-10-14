package com.ConstructorPractice;

 //Important: This is not an infinite loop at runtime.
 // The program cannot compile, so it never starts running.



//class  Ptudent {
//
//     Ptudent() {
//        this(10);
//        System.out.println("A");
//    }
//
//     Ptudent(int x) {
//        this();
//        System.out.println("B");
//    }
//}
//
//public class CompilationError {
//    public static void main(String[] args) {
//         Ptudent s = new  Ptudent();
//    }
//}





//How to fix it.
  //     remove circular ctor call


class Ptudent {

    Ptudent() {
        this(10);
        System.out.println("A");
    }

    Ptudent(int x) {
        System.out.println("B");
    }

    
}

class CompilationError{
	public static void main(String[] args) {
        Ptudent s = new Ptudent();
    }
}






