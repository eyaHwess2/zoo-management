import java.util.Scanner;

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
        Zoo myZoo = new Zoo("My Zoo", "Tunis", 25);
        myZoo.animals[0]=lion;

        System.out.println("Zoo créé : " + myZoo.name + " à " + myZoo.city);
        System.out.println("Animal créé : " + lion.name + " (" + lion.family + ")");

        myZoo.displayZoo();
        System.out.println(lion);
    }
}