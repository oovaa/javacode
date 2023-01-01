class thisTest{
    public static void main(String[] args) {
        man m = new man(19, "omer");
        m.meth();
    }
 
}
class man{
    int age;
    String name;
    man(int age,String name){
this.age = age;
this.name = name;

    }
    void meth(){
        System.out.println(this.name);

    }
}
