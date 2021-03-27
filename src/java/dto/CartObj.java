/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class CartObj implements Serializable{
    private String customerName;
    private HashMap<String,BookDTO> cart;

    public HashMap<String, BookDTO> getCart() {
        return cart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CartObj() {
        this.customerName="GUEST";
        this.cart=new HashMap<>();
    }

    public CartObj(String customerName) {
        this.customerName = customerName;
        this.cart= new HashMap<>();
    }
    
    public void AddToCart(BookDTO dto) throws Exception{
        if(this.cart.containsKey(dto.getId()))
        {
            int quatity =this.cart.get(dto.getId()).getQuantity() + 1; //neu co lay so luong trong gio hang tang len 1
            dto.setQuantity(quatity);
        }
        this.cart.put(dto.getId(), dto);
    }
    
    public float getTotal() throws Exception
    {
        float result = 0;
        for(BookDTO dto : this.cart.values())
        {
            result += dto.getQuantity() * dto.getPrice();
        }
        return result;
    }
    
    public void remove(String id) throws Exception
    {
        if(this.cart.containsKey(id))
        {
            this.cart.remove(id);
        }
    }
    public  void update(String id, int quantity) throws Exception
    {
        if(this.cart.containsKey(id))
        {
            this.cart.get(id).setQuantity(quantity);
        }
    }
}
