package ex09_1_exercise;


public class Customer {
    public String name;
    public String ssn;
   
    // Encapsulate this class.  Make ssn read only.
    public String geName() {
        return name;
    }
    
    public void setName (String n) {
        name = n;
    }
    
    public String getSsn() {
        return ssn;
    }
}
