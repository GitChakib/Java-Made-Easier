class book{
    private String title;
    private String author;
    private float price;
    private int quantity;
    public book(){
    }
    public book(String t, String auth, float prc, int qtt){
        title = t;
        author = auth;
        price = prc;
        quantity = qtt;
    }
    public void display(){
        System.out.println("title is: "+title+ "author is: "+author+ "price is: "+price+ "quantity is: " +quantity);
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
}
public class sandbox{
   public static void main(String args[]){
    book x = new book("java", "chakib", 500, 10);
    x.display();
    book y = new book();
    y.setTitle("nuclearphysics");
    System.out.println("title is: " +y.getTitle());
    }
}