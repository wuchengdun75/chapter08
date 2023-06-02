package interface03;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();//ok
        System.out.println(b.a);  //23
        System.out.println(A.a);  //23
        System.out.println(B.a);  //23
    }
}

interface A {
    int a = 23; //隐藏了 public static final ，必须赋值
}

class B implements A {//正确
}
