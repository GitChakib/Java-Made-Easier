abstract class ball{
    private int texture;
    private float volume;
    private String material;

    public ball(String m, int t, float v){

        material = m;
        volume  = v;
        texture = t;
    }
    public abstract void displayball();
}
class basketball extends ball{

    private String pattern;
    public basketball (String p){

        super(m,v,t);
        pattern  = p;

    }
}
