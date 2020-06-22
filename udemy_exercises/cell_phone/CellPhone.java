package udemy_exercises.cell_phone;
import java.util.ArrayList;

class CellPhone {
    
    private String PhoneNumber;
    private ArrayList<Contact> ContactList;
    private ArrayList<Double> transactions;
    
    public MobilePhone(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
        this.ContactList = new ArrayList<Contact>();
    }
    
    public boolean addContact(Contact contact) {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }

        ContactList.add(contact);
        return true;
    }

    private int printContact(Contact contact); {
        return this.ContactList.indexOf(Contact);
    }

    private int printContact(String name)
        for (int i=0; i < this.ContactList.size(); i++) {
            Contact contact = this.ContactList.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
            return -1;
    }

    public void showContacts() {
            system.out.println("Contacts: ");
            for (int i =  0; i < this.ContactList.size(); i++) {
                System.out.println((i+1) + this.ContactList.get(i).getName() + " : " + this.ContactList.get(i).getPhoneNumber());
            }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
            int found = findContact(oldContact);
            if (found < 0) {
                System.out.println(oldContact.getName() + " was not found.");
                return false;
            }
            this.ContactList.set(found, newContact);
            System.out.pritln(oldContact.getName() + " was updated to " + newContact.getName());
            return true;
    }

    public String searchContact(Contact contact) {
            if (findContact(contact) >= 0) {
                return contact.getName();
            }
            return null;

    }

    public boolean removeContact(Conatact contact) {
            int found = findContact(oldContact);
            if (found < 0) {
                System.out.println(oldContact.getName() + " was not found.");
                return false;
        }
            this.ContactList.remove(found);
            System.out.println(contact.getName() + " deleted.");
                return true;
    }

    quit() {
            system.exit(0);
    }

}

/*
**Cell Phone with Java Classes**
    - **CellPhone Class:**
        - Contact List
        - quit()
        - showContacts()
        - addContact()
        - updateContat()
        - removeContact()
        - searchContact()
      * **When adding or updating be sure to check if the contact already exists**
      * **Be sure not to expose the inner workings of the Arraylist to MobilePhone (use concepts of encapsulation to meet this requirement)**
*/
