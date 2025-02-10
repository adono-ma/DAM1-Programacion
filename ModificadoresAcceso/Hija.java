package ModificadoresAcceso;

public class Hija extends Padre {

    Padre p1 = new Padre();

    public void m2() {
        Padre p1 = new Padre();
        mProtected();
        mDefault();
    }
}
