package Interface;

public class Family implements Brother,Sister {
    @Override
    public void Brother() {
        System.out.println("Elder ones");
    }

    @Override
    public void Sister() {
        System.out.println("Younger ones");

    }


    public static void main(String[] args) {
        Family f = new Family();
        f.Brother();
        f.Sister();
    }
}