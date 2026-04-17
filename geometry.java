class square{

    public float length;
    public square(float l){
        length = l;
    }
    public float surface(){
        return length*length;
    }
    public void display(){
        System.out.println("length is: "+length+ "surface is: "+surface());
    }

}