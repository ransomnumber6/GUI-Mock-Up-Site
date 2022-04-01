/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author New
 */
public class Customer extends User {
    private String username,
            email,
            creditCard, address, password;
    double coupon = 0.00;

    /*public void Login();
    public void createAccount();
    public void setCustomerInfo(String name, String address, String cardNumber);
    public bool getCustomerInfo();
    public bool hasCoupon();*/
    public Customer()
    {
       firstName = null;
       lastName = null;
       address = null;
       username = "nothing";
       password = "nothing";
       creditCard = null;
       coupon = 0;
    }
    
    public Customer (String FirstName, String LastName, String card, String address, String username, String psswrd)
    {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.address = address;
        this.username = username;
        this.creditCard = card;
        this.password = psswrd;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public String getCreditCard(){
        return creditCard;
    }
    public void setCreditCard(String newCreditCard){
        this.creditCard = newCreditCard;
    }
    
    public void setCoupon(String coupon)
    {
        this.coupon = Integer.parseInt(coupon); 
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getAddress()
    {
        return address;
    }
    public boolean hasCoupon(Customer cust)
    {
        if (cust.coupon != 0)
            return true;
        else
            return false;
    }
    
    // sets customer information 
    public Customer createAcc(String FN, String LN, String Card, String Address, String Email, String Password, String Username)
    {
        Customer newCustomer = new Customer();
        newCustomer.firstName = FN;
        newCustomer.lastName = LN;
        newCustomer.setEmail(Email);
        newCustomer.setCreditCard(Card);
        newCustomer.setAddress(Address);
        newCustomer.setPassword(Password);
        newCustomer.setUsername(Username);
        return newCustomer;
    }
}


