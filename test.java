class produit{

    private String name;
    private double  price;

    public String getname(){
        return name;
    }
    public void setname(){
        this.name = name;
    }

    public void applydiscount(){
        this.price  = price * 0.5;
    }

    public produit(String n, double p){
        name = n;
        price = p;
    }
}