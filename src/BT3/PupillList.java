/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.ArrayList;

/**
 *
 * @author hoang minh
 */
public class PupillList {
    public static void main(String[] args) {
        ArrayList<Input> list =new ArrayList<>();
        list.add(new Input("001","Nam",19,5,6,8));
        list.add(new Input("002","Tuan",19,5,7,8));
        list.add(new Input("003","Lan",19,9,8,8));
        list.add(new Input("004","Hong",19,5,4,6));
        list.add(new Input("005","Diep",19,9,6,8));
    }
}
