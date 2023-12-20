
package ex10_2_exercise;

public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        if (custType == 'N' && total > 900) {
            discount = 0.1 * 100;
        }
        else if (custType == 'N' && !(total > 900)) {
            discount = 0.05 * 100;
        }
        else if (custType == 'P' && total > 900) {
            discount = 0.07 * 100;
        }
        else if (custType == 'C' && total > 500) {
            discount = 0.08 * 100;
        } 
        else if (custType == 'C' && !(total > 500)) {
            discount = 0.05 * 100;
        }
        else {
            discount = 0.0 * 100;
        }
   }
}
