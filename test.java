class produit{

    private String name;
    private double  price;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public void applydiscount(){
        this.price  = price * 0.5;
    }

    public produit(String n, double p){
        name = n;
        price = p;
    }
    public void displayprod(){
        System.out.println("the name is: " +name);
    }
}

class test{

    public static void main(String[] args){

    produit sel = new produit("", 200);
    sel.getname();
    sel.setname("NaCl");
    sel.displayprod();
    }
}