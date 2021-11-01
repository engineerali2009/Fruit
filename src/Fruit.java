public class Fruit {

    private int var;
   // int size=50;
    //no args  constructor
    public Fruit()
    {
       this.var = 10;
    }
    //parameterized constructor
    public Fruit(int num)
    {
        this.var = num;
    }
    public int getValue()
    {
        return var;
    }



    ///////////////
    static private int counter;
    static  int counter2;

    static public int getCounter() {return counter;}

    /////////
   public static int x=90;
    public static int y=90;

    String name;
    int age;
    int level;


// Main Method declaration
    public static void main(String[] args) {
        int number = Fruit .getCounter();

   // creating an object Mango from class fruit
  Fruit Mango = new Fruit();
  Fruit Apple = new Fruit();
  Fruit Strawberry = new Fruit(100);


        System.out.println("var is: "+Mango.getValue());
        System.out.println("var is: "+Apple.getValue());
        System.out.println("var is: "+Strawberry.getValue());



        System.out.println("x Before swap "+x);

        swap(x,y);
        //System.out.println(swap(x,y));

        System.out.println(x);
        System.out.println("x After swap "+x);



    }

    int sugar_percentage(int a,int grams){return a*grams*100;}

    int Fruit_Color(int a){return a;}

    int Fruit_Type(int type){return type;}

    ///// swap method declaration
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("These values printed from inside the method: "+a + ", " + b);

    }

}
