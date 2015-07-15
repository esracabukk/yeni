/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emine.ejbDeneme;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author ComanTEAM
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote {

    List<String> bookShelf;

    public NewSessionBean() {
        bookShelf=new ArrayList<String>() {};
    }
    
    @Override
    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }

    @Override
    public List getBooks() {
        return bookShelf;
   }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
