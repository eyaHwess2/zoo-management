package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat){
        super(family, name,age, isMammal);
        this.habitat = habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getHabitat() {return this.habitat;}
    @Override
    public String toString() {
        return "Animal {family: "+this.getFamily()+", name: "+this.getName() +", isMammal: "+this.isMammal() +"} Aquatic{" + "habitat=" + habitat + '}';
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}
