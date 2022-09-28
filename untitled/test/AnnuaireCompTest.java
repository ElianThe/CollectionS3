import org.junit.jupiter.api.BeforeEach;

public class AnnuaireCompTest {

    AnnuaireComp ac = new AnnuaireComp();

    @BeforeEach
    public void steUp(){
        ac.adjonction("Elian", "Guiffault", 21);
    }
}
