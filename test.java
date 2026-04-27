class personne{


    private String nom;
    private int age; 

    public personne (String n, int a){

        nom = n;
        age = a;
    }

    public void afficher(){
        System.out.println("le nom est: \n"+nom+  "\nl'age est: \n" +age);
    }

}
class test{
    
    public static void main(String[] args) {
        
        personne x = new personne("ahmed", 20);
        x.afficher();
    }
}