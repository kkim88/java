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
        
    }
    
    public static searchContact() {
        
    }
    
    public static removeContact() {
        
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
