public class CWH_17_logical {

    public static void main(String[] args) {

//        Logical Operators

        // Logical AND Operator

//        // Here one Condition is False that's why printed false
//        boolean a = true;
//        boolean b = false;
//
//        if(a && b){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }

//        // Here both Conditions are False then also it will print No because && conditions satisfies when
//        // Both the conditions for && logical Operator should be true
//        boolean a = false;
//        boolean b = false;
//
//        if(a && b){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }

        // Here both Conditions are true now it will properly print Yes and condition will satisfy
        boolean a = true;
        boolean b = true;
        //Also && Associativity is Left to Right

        if(a && b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // Logical OR Operator

//                // Here one Condition is true that's why printed true
//        boolean a1 = true;
//        boolean b1 = false;
//
//        if(a1 || b1){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }


//        //Here both Conditions are False then also it will print No because || conditions satisfies when
//        //one of the conditions for || logical Operator should be true
//        boolean a1 = false;
//        boolean b1 = false;
//
//        if(a1 || b1){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }

        // Here both Conditions are true now it will properly print Yes and condition will satisfy
        boolean a1 = true;
        boolean b1 = true;
        //Also || Associativity is Left to Right

        if(a1 || b1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // Logical NOT Operator
        System.out.print("Not(a) is ");// It will make true to false and false to true
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);

    }


}
