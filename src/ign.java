

import java.util.Scanner;
import java.util.Random;

public class ign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int INITIAL_ID = 2023001;
        byte menuOptionMain = 0;
        byte menuOptionCreate = 0;
        byte personCreationHour, personCreationMin = 0;
        double personSalary = 0;
        byte personCount = 0;
        int personID = 0;
        String  personFirstName = "null";
        String  personLastName = "null";
        short personStreetNo = 0;
        String personStreetName = "null";
        String  personCity = "null";
        String  personState = "null";
        int  personZipCode = 0;
        long personPhone = 0;
        long startTime= 0;
        long endTime = 0;
        double elapsedTime = 0;

//        Add, declare, ini�alize, variables to declaration:
        String personDatabase="";
        String adminDatabase="";
        boolean goodLogin=false;
        byte menuOptionLogin = 0;

        String currentUser = "";
        String currentPass = "";
        boolean againStartLogin = false, againMainMenu=false;
        adminDatabase += "[root21,password123]\n[admin2,pass55]\n[cosc1436,pass65]\n";
        System.out.println(adminDatabase);
        System.out.println("=========================");
        System.out.println("Person Management System");
        System.out.println("=========================");
        System.out.println("Welcome to Person Management System (PMS)");
        System.out.println("This program's objectives:\n"+"include management and organization of person data.");
        System.out.println("This program only has :\n"+"Ch1, Ch2, Ch3, Ch4, and Ch5 topics.");
        System.out.println("This program functionality includes:\n"+"creating, reading, updating, and deleting person information.");
        System.out.println("=========================");
        System.out.println("This program developer: Jeffrey Cabrera");
        System.out.println("Bio: Born and raised in Houston, TX, served in the Marines for four years, and deployed to Japan in 2020.\n"
                +"Aiming to become a junior software developer in Orange County, CA; Houston, TX; or San Diego, CA.");
        System.out.println("=========================");

        do {
            System.out.println("login menu");
            System.out.println("1 - [signUp] Admin");
            System.out.println("2 - [Login]  Admin");
            System.out.println("3 - [Exit] ");

            menuOptionLogin = input.nextByte();

            if (menuOptionLogin == 1) {
                System.out.println("Sign up menu Screen");
                System.out.println("enter username (ex. code21)");
                currentUser = input.next();
                System.out.println("enter password (ex. password123)");
                currentPass = input.next();
                adminDatabase += "[" + currentUser + "," + currentPass + "]\n";
                System.out.println("verify your admin account!");
                System.out.println("[1] Please, enter your username:");
                currentUser = input.next();
                if (adminDatabase.contains(currentUser)) {
                    System.out.println("User exist");
                    int index = adminDatabase.indexOf(currentUser + ",");
                    String checkPass = adminDatabase.substring(index + (currentUser + ",").length());
                    checkPass = checkPass.substring(0, checkPass.indexOf(']'));
                    System.out.println("password=[" + checkPass + "]");
                    System.out.println("[2] Enter your password:");
                    currentPass = input.next();

                    if (currentPass.equals(checkPass)) {
                        System.out.println("Access granted ");
                        goodLogin = true;
                    } else {
                        System.out.println("Bad password...");
                        System.out.println("Denied access... ");
                    }
                } else {
                    System.out.println("User does not exist");
                    System.out.println("Denied access");
                }
            } else if (menuOptionLogin == 2) {
                System.out.println("verify your admin account!");
                System.out.println("[1] Please, enter your username:");
                currentUser = input.next();
                if (adminDatabase.contains(currentUser)) {
                    System.out.println("user exist");
                    int index = adminDatabase.indexOf(currentUser + ",");
                    String checkPass = adminDatabase.substring(index + (currentUser + ",").length());
                    checkPass = checkPass.substring(0, checkPass.indexOf(']'));
                    System.out.println("password=[" + checkPass + ",");
                    System.out.println("[2] Enter your password");
                    currentPass = input.next();

                    if (currentPass.equals(checkPass)) {
                        System.out.println("access granted");
                        goodLogin = true;
                    } else {
                        System.out.println("Bad password...");
                        System.out.println("Denied access... ");
                    }
                } else {
                    System.out.println("User does not exist");
                    System.out.println("Denied access");
                }
            } else {
            }
            if (goodLogin) {
                do {
                    System.out.println("Main Menu");
                    System.out.println("1 - [CREATE] Person");
                    System.out.println("2 - [READ] Persons");
                    System.out.println("3 - [UPDATE] Person");
                    System.out.println("4 - [DELETE] Person");
                    System.out.println("5 - [FIND] Person");
                    System.out.println();
                    System.out.println("Please input 1-5: ");
                    menuOptionMain = input.nextByte();
                    System.out.println("========================");
                    System.out.println("[user-input-auto-select] = " + menuOptionMain);
                    System.out.println("========================");
                    System.out.println("  ");

                    switch (menuOptionMain) {
                        case 1:
                            System.out.println("[CREATE] Person Menu Option");
                            System.out.println("1 - AUTO - CREATE PERSON FORM");
                            System.out.println("2 - NORMAL - CREATE PERSON FORM");
                            menuOptionCreate = input.nextByte();

                            if (menuOptionCreate == 1) {
                                System.out.println("============================");
                                System.out.println("===AUTO=== CREATE Menu - form =====");
                                System.out.println("============================");
                                Random r = new Random();
                                int rnd = r.nextInt(1, 3);
                                startTime = System.currentTimeMillis();
                                System.out.println("  ");
                                personID = INITIAL_ID + personCount + 1;
                                System.out.println("personCount = [" + personCount + "]");
                                System.out.println("personId = [" + personID + "]");
                                rnd = r.nextInt(1, 3);
                                personFirstName = rnd == 1 ? "Henry" : rnd == 2 ? "Sue" : "Mark";
                                System.out.println("PersonFirstName = [" + personFirstName + "]");
                                rnd = r.nextInt(1, 3);
                                personLastName = rnd == 1 ? "Willis" : rnd == 2 ? "James" : "Kimmel";
                                System.out.println("PersonLastName = [" + personLastName + "]");
                                personStreetNo = (short) r.nextInt(1, 22000);
                                System.out.println("PersonStreetNo = [" + personStreetNo + "]");
                                rnd = r.nextInt(1, 3);
                                personStreetName = rnd == 1 ? "Main St." : rnd == 2 ? "Brown Rd." : "Dulles Ln.";
                                System.out.println("PersonStreetName = [" + personStreetName + "]");
                                rnd = r.nextInt(1, 3);
                                personCity = rnd == 1 ? "Bloomington" : rnd == 2 ? "Magnolias" : "Western";
                                System.out.println("personCity = [" + personCity + "]");
                                rnd = r.nextInt(1, 3);
                                personState = rnd == 1 ? "CA" : rnd == 2 ? "FL" : "NY";
                                System.out.println("PersonState = [" + personState + "]");
                                personZipCode = r.nextInt(11111, 99111);
                                System.out.println("PersonZipCode = [" + personZipCode + "]");
                                personPhone = (long) (Math.random() * (9132229900L - 2132229900L)) + 2132229900L;
                                System.out.println("PersonPhone = [" + personPhone + "]");
                                personSalary = (long) (Math.random() * (125000 - 25000) + 25000);
                                System.out.println("PersonSalary = [" + personSalary + "] ");
                                endTime = System.currentTimeMillis();
                                elapsedTime = ((endTime - startTime) / 1000) % 60;
                                personCreationMin = (byte) ((((System.currentTimeMillis()) / 1000) / 60) % 60);
                                personCreationHour = (byte) (((((System.currentTimeMillis()) / 1000) / 60) / 60) % 24);
                                personCreationHour -= 5;
                                personCreationHour = (personCreationHour < 0) ? (personCreationHour += 12) : personCreationHour;
                                System.out.println("Current TIme: [ "+ personCreationHour + ": " + personCreationMin + "] ");
                                System.out.println("Person Creation TIme: [  " + elapsedTime + "]sec ");
                                System.out.println("   =============================");
                                personCount += 1;
                                System.out.println("   ====== Person Add : id#" + personID + " ======= ");
                                System.out.println("   ===================================");
                                personDatabase += String.format("[%d][%d][%s][%s][%d][%s][%s][%s][%d][%d][%,.2f]\n" ,
                                        personCount, personID, personFirstName, personLastName, personStreetNo,
                                        personStreetName, personCity, personState, personZipCode, personPhone, personSalary);
                                System.out.println(personDatabase);
                                // Use string literals

                            } else if (menuOptionCreate == 2) {
                                System.out.println("============================");
                                System.out.println("===NORMAL=== CREATE Menu - form =====");
                                System.out.println("============================");
                                startTime = System.currentTimeMillis();
                                System.out.println("  ");
                                personID = INITIAL_ID + personCount + 1;
                                System.out.println("PersonCount = [" + personCount + "]");
                                System.out.println("PersonId = [" + personID + "]");
                                System.out.println("Enter First name: ");
                                input.nextLine();
                                personFirstName = input.nextLine();
                                System.out.println("PersonFirstName = [" + personFirstName + "]");
                                System.out.println("Enter Last name: ");
                                personLastName = input.nextLine();
                                System.out.println("Enter Last Name = [" + personLastName + "]");
                                System.out.println("Enter Street No [Address] : ");
                                personStreetNo = input.nextShort();
                                System.out.println("PersonStreetNo = [" + personStreetNo + "]");
                                System.out.println("Enter Street Name [Address] : ");
                                input.nextLine();
                                personStreetName = input.nextLine();
                                System.out.println("PersonStreetName = [" + personStreetName + "]");
                                System.out.println("Enter City [Address]: ");
                                personCity = input.nextLine();
                                System.out.println("PersonCity = [" + personCity + "]");
                                System.out.println("Enter State [Address]: ");
                                personState = input.nextLine();
                                System.out.println("PersonState = [" + personState + "]");
                                System.out.println("Enter Zip Code [Address] : ");
                                personZipCode = input.nextInt();
                                System.out.println("PersonZipCode = [" + personZipCode + "]");
                                System.out.println("Enter phone [Address] : ");
                                personPhone = input.nextLong();
                                System.out.println("PersonPhone = [" + personPhone + "]");
                                System.out.println("Enter your current salary (ex. 25000 - 125000) : ");
                                personSalary = input.nextFloat();
                                System.out.println("PersonSalary = [" + personSalary + "] ");
                                endTime = System.currentTimeMillis();
                                elapsedTime = ((endTime - startTime) / 1000) % 60;
                                personCreationMin = (byte) ((((System.currentTimeMillis()) / 1000) / 60) % 60);
                                personCreationHour = (byte) (((((System.currentTimeMillis()) / 1000) / 60) / 60) % 24);
                                personCreationHour -= 5;
                                personCreationHour = (personCreationHour < 0) ? (personCreationHour += 12) : personCreationHour;
                                System.out.println("Current TIme: [ " + personCreationHour + ": " + personCreationMin + "] ");
                                System.out.println("Person Creation TIme: [ "+ elapsedTime + "]sec ");
                                System.out.println("   =============================");
                                personCount += 1;
                                System.out.println("   ====== Person Add : id#" + personID + " ===== ");
                                System.out.println("   ===================================");
                                personDatabase += String.format("[%d][%d][%s][%s][%d][%s][%s][%s][%d][%d][%,.2f]\n" ,
                                        personCount, personID, personFirstName, personLastName, personStreetNo,
                                        personStreetName, personCity, personState, personZipCode, personPhone, personSalary);
                                System.out.println(personDatabase);
                                System.out.println("==========================");

                            } else {
                                System.out.println("Enter @ CREATE Menu");
                            }
                            break;
                        case 2:
                            System.out.println("[READ] Person Menu");
                            System.out.println("Currently not available!");
                            break;
                        case 3:
                            System.out.println("[UPDATE] Person Menu");
                            System.out.println("Currently not available!");
                            break;
                        case 4:
                            System.out.println("[DELETE] Person Menu");
                            System.out.println("Currently not available!");
                            break;
                        case 5:
                            System.out.println("[FIND] Person Menu");
                            System.out.println("Currently not available!");
                            break;
                        default:
                            System.out.println("Enter @ Main Menu");
//                        break;
                    }

                    System.out.println("Go back to the Main Menu, Yes or No");
                    input.nextLine();
                    againMainMenu=input.nextLine().toUpperCase().charAt(0)=='Y'?true:false;

                }while(againMainMenu);

            }

            System.out.println("Go back to the Main Menu, Yes or No");
            if(menuOptionLogin==3) {
                input.nextLine();
                againStartLogin=input.nextLine().toUpperCase().charAt(0)=='Y'?true:false;
            } else {
                againStartLogin=input.nextLine().toUpperCase().charAt(0)=='Y'?true:false;
            }
        }while(againStartLogin);
        System.out.println("Program has Ended");
        input.close();
    }
}


