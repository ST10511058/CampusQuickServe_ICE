package campusquickserve_ice;



public class Order {
    private double total;
    public void calculateTotal(double price, int quantity){
        total = price * quantity;
    }
    
    public double getTotal(){
        return total;
    }
    
    private double discount;
    public void calculateDiscount(int quantity){
        if(quantity > 3){
            discount = total * 0.10;
        }else{
            discount = 0;
        }
    }

    public double getDiscount(){
        return discount;
    }
    
    private double vat;
    public void calculateVat(){
        vat = (total - discount) * 0.15;
    }
    
    public double getVat(){
       return vat;
    }
    
    private double finalPrice;
    public void calculatefinalPrice(){
        finalPrice = (total - discount) + vat;
    }
    
    public double getfinalPrice(){
        return finalPrice;
    }
    
     
}

     

