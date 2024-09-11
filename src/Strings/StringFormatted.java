package JavaTutorials;

class Base{
    Base(){
        System.out.println("I am Base class constructors");
    }
    Base(int x){
        System.out.println("I am Base class constructors with value of a is"+x);
    }


}
class Derived extends Base{
    Derived(){
        System.out.println("I am Derived class constructors");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("I am Derived class constructors with value of y is"+y);
    }
}

class ClassDerived extends Derived{
    ClassDerived(){
        System.out.println("I am ClassDerived class constructors");
    }
    ClassDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am ClassDerived class constructors with value of z is"+z);
    }
}
class Main{
    public static void main(String[] args) {
//        Base b1=new Base();
////     Derived b1=new Derived();
////        ClassDerived b1=new ClassDerived();

//        Base b1=new Base(2);
//        Derived b1=new Derived(3,4);
        ClassDerived b1=new ClassDerived(12,34,56);


    }
}

