package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZooManagement {
    public static void main(String[] args) {
//        int nbrCages=20;
//        String zooName="my zoo";
////        Instruction 1
////        System.out.println(zooName + " comporte " + nbrCages + " cages")
////        Instruction 2
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter zoo name:");
//        zooName=input.nextLine();
//        while(zooName.isEmpty()){
//            System.out.println("Enter zoo name:");
//            zooName=input.nextLine();
//        }
//        System.out.println("Enter cage number:");
//        nbrCages=input.nextInt();
//        while(nbrCages<0){
//            System.out.println("Enter cage number:");
//            nbrCages=input.nextInt();
//        }
//        System.out.println(zooName+ " comporte " + nbrCages + " cages");

//        Animal lion = new Animal();
//        lion.family = "Felidae";
//        lion.name = "Lion";
//        lion.age = 5;
//        lion.isMammal = true;
        Animal a2=new Animal("a","tigre",9,true);
//        Zoo myZoo=new Zoo("Tunis","myZoo",2);
//        myZoo.animals[0]=lion;
//        System.out.println(myZoo);
//        System.out.println(myZoo.toString());

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Zoo myZoo = new Zoo("Tunis", "My Zoo");
        myZoo.addAnimal(lion);

        System.out.println("Zoo créé : " + myZoo.getName() + " à " + myZoo.getCity());
        System.out.println("Animal créé : " + lion.getName() + " (" + lion.getFamily() + ")");

        myZoo.displayZoo();
        System.out.println(lion);
        Animal nb1=new Animal("tigre","tigre1",9,true);
        Animal nb2=new Animal("tigre","tigre2",9,true);
        Animal nb3=new Animal("tigre","tigre3",9,true);

        myZoo.addAnimal(nb1);
        myZoo.addAnimal(nb2);
        myZoo.displayZoo();
        myZoo.addAnimal(nb3);
        int index = myZoo.searchAnimal("tigre3");
        if (index != -1) {
            System.out.println("Tiger at position: " + index);
        } else {
            System.out.println("Tiger not found");
        }
        Animal nb4=new Animal("tigre","tigre5",9,true);
        myZoo.addAnimal(nb4);
        int index2 = myZoo.searchAnimal("tigre5");
        if (index2 != -1) {
            System.out.println("Tiger at position: " + index2);
        } else {
            System.out.println("Tiger not found");
        }

        Zoo myZoo2 = new Zoo("Tunis", "My Second Zoo");
        Animal nb5=new Animal("elephant","luf",9,true);
        myZoo2.addAnimal(nb5);
        Zoo biggerZoo= myZoo2.comparerZoo(myZoo);
        System.out.println("the bigger zoo is : " + biggerZoo.getName());

        myZoo.removeAnimal(nb2);
        System.out.println("the zoo after removing the animal: ");
        myZoo.displayZoo();

    }
}