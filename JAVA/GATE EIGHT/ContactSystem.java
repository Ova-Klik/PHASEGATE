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
        input.nextLine();
        
        switch(option){
        
            case 0-> {
                        System.out.printf("Thank you for using Contact Log System...%n%n");
                        System.exit(0);
            }
            case 1-> handleAddContact(contacts);
            case 2-> handleRemoveContact(contacts);
//            case 3-> findContactByPhoneNumber(contacts);
//            case 4-> findContactByFirstName(firstName);
//            case 5-> findContactByLastName(lastName);
//            case 6-> editContact();
            default-> System.out.printf("Invalid input!!, Try again");
            
        }
        
   }  
   }
   
   public ArrayList<String> handleAddContact(ArrayList<String> contacts){
   
        System.out.printf("%n Kindly enter Phone Number: ");
        String phoneNumber = input.nextLine();
        
        int indexOfExistingPhoneNumbers=-1;
        for(int index=0; index<contacts.size(); index++){
                if(contacts.get(index).equals(phoneNumber)){
                    
                    indexOfExistingPhoneNumbers = index;
                    break;
                }
                }
                
                if(indexOfExistingPhoneNumbers==-1){
                   
                    System.out.printf("%n Kindly enter First Name: ");
                    String firstName = input.nextLine();
                    System.out.printf("%n Kindly enter Last Name: ");
                    String lastName = input.nextLine();
                
                    addContact(firstName,
                                lastName,
                                phoneNumber,
                                contacts
                                );
                    System.out.printf("%nContact Added Successfully!!!");   
                    return contacts;                  
                
                }else{
                    
                    System.out.printf("%nPhone Number already exists in log!!!");
                    return contacts;
                      
            }
        }
        
        
    public void handleRemoveContact(ArrayList<String> contacts){
   
        System.out.printf("%n Kindly enter Phone Number: ");
        String phoneNumber = input.nextLine();
        
        int indexToRemove = -1;
        
        for(int index=0; index<contacts.size(); index++){
            if(contacts.get(index).equals(phoneNumber)){
                
                indexToRemove = index;
                break;
            }
            }
            
            if(indexToRemove!=-1){
                indexToRemove++;
                String firstName = contacts.get(indexToRemove++);
                String lastName = contacts.get(indexToRemove);
                
                removeContact(firstName,
                            lastName,
                            phoneNumber,
                            contacts
                            );
                                
                     System.out.printf("%n Contact removed successfully!!%n");
         }else{
                     System.out.printf("%n No contact to remove!!");
                    
         }
         }
         
   public ArrayList<String> addContact(
                            String firstName,
                            String lastName, 
                            String phoneNumber, 
                            ArrayList<String> contacts){

        contacts.add(phoneNumber);
        contacts.add(firstName);
        contacts.add(lastName);
           
        return contacts;
    }
    public ArrayList<String> removeContact(
                                String firstName,
                                String lastName, 
                                String phoneNumber,
                                ArrayList<String> contacts){
   
        
        contacts.remove(phoneNumber);
        contacts.remove(firstName);
        contacts.remove(lastName);
            
        return contacts;    
     } 
        
   }
   
  

