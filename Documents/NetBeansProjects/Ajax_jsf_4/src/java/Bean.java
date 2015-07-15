/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Deniz
 */
@ManagedBean(name="bean")
@RequestScoped
public class Bean {
    private String page;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public Bean() {
    }
     @PostConstruct
     public void init() {
         page = "include1.xhtml"; //  Default include.
     }

    
    public String getPage()
    {
      return page;
    }
    
    public void setPage(String page)
    {
        
      this.page=page;
    }
    
}
