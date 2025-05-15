package LambdaExpression;

public class FirstExample {
    public static void main(String[] args) {
        System.out.println("My Stream Starts");

//        myInterImpl impl=new myInterImpl();
//        impl.sayHello();

//        readyinterface red=new readyinterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("implementing functional interface using interface object");
//            }
//        };
//    red.sayHello();
//
//    readyinterface red2= new readyinterface() {
//        @Override
//        public void sayHello() {
//            System.out.println("This is my anonymous Class ");
//        }
//    };
//    red2.sayHello();

        //using out interface with the help of Lambda.

//        readyinterface i= ()->{
//            System.out.println("this is my my lambda example");
//        };
//        i.sayHello();
//
//        readyinterface i2=()-> System.out.println("this is second lamada example");
//        i2.sayHello();
//
//        SumInter suminter=(int a ,int b)->{
//            return a+b;
//        };
//
//        System.out.println(suminter.sum(5,6));
//        System.out.println(suminter.sum(7,9));

//
        LengthInter length=(r)->r.length();

        System.out.println(length.getLength("Sourav"));
        System.out.println(length.getLength("Today I am learning about java 8 features"));
    }




}
