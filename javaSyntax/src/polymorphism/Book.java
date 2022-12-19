package polymorphism;

class Book {
    public String name;
    public String publisher;
    Book(){ // default 생성자
        this.name = "";
        this.publisher = "";
    }
    Book(String name, String publisher){
        this.name = name;
        this.publisher = publisher;
    }

    void print(){
        System.out.println("print : Book");
    }

    public static void main(String[] args) {
        //업캐스팅
        Book b = new Novel("메타버스 소설", "출판사(IT)");
        b.print();
        System.out.println("b.name = " + b.name);
        System.out.println("b.publisher = " + b.publisher);

        System.out.println();

        Book c = new SF("메타버스","SF출판사");
        c.print();
        System.out.println("c.name = " + c.name);
        System.out.println("c.publisher = " + c.publisher);
    }
}
