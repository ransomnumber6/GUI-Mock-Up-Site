/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author New
 */
public class Customer 
{
    String newFN, newLN, newAdd, User, newCard, password;
    int coupon, size = 0;
    Customer[] custArry = new Customer[50];
    
    public Customer()
    {
       newFN = "";
       newLN = "";
       newAdd = "";
       User = "";
       newCard = "";
       password = "";
       coupon = 0;
    }
    
    public Customer (String FirstName, String LastName, String card, String address, String username, String psswrd)
    {
        newFN = FirstName;
        newLN = LastName;
        newAdd = address;
        User = username;
        newCard = card;
        password = psswrd;
    }

}


