package tn.esprit.gestionzoo.entities;
import java.util.Arrays;

public class Zoo {
    private Animal[] animals= new Animal[25];
    private String name;
    private String city;
    static final int nbrCages=25;
    private int nbrAnimals;

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

    public boolean addAnimal(Animal animal){
        if (this.animals[animals.length-1]!=null || this.searchAnimal(animal.getName())!=-1 || this.isZooFull()){
            return false;
        }
        this.animals[nbrAnimals++]=animal;
        return true;
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

}
