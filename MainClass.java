package PatientRecords;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MUQADASA SHERANI
 */
public class MainClass {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        Patient patient = new Patient();
        Hospital hospital = new Hospital();
        
        System.out.println("Welcome to the hospital!");
        System.out.println("For a new patient record, press 1.");
        System.out.println("If you already have a record, press 2.");
        System.out.println("For all patients in the hospital, press 3.");
        choice = scan.nextInt();
        while(choice != -1){
            switch (choice){
                case 1: 
                    System.out.println("Enter your id, name and age");
                    int id = scan.nextInt();
                    String name = scan.next();
                    int age = scan.nextInt();
                    patient = new Patient(id, name, age);
                    patient.increaseVisits();
                    hospital.setPatients(patient);
                    System.out.println("Your record has been created.");
                    break;
                case 2: 
                    System.out.println("Enter your patient id: ");
                    id = scan.nextInt();
                    for(int i=0; i < hospital.getPatientsCount(); i++){
                        if(hospital.getPatients()[i].getId() == id){
                            System.out.println(hospital.getPatients()[i].toString());
                        }
                    }
                    break;
                case 3: 
                    System.out.println("List of all patients:");
                    System.out.println(hospital.toString());
                    break;
            }
            System.out.println("Do you have any other request? (-1 to quit)");
            choice = scan.nextInt();
        }
        System.out.println("Bye!");
    } 
}
