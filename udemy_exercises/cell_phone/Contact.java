package udemy_exercises.cell_phone;

class Contact {
    
    // contact name and phone number
    
    private String name;
    private String pnum;
    
    public Contact(String name, String pnum) {
        this.name = name;
        this.pnum = pnum;
        
    }
    
    public static saveContact(String name, String pnum) {
        return new Contact(name, pnum);
    }
    
    public static modifyContact() {

        int found = findContact(oldContact);
        if (found < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.ContactList.set(found, newContact);
        System.out.pritln(oldContact.getName() + " was updated to " + newContact.getName());
        return true;
        
    }
    
    public static searchContact() {

        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;

    }
    
    public static removeContact() {

        int found = findContact(oldContact);
        if (found < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.ContactList.remove(found);
        System.out.println(contact.getName() + " deleted.");
        return true;
        
    }

}


/*
    - **Contact Class:**
        - Name
        - Phone number
        - saveContact()
        - modifyContact()
        - searchContact()
        - removeContact()
*/
