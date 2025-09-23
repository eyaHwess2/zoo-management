import java.util.Arrays;

public class Zoo {
    Animal [] animals= new Animal[25];
    String name;
    String city;
    static final int nbrCages=25;
    int nbrAnimals;

    public Zoo(String city, String name) {

        this.animals = new Animal[nbrCages];
        this.city = city;
        this.name = name;
        this.nbrAnimals = 0;
    }
    public Zoo(){};

    public void displayZoo(){
        System.out.println("zoo name: "+ this.name +" city: "+this.city + " nbrcages: "+this.nbrCages + "animals=" + Arrays.toString(animals));
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
            if((this.animals[i].name).equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean addAnimal(Animal animal){
        if (this.animals[animals.length-1]!=null || this.searchAnimal(animal.name)!=-1){
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
        if(this.searchAnimal(animal.name)!=-1){
            this.animals[this.searchAnimal(animal.name)]=null;
            return true;
        }
        return false;
    }

    public boolean isZooFull(){
        if( this.nbrAnimals==25){
            return true;
        }
        return false;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals>z2.nbrAnimals){
            return z1;
        }
        return z2;
    }

}
