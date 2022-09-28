import java.util.HashMap;
import java.util.Set;

public class Annuaire extends HashMap<String, String> {

    public Annuaire(){
        super();
    }

    public void domaine(){
        this.keySet();
    }

    public String accces (String nom){
        if (containsKey(nom)){
            return get(nom);
        } else {
            return null;
        }
    }

    public void adjonction (String nom, String num){
        if (! containsKey(nom)){
            put(nom, num);
        }
    }

    public void suppression (String nom){
        if (containsKey(nom)){
            remove(nom);
        }
    }

    public void changement(String nom, String num){
        if (containsKey(nom)){
            replace(nom, num);
        }
    }
}
