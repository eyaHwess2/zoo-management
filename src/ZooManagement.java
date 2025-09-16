import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages=20;
        String zooName="my zoo";
//        Instruction 1
//        System.out.println(zooName + " comporte " + nbrCages + " cages")
//        Instruction 2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter zoo name:");
        zooName=input.nextLine();
        while(zooName.isEmpty()){
            System.out.println("Enter zoo name:");
            zooName=input.nextLine();
        }
        System.out.println("Enter cage number:");
        nbrCages=input.nextInt();
        while(nbrCages<0){
            System.out.println("Enter cage number:");
            nbrCages=input.nextInt();
        }
        System.out.println(zooName+ " comporte " + nbrCages + " cages");

    }
}