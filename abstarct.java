abstract class car{
    abstract void run();
}
class abstarct extends car{
    void run() { //overiding run

        System.out.println("hello : this is a swift car");
    }
    public static void main(String[] args) {
        abstarct o=new abstarct();
        o.run();

    }
}