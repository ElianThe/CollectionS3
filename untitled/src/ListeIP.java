import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListeIP {

    //contient les adresses IP des machines
    private Set<String> ips;


    public ListeIP(boolean trier){
        if (trier){
            ips = new TreeSet<>();
        } else {
            ips = new HashSet<>();
        }
    }

    public void chargerFichier(String name) throws FileNotFoundException, IOException {
        //chargement du fichier
        BufferedReader br = new BufferedReader(new FileReader(name));
        String line;
        //tant que le fichier n'est pas fini
        while ((line = br.readLine()) != null){
            System.out.println(line);
            //recuperer l'adresse ip
            String [] lesIps = line.split(" ");
            //l'ajouter au Hash Set
            String ip = lesIps[0];
            ips.add(ip);
        }
        br.close();
    }

    public String toString(){
        return this.ips + "\n";
    }
}
