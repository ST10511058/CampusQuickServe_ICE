package campusquickserve_ice;

import javax.swing.JOptionPane;

public class QuickServeApp {

    public static void main(String[] args) {
    
    String name = JOptionPane.showInputDialog("Customer:");
    String studentNumber = JOptionPane.showInputDialog("Student number:");
    String item = JOptionPane.showInputDialog("Item ordered:");
        
        String quantityText = JOptionPane.showInputDialog("Quantity:");
        int quantity = Integer.parseInt(quantityText);
        
        String priceText = JOptionPane.showInputDialog("Price per item:");
        double price = Double.parseDouble(priceText);
        

    Order myOrder = new Order();
    myOrder.calculateTotal(price, quantity);
    myOrder.calculateDiscount(quantity);
    myOrder.calculateVat();
    myOrder.calculatefinalPrice();
    
    displayReceipt(name, studentNumber, item, quantity, price, myOrder.getTotal(), myOrder.getDiscount(), myOrder.getVat(), myOrder.getfinalPrice());
    }
    
    public static void displayReceipt(String name, String studentNumber, String item, int quantity, double price, double total, double discount, double vat, double finalPrice) {
    
    
    String receiptMessage = "------CAMPUS QUICKSERVE------\n"
                              + "Customer: " + name + "\n"
                              + "Student number: " + studentNumber + "\n"
            
                              + "Item ordered: " + item + "\n"
                              + "Quantity: " + quantity + "\n"
                              + "Price per item: R" + price + "\n"
                              + "Subtotal: R" + total + "\n"
                              + "Discount Applied: R" + discount + "\n"
                              + "VAT(15%): R" + vat + "\n"
                              + "Total: R" + finalPrice + "\n"
                              + "Thank you for your order!" + "\n"
                              + "----------------------------------";
    
    JOptionPane.showMessageDialog(null, receiptMessage);
    
    }
    
}
