package jobagency;

public class Junior implements Observer{
    private String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (nameCompany.equals("Google")) {
            System.out.printf("Junior %s: I would like work with you\n", name);
        } else {
            System.out.printf("Junior %s: I'm waiting another offer\n", name);
        }
    }
    
}
