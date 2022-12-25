import java.util.*;

public class Manav {

    Musteri musteri;

    public Manav() { }

    public static List<Urun> liste(){
        ArrayList<Urun> uruns = new ArrayList<>(List.of(


                new Urun(1, "Karpuz", 45),
                new Urun(2, "Kiraz", 45),
                new Urun(3, "Kayısı", 45),
                new Urun(4, "Kavun", 45),
                new Urun(5, "Kivi", 45)
        ));
        return uruns;
    }
}
