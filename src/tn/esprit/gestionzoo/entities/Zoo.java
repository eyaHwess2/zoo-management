package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals= new Animal[25];
    private String name;
    private String city;
    static final int nbrCages=25;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals= new Aquatic[10];
    private int nbrAquaticAnimals;

    public Zoo(String city, String name) {

        this.animals = new Animal[nbrCages];
        this.city = city;
        this.name = name;
        this.nbrAnimals = 0;
    }
    public Zoo(){};

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()!=0){
            this.name = name;
        }
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void displayZoo(){
        System.out.println("zoo name: "+ this.getName() +" city: "+this.getCity() + " nbrcages: "+this.nbrCages + "animals=" + Arrays.toString(animals));
    };
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
    public int searchAnimal(String nom){
        for(int i=0;i<nbrAnimals;i++){
            if((this.animals[i].getName()).equals(nom)){
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull(){
        if( this.nbrAnimals==25){
            return true;
        }
        return false;
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("age invalide : " + animal.getAge());
        }
        if (nbrAnimals >= nbrCages) {
            throw new ZooFullException("Le zoo est plein !");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }


    public void getAnimals(){
        for(int i=0;i<nbrAnimals;i++){
            if(animals[i]!=null){
                System.out.println("animal " +i +": "+animals[i].toString());
            }
        }
    }

    public boolean removeAnimal(Animal animal){
        int j=searchAnimal(animal.getName());
        if(j!=-1){
            this.animals[j]=null;
            for(int i=j;i<nbrAnimals;i++){
                this.animals[i]=this.animals[i+1];
            }
            return true;
        }
        return false;
    }


    public Zoo comparerZoo(Zoo z2){
        if (this.nbrAnimals>z2.nbrAnimals){
            return this;
        }
        return z2;
    }

    public void addAquaticAnimal(Aquatic a){
        if (nbrAquaticAnimals<10){
            this.aquaticAnimals[nbrAquaticAnimals++]=a;
            System.out.println("animal added");
        }
        System.out.println("animal cannot be added");

    }
    //i added this function to avoid doing a "boucle" fel main
    public void displayAquaticSwim() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }


    public void displayNumberOfAquaticsByType() {
        int p = 0;
        int d = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                p++;
            } else if (aquaticAnimals[i] instanceof Dolphin) {
                d++;
            }
        }

        System.out.println("Number of Penguins: " + p);
        System.out.println("Number of Dolphins: " + d);
    }



}
