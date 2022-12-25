import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Manav manav=new Manav();
        manav.musteri=new Musteri();
        Scanner imput = new Scanner(System.in);

        System.out.println("HOŞGELDİNİZ\n---------------");
        boolean devam=true;
        do{

            System.out.println("SATIN ALMAK İSTEDİĞİNİZ ÜRÜNÜ SEÇİNİZ" );
            Manav.liste().forEach(System.out::println);
            System.out.print("-----\nSeçilen Ürün :");
            int secim = imput.nextInt();
            while (secim>Manav.liste().size()|| secim<1){
                System.out.println("YANLIŞ SEÇİM YAPTINIZ. LİSTEDEN SEÇİNİZ");
                System.out.print("-----\nSeçilen Ürün :");
                secim=imput.nextInt();
            }
            manav.musteri.sepet.add(Manav.liste().get(secim-1));
            System.out.println("""
                    -----
                    Ürün Sepetinize Eklendi
                    Başka birşey Almak İstermisiniz""");
            System.out.print("[1=Evet--2-Hayır] :");
            int secim2 = imput.nextInt();
            if (secim2==2) {
                System.out.println("----------\nSATIN ALINAN ÜRÜNLER: ");
                manav.musteri.sepet.forEach(System.out::println);
                System.out.println("-----------\n KASA :"+
                        manav.musteri.sepet.stream().mapToDouble(Urun::fiyat).sum());
                System.out.println("-----\nTEKRAR BEKLERİZ");
                devam=false;
            }

        }while (devam);
    }
}
record Urun(int ID, String urunAdi, int fiyat) {
}

