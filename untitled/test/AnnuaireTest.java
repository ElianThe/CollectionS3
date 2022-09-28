

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnnuaireTest {

    private Annuaire a;
    private String nom;
    private String num;

    @BeforeEach
    void setup(){
        //preparation des donnes
        a = new Annuaire();
        nom = "Elian";
        num = "21ans";
        a.adjonction(nom, num);
    }


    //acces à une valeur
    @Test
    public void accesExistePas (){
        //lancement des methodes
        String numero = a.accces("Elio");
        //verifications des resultats
        assertEquals(null, numero, "Ca doit etre le meme num");
    }

    @Test
    public void accesExiste (){
        //lancement des methodes
        String numero = a.accces("Elian");
        //verification des resultats
        assertEquals(num, numero, "On doit acceder au numero");
    }

    @Test
    public void adjonctionExistePas (){
        //lancement des methodes
        String nouvNom = "Mehdi";
        String nouvNum = "19ans";
        a.adjonction(nouvNom, nouvNum);
        //verification des resultats
        assertTrue(a.containsKey(nouvNom), "La clé ne devrais pas existe pas");
    }

    @Test
    public void adjonctionExiste (){
        //lancement des methodes
        String nouvNom = "Mehdi";
        String nouvNum = "19ans";
        a.adjonction(nouvNom, nouvNum);
        a.adjonction("Mehdi", "rien");
        //verification des resultats
        assertTrue(a.containsKey(nouvNom), "La clé ne devrais pas existe pas");
        assertEquals(a.accces(nouvNom), "19ans", "ca devrait etre 19ans");
    }

    @Test
    public void suppressionExiste(){
        //lancement des methodes
        String nouvNom = "Mehdi";
        String nouvNum = "19ans";
        a.adjonction(nouvNom, nouvNum);
        a.suppression(nouvNom);
        //verification des resultats
        assertFalse(a.containsKey(nouvNom), "La clé nouvNom ne devrait pas exister");
    }

    @Test
    public void suppressionExistePas(){
        //lancement des methodes
        a.suppression("rien");
        //verifications des resultats
        assertEquals(a.size(), 1, "La taille devrait etre de 1");
    }

    @Test
    public void changementExiste(){
        //lancement des methodes
        a.changement("Elian", "22");
        //verification des resultats
        assertEquals(a.accces("Elian"), "22", "La valeur de la clé Elian devrait etre 22");
    }

    @Test
    public void changementExistePas(){
        //lancement des methodes
        a.changement("rien", "28");
        //verification des resultats
        assertEquals(a.accces("Elian"), "21ans", "La valeur de la clé de Elian devrait etre 21ans");
        assertFalse(a.containsKey("rien"), "Ca derait rien retourner");
        assertEquals(a.size(), 1, "la taille devrait etre de 1");
    }
}
