import java.util.Scanner;

public class StringBasic {

    public static void main(String[] args) {
        //1..........................
//        String firstName="Vivek";
//        String lastName=new String("Rajput");
//        System.out.println(firstName+" "+lastName);
//        //System.out.println(firstName[0]);
//        System.out.println(firstName.length());
//        System.out.println(lastName.charAt(0));


        //2..String is immutable.....................

        String name="Ram";
        System.out.println(" before==>"+name);
       // name[0]='s';//it is not possible here....so
            name="shyam";//but it will create a new string
                         //it will not edit first string
        System.out.println(" after==>"+name);

        //3... difference b/w [==],[.equals],[.equalIgnoreCase]

         String name1="vivek";
         String name2="VIVEK";
         //name1==name2 it check the refrence poinjt same add in memory..
        //name1.equals(name2) it will the value  word to word ....
        //name1.equalsIgnoreCase(name2) it is case sencitive it will ignore small latter or captial latter..


//
//         if (name1.equalsIgnoreCase(name2)){
//             System.out.println("both  String are equal");
//         }else {
//             System.out.println("both String are not equal");
//         }

        //4........... user input by scanner class

//        Scanner sc= new Scanner(System.in);
//        System.out.println("provide the string content");
//
//               // String str=sc.nextLine(); //it will take whole santence as a string...
//        String str= sc.next();//it will take only first word of the sentence...
//        System.out.println("your string is ==>"+str);


            /*Question to practice....
            *1-->[.lenght()]
            *2-->[.charAt(int index)]
            *3-->[.substring(int beginindex,int endindex]
            *4-->[.equals(Object o)]
            *5-->[.equalsIgnoreCase(String s)]
            *6-->[.toUpperCase(String s)]
            *7-->[.toLowerCase(String s)]
            *8-->[.trim()]
            *9-->[.split(String regex)]
            *10-->.startWith(String prefix)]
            *11-->.endsWith(String suffix)]
            *12-->.valueOf(any type)]
            *13-->.toCharArray()]
            *14-->.isEmpty()]
            *15-->.isBlank()]
            *16-->.replace(char oldChar,Char newChar)
            * */


    }
}