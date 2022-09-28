import java.util.HashMap;
import java.util.Set;

public class AnnuaireComp extends HashMap<Personne, Integer> {

    public AnnuaireComp(){
        super();
    }

    public void domaine (){
            this.keySet();
    }

    public Integer acces (String prenom, String nom){
        Personne p =new Personne(nom,prenom);
        if (! containsKey(p)){
            return get(p);
        } else {
            return null;
        }
    }

    public void adjonction (String prenom, String nom, int numero){
        Personne p = new Personne(nom, prenom);
        if (! containsKey(p)){
            put(p, numero);
        }
    }

    public void suppresion(String nom, String prenom){
        Personne personne = new Personne(nom, prenom);
        remove(personne);
    }

    public void changement (String nom, String prenom, int numero){
        Personne p = new Personne(nom, prenom);
        if (containsKey(p)){
            replace(p, numero);
        }
    }
}
