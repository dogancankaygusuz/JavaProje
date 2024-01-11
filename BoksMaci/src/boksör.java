public class boksör {
    String isim;
    int hasar,sağlık,kilo,blok;

    boksör(String isim, int hasar, int sağlık, int kilo, int blok) {
        this.isim = isim;
        this.hasar = hasar;
        this.sağlık = sağlık;
        this.kilo = kilo;
        if(blok <= 100 && blok >= 0) {
            this.blok = blok;
        }
        else
            this.blok = 0;
    }

    int vur(boksör b11) {
        System.out.println(this.isim + " -> " + b11.isim + " " + this.hasar + " hasar verdi.");

        if(b11.BlokVarMı()) {
            System.out.println(b11.isim + " gelen hasarı blokladı.");
            System.out.println("------------");
            return b11.sağlık;
        }

        if(b11.sağlık - this.hasar < 0)
            return 0;

        return b11.sağlık - this.hasar;
    }
    boolean BlokVarMı() {
        double rastgeleSayi = Math.random() * 100;
        return rastgeleSayi <= this.blok;
    }
}

class maç{
    boksör b1;
    boksör b2;
    int minKilo;
    int maxKilo;

    maç(boksör b1, boksör b2, int minKilo, int maxKilo) {
        this.b1 = b1;
        this.b2 = b2;
        this.minKilo = minKilo;
        this.maxKilo = maxKilo;
    }

    void başlat() {
        if(kontrol()) {
            while(this.b1.sağlık > 0 && this.b2.sağlık > 0) {
                System.out.println("========YENİ RAUNT========");
                this.b2.sağlık = this.b1.vur(this.b2);
                if(kazanan())
                    break;

                this.b1.sağlık = this.b2.vur(this.b1);
                if(kazanan())
                    break;

                System.out.println(this.b1.isim + " Sağlık: " + this.b1.sağlık);
                System.out.println(this.b2.isim + " Sağlık: " + this.b2.sağlık);
            }
        }
        else
            System.out.println("Boksör sikletleri uymadı");
    }
    boolean kontrol() {
        return (this.b1.kilo <= maxKilo && this.b1.kilo >= minKilo) && (this.b2.kilo <= maxKilo && this.b2.kilo >= minKilo);
    }
    boolean kazanan() {
        if(this.b1.sağlık == 0) {
            System.out.println(this.b2.isim + " KAZANDI");
            return true;
        }
        if(this.b2.sağlık == 0) {
            System.out.println(this.b1.isim + " KAZANDI");
            return true;
        }
        return false;
    }
}
