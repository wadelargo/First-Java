// Author @java.worldc
class Cat{
    static int legs=4;
    Cat(string name, int age){
        System.out.print(name+age);
    }
    {
        System.out.print("-");
    }
    static{
        System.out.print(legs);
    }
}
class Example{
    public static void main(String args[]){
        Cat c1 = new Cat("Kitty", 1);
        Cat c2 = new Cat("Luna", 2);
    }
}