abstract class ball{
    private int texture;
    private float volume;
    private String material;

    public ball(String m, int t, float v){

        material = m;
        texture = t;
        volume  = v;
    }
    public abstract void displayball();

    public int getTexture(){
        return texture;
    }
    public float getVolume(){
        return volume;
    }
    public String getMaterial(){
        return material;
    }


}
class basketball extends ball{

    private String pattern;
    public basketball (String m, int t, float v, String p){

        super(m,t,v);
        pattern  = p;

    }
    public void displayball(){

        System.out.println("the material is: "+getMaterial()+ "the texture is code: "+getTexture()+ "the volume is: "+getVolume()+ "the pattern is: "+pattern);
        
    }
}

public class abstraction{

    public static void main(String[] args) {
        basketball x = new basketball("plastic", 5, 32, "wilson");
        x.displayball();
    }
}