class employee{
    private String name;
    private String surname;
    private int wage;
    public employee (String n, String s, int w){
        name = n;
        surname = s;
        wage = w;
    }
    void displayemp(){
        System.out.println("name is: "+name+ "surname is: " +surname+ "wage is: " +wage);
    }
}
    class manager extends employee{
        private String department;

        public manager (String n, String s, int w, String d){
            super(n, s, w);
            department = d;
        }
        void displaymng(){
            super.displayemp();
            System.out.println("department is: "+department);
        }
    }
public class enterprise{
    public static void main(String args[]){
        employee x = new employee ("john", "smith", 500);
        x.displayemp();
        manager y = new manager ("micah", "bell", 300, "west");
        y.displaymng();
    }
}