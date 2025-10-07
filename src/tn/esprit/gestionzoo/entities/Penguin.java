package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Animal {family: "+this.getFamily()+", name: "+this.getName() +", isMammal: "+this.isMammal() +"} Dolphin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
}
