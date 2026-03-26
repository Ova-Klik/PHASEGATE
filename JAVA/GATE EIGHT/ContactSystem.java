import java.util.Scanner;
import java.util.ArrayList;


public class ContactSystem{
    
    Scanner input = new Scanner(System.in);
    ArrayList<String> contacts= new ArrayList<>();   
    
    
    public void main(String...args){
    int start=1;
    
    while(start!=0){
        String menu= ("""
        
                                == WELCOME TO CONTACT LOG SYSTEM ==
                                
                                1. Add Contact
                                2. Remove Contact
                                3. Find Contact by Phone Number
                                4. Find Contact by First Name
                                5. Find Contact by Last Name
                                6. Edit Contact
                                0. Exit
                                
        
        
                        """);
                        
        System.out.printf(menu);
        
        System.out.printf("%n%nEnter option (0-6):");
        int option=input.nextInt();
        
        switch(option){
        
            case 0-> {
                        System.out.printf("Thank you for using Contact Log System...");
                        System.exit(0);
            }
            case 1-> handleAddContact(ArrayList<String> contacts);
            case 2-> removeContact(phoneNumber);
//            case 3-> findContactByPhoneNumber(phoneNumber);
//            case 4-> findContactByFirstName(firstName);
//            case 5-> findContactByLastName(lastName);
//            case 6-> editContact();
            default-> System.out.printf("Invalid input!!, Try again");
            
        }
        
   }  
   }
   
   public void handleAddContact(ArrayList<String> contacts){
   
        System.out.printf("%n Kindly enter Phone Number: ");
        String phoneNumber = input.nextLine();
        
        for(int index=0; index<contacts.size(); index++){
                if(contacts[index].equals(phoneNumber)){
                    
                    System.out.printf("%nPhone Number already exists in log!!!");
                    break;
                
                }else{
                    System.out.printf("%n Kindly enter First Name: ");
                    String firstName = input.nextLine();
                    System.out.printf("%n Kindly enter Last Name: ");
                    String lastName = input.nextLine();
                
                    addContact(firstName,lastName,phoneNumber,ArrayList<String> contacts
                   }     
            }
            System.out.printf("%nContact Added Successfully!!!");
        }
        
   
   public void addContact(String firstName,lastName,phoneNumber,ArrayList<String> contacts){
   
       
                    contacts.add(phoneNumber);
                    contacts.add(firstName);
                    contacts.add(lastName);
           
        
    public void removeContact(firstName,lastName,phoneNumber,ArrayList<String> contacts){
   
        System.out.printf("%n Kindly enter Phone Number: ");
        String phoneNumber = input.nextLine();
        
        int indexToRemove = -1;
        
        for(int index=0; index<contacts.size(); index++){
                if(contacts[index].equals(phoneNumber)){
                    
                    indexToRemove = contacts[index];
                    break;
                }
                }
                
                if(indexToRemove!=-1){
                    System.out.printf("%n Kindly enter First Name: ");
                    String firstName = input.nextLine();
                    System.out.printf("%n Kindly enter Last Name: ");
                    String lastName = input.nextLine();
                    
                    contacts[index++].remove(phoneNumber);
                    contacts[index++].remove(firstName);
                    contacts[index].remove(lastName);
                        
                    } else{
                    
                            System.out.printf("%n Phone number already exists!!!");
                    
                    }
        }
        
   }
   
  

