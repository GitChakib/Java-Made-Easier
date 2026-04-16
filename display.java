 class Personne
{
private String nom;
private String prenom;
public Personne(String nom,String prenom)
{
this.nom = nom;
this.prenom = prenom;
}
public String getNom()
{
return nom;
}
public String getPrenom()
{
return prenom;
}
 public String getInformationAdditionnel(){
    return "";
 }
 public void afficherInformations(){
 }
}
 class Etudiant extends Personne
{
    private String specialite;
    public Etudiant(String nom, String prenom, String specialite){
        super(nom, prenom);
        this.specialite = specialite; 
    }
     public String getInformationAdditionnel(){
        return specialite;
}
    public void afficherInformations(){
        System.out.println("Nom: "+getNom()+" Prenom: "+getPrenom()+" Specialite: "+getInformationAdditionnel());
    }
}
 class Enseignant extends Personne
{
    private String matiere;
    public Enseignant(String nom, String prenom, String matiere){
        super(nom, prenom);
        this.matiere = matiere;
    }
    public String getInformationAdditionnel(){
        return matiere;
    }
    public void afficherInformations(){
        System.out.println("Nom: "+getNom()+" Prenom: "+getPrenom()+" Matiere: "+getInformationAdditionnel());
    }

}
 class Administrateur extends Enseignant
{
    private String poste;
    public Administrateur(String nom, String prenom, String matiere, String poste){
        super(nom, prenom, matiere);
        this.poste = poste;
    }
    public String getInformationAdditionnel(){
        return poste;
    }
    public void afficherInformations(){
        super.afficherInformations();
        System.out.println("Poste: "+getInformationAdditionnel());
    }
}
public class display {
    public static void main(String[] args){
        Personne[] Personne = new Personne[4];
        Personne[0] = new Personne ("nom1", "prenom1");
        Personne[1] = new Etudiant ("nom2", "prenom2", "specialite1");
        Personne[2] = new Enseignant ("nom3", "prenom3", "matiere1");
        Personne[3] = new Administrateur ("nom4", "prenom4", "matiere2", "poste1");
        Personne[0].afficherInformations();
        Personne[1].afficherInformations();
        Personne[2].afficherInformations();
        Personne[3].afficherInformations();
    }
}
