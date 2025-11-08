package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food>{
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name,age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return "Animal {family: "+this.getFamily()+", name: "+this.getName() +", isMammal: "+this.isMammal() +"Terrestrial{" + "nbr Legs=" + nbrLegs + '}';
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " mange de la viande");
        } else {
            System.out.println(getName() + " prefere autre chose");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " mange des plantes");
        } else {
            System.out.println(getName() + " prefere la viande");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " omnivore mange tout");
        }
    }
}
