public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("black");
        p1.setTip(5);
        System.out.println( p1.getColor());
        System.out.println(p1.getTip());
        p1.getTip();
        
    }

}
class Pen {
    private String color;
    private int tip;

    String getColor(){   // getter
        return  this.color;
    }

    int getTip (){
        return this.tip;
    }

    void setColor(String newColor) {
        this.color=newColor;;
    }

    void setTip(int tip) {
        this.tip=tip;
    }

    Pen() { 
        System.out.println("Constructor is called ");
    }

}