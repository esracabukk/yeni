/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emine.ejbDeneme;


import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ComanTEAM
 */
@Remote
public interface NewSessionBeanRemote {
    void addBook(String bookName);
    List getBooks();
}
