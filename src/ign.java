

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

//        Add, declare, ini�alize, variables to declara�on:
        String personDatabase="";
        String adminDatabase="";
        boolean goodLogin=false;
        byte menuOptionLogin = 0;

        String currentUser = "";
        String currentPass = "";

        System.out.println("=========================");
        System.out.println("Person Management System");
        System.out.println("=========================");
        System.out.println("Welcome to Person Management System (PMS)");
        System.out.println(" this programs objectives ... ");
        System.out.println("This program only has Ch1, Ch2, and Ch3 topics.");
        System.out.println("thsi program functionality");
        System.out.println("=========================");
        System.out.println(" this program developer ... name : jeffrey cabrera, bio: lorem ");

        System.out.println("login menu");
        System.out.println("1 - [signup] admin");
        System.out.println("2 - [login]  admin");
        System.out.println("3 - [exit] ");

        menuOptionLogin = input.nextByte();

        if(menuOptionLogin == 1) {
            System.out.println("sign up menu screen");
            System.out.println("enter username");
            currentUser = input.next();
            System.out.println("enter password");
            currentPass = input.next();
            adminDatabase+="[" + currentUser + "," + currentPass + "]\n";

            System.out.println("verify your admin account!");
            System.out.println("[1] please enter your username:");
            currentUser = input.next();

            if(adminDatabase.contains(currentUser)) {
                System.out.println("user exist");
                int index = adminDatabase.indexOf(currentUser + ",");
                String checkPass = adminDatabase.substring(index + (currentUser + ",").length());
                checkPass = checkPass.substring(0,checkPass.indexOf(']'));
                System.out.println("password=[" + checkPass + ",");
                System.out.println("[2] enter your password");
                currentPass = input.next();

                if(currentPass.equals(checkPass)) {
                    System.out.println("access granted ");
                    goodLogin=true;
                } else {
                    System.out.println("bad password...");
                    System.out.println("denied access... ");
                }
            } else {
                System.out.println("user does not exist");
                System.out.println("denied access");
            }
        } else if (menuOptionLogin == 2) {

        } else {

        }


        if(goodLogin) {
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
            System.out.println("[user-input-auto-select] " + menuOptionMain);
            System.out.println("========================");
            System.out.println("  ");

            switch (menuOptionMain) {
                case 1:
                    System.out.println("[CREATE] Person Menu Option");
                    System.out.println("1 - AUTO CREATE PERSON FORM");
                    System.out.println("2 - NORMAL CREATE PERSON FORM");
                    menuOptionCreate = input.nextByte();

//                    #14 In [AUTO] create person , create variable int rnd that equals r.nextInt(1, 3);
//Now each string reassign personFirstName, personLastName, personStreetName,
//personCity, & personState to condi�onal statement with 3 string op�on. Based on
//rnd, and each string reset rnd to r.nextInt(1,3).
//For example.
//19:19
                    if (menuOptionCreate == 1) {
                        System.out.println("============================");
                        System.out.println("===AUTO=== CREATE Menu - form =====");
                        System.out.println("============================");
                        Random r = new Random();
                        startTime = System.currentTimeMillis();
                        System.out.println("  ");
                        personID = INITIAL_ID + personCount + 1;
                        System.out.println(" personCount = ["+personCount+"]");
                        System.out.println(" personId = ["+personID+"]");
                        System.out.println("Enter First name: ");
                        System.out.println(" personFirstName = ["+personFirstName+"]");
                        System.out.println("Enter Last name: ");
                        System.out.println(" Enter Last Name = ["+personLastName+"]");
                        System.out.println(" Enter Street No [Address] : ");
                        personStreetNo=(short) r.nextInt(1, 22000);
                        System.out.println("personStreetNo = ["+personStreetNo+"]");
                        System.out.println(" Enter Street Name [Address] : ");
                        System.out.println(" personStreetName = ["+personStreetName+"]");
                        System.out.println( "Enter City [Address]: ");
                        System.out.println(" personCity = ["+personCity+"]");
                        System.out.println(" Enter State [Address]: ");
                        System.out.println(" personState = ["+personState+"]");
                        System.out.println(" Enter Zip Code [Address] : ");
                        personZipCode= r.nextInt (11111, 99111);
                        System.out.println( "personZipCode =["+personZipCode+"]");
                        System.out.println(" Enter phone [Address] : ");
                        personPhone = (long) (Math.random() * (9132229900L - 2132229900L)) + 2132229900L;
                        System.out.println(" personPhone + ["+ personPhone +"]" );
                        System.out.println("Enter your current salary (ex. 25000 - 125000) : ");

                        personSalary = (long) (Math.random() * (125000 - 25000) + 25000);
                        System.out.println(" personSalary =["+personSalary+"] ");

                        endTime = System.currentTimeMillis();
                        elapsedTime = ((endTime - startTime) / 1000) % 60;
                        personCreationMin = (byte) ((((System.currentTimeMillis()) / 1000) / 60) %60);
                        personCreationHour = (byte) (((((System.currentTimeMillis()) / 1000) / 60) / 60) %24);
                        personCreationHour-= 5;
                        personCreationHour = (personCreationHour < 0) ? (personCreationHour += 12) : personCreationHour;
                        System.out.println(" Current TIme: [ "+personCreationHour+": "+personCreationMin+ "] ");
                        System.out.println("Person Creation TIme: [ "+elapsedTime+"]sec ");
                        System.out.println("=============================");
                        personCount += 1;
                        System.out.println(" ====== Person Add : id#"+personID+"======= ");
                        System.out.println("===================================");

                        String output = String.format("[%d][%d][%s][%s][%d][%s][%s][%s][%d][%d][%,.2f]",
                                personCount, personID, personFirstName, personLastName, personStreetNo,
                                personStreetName, personCity, personState, personZipCode, personPhone, personSalary );
                        System.out.println(output);
                        // Use string literals

                    } else if (menuOptionCreate == 2) {
                        System.out.println("============================");
                        System.out.println("===NORMAL=== CREATE Menu - form =====");
                        System.out.println("============================");
                        startTime = System.currentTimeMillis();
                        System.out.println("  ");
                        personID = INITIAL_ID + personCount + 1;
                        System.out.println(" personCount = ["+personCount+"]");
                        System.out.println(" personId = ["+personID+"]");
                        System.out.println("Enter First name: ");
                        input.nextLine();personFirstName = input.nextLine();
                        System.out.println(" personFirstName = ["+personFirstName+"]");
                        System.out.println("Enter Last name: ");
                        personLastName = input.nextLine();
                        System.out.println(" Enter Last Name = ["+personLastName+"]");
                        System.out.println(" Enter Street No [Address] : ");
                        personStreetNo= input.nextShort();
                        System.out.println("personStreetNo = ["+ personStreetNo +"]");
                        System.out.println(" Enter Street Name [Address] : ");
                        input.nextLine();personStreetName = input.nextLine();
                        System.out.println(" personStreetName = [" + personStreetName + "]");
                        System.out.println( "Enter City [Address]: ");
                        personCity = input.nextLine();
                        System.out.println(" personCity = ["+personCity+"]");
                        System.out.println(" Enter State [Address]: ");
                        personState = input.nextLine();
                        System.out.println(" personState = ["+personState+"]");
                        System.out.println(" Enter Zip Code [Address] : ");
                        personZipCode= input.nextInt();
                        System.out.println( "personZipCode =["+personZipCode+"]");
                        System.out.println(" Enter phone [Address] : ");
                        personPhone = input.nextLong();
                        System.out.println(" personPhone + ["+ personPhone +"]" );
                        System.out.println("Enter your current salary (ex. 25000 - 125000) : ");
                        personSalary = input.nextFloat();
                        System.out.println(" personSalary =["+ personSalary +"] ");
                        endTime = System.currentTimeMillis();
                        elapsedTime = ( (endTime - startTime) / 1000) % 60;
                        personCreationMin = (byte) ((((System.currentTimeMillis()) / 1000) / 60) %60);
                        personCreationHour = (byte) (((((System.currentTimeMillis()) / 1000) / 60) / 60) %24);
                        personCreationHour-= 5;
                        personCreationHour = (personCreationHour < 0) ? (personCreationHour += 12) : personCreationHour;
                        System.out.println(" Current TIme: [ "+personCreationHour+": "+personCreationMin+ "] ");
                        System.out.println("Person Creation TIme: [ "+elapsedTime+"]sec ");
                        System.out.println("=============================");
                        personCount += 1;
                        System.out.println(" ====== Person Add : id#"+personID+" ===== ");
                        System.out.println("===================================");
                        String output = String.format("[%d][%d][%s][%s][%d][%s][%s][%s][%d][%d][%,.2f]",
                                personCount, personID, personFirstName, personLastName, personStreetNo,
                                personStreetName, personCity, personState, personZipCode, personPhone, personSalary );
                        System.out.println(output);

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
                    break;
            }

            input.close();
        }


        System.out.println("Program has Ended");
    }
}


