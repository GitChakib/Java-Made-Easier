class square{

    public float length;
    public square(float l){
        length = l;
    }
    public float surface(){
        return length*length;
    }
    public void display(){
        System.out.println("surface is: "+surface());
    }

}
class rectangle extends square{
    public float width;
    public rectangle(float lng, float wdt){
        super(lng);
        width = wdt;

    }
    public float surface(){
        return length*width;
    }
    public void display(){
        System.out.println("surface is: " +surface());
    }

}

class parallelepipede extends rectangle{
    private float depth;
    public parallelepipede(float lng, float wdt, float dp){
        super(lng, wdt);
        depth = dp;
    }
    public float volume(){
        return length*width*depth;
    }

    public void display(){
        super.display();
        System.out.println("volume is " +volume());
    }
}
class geometry{
    public static void main(String[] args){
        square c = new square(6);
        c.display();
        rectangle x = new rectangle (12, 30);
        x.display();
        parallelepipede y = new parallelepipede(11, 13, 15);
        y.display();
    }
}