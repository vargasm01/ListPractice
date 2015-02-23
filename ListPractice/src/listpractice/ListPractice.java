/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MVargas
 */
public class ListPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("Moe");
        stringList.add("Larry");
        stringList.add("Curly");

        System.out.println(stringList.size());
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));

        stringList.set(0, "John");
        stringList.remove(1);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        for (String name : stringList) {
            System.out.println(name);
        }
        //todo: extra credit, two other forms to print list
    }

}
