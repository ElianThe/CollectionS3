import javax.sound.midi.Soundbank;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ListeAdresseIP listeIP = new ListeAdresseIP(true);
        listeIP.chargerFichier("logs.txt");
        System.out.println(listeIP.toString());
    }
}
