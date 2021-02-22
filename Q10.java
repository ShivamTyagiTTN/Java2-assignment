//10. Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below

class Customer{

    
    private String name;
    private String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    void waitForCoffee() {

    }
    void collectCoffee() {

    }
}
class Barista{
    
    Order order;
    private int empID;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    void prepareCoffee(int order_id){
    }
    
    void addOrderToCompleteQueue(int order_id) {

    }
    String notifyOrderComplete(int order_id) {

    }
}
class Order
{
    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    private int order_id;
    private String coffeeType;
}

class Cashier
{
    private String name;
    private int empId;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}


