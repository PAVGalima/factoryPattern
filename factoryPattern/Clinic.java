package factoryPattern;

import java.util.Scanner;
/*
 * GALIMA PATRICK ACE V.
 * 3-BSCS-2
 * SOFTWARE ENGINEERING 1: Factrory Pattern.
 */
public class Clinic {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean whilerunning = true;

        while (whilerunning){
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nChoose your pet number: ");
        Integer choice = scan.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet;

        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetBreed("GERMAN SHEPERD");
                petFile.setPet(pet);
                
                System.out.println("[DOG] PET BREED: " + petFile.getPetBreed());
                break;

            case 2: pet = new Cat();
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                System.out.println("[CAT ]No of Lives: " + petFile.getPet().getNoOfLives());   

                break;

            case 3:
            System.out.println("Exiting...[RE RUN THE CODE]");
            whilerunning = false;
            break; 
            default:
            System.out.println();
         }
        }
    }
}
