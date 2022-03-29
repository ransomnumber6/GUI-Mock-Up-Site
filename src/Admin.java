/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author New
 */
public class Admin extends User
{
    private String username, password, address;
    int coupon;
    Admin()
    {
        firstName = "Bob";
        lastName = "Short";
        address = "55 W Gurley St";
        username = "admin";
        password = "BOSS";
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String newUsername)
    {
        this.username = newUsername;
    }
    
    public void setCoupdon(int coupon)
    {
        this.coupon = coupon;
    }
    
    public void sendCoupon(Customer person)
    {
        person.coupon = coupon;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getAddress()
    {
        return address;
    }
    
}
