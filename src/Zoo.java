import java.util.Arrays;

public class Zoo {
    Animal [] animals= new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo(String city, String name, int nbrCages) {

        this.animals = new Animal[nbrCages];
        this.city = city;
        this.name = name;
        this.nbrCages = nbrCages;
    }
    public Zoo(){};

    public void displayZoo(){
        System.out.println("zoo name: "+ this.name +" city: "+this.city + " nbrcages: "+this.nbrCages);
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
}
