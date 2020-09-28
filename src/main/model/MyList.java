/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.model;

/**
 *
 * @author dekuznetsov
 */
public class MyList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        main<String> list = new main<>();
        list.addToBegin("one");
        list.addToBegin("two");
        list.addToEnd("-one");
        list.addToEnd("-two");
        System.out.println(list);
    }
    
}