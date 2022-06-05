/*
 * @created 28/052022 - 19:16
 * @project Car-Rental_Project
 * @author Johnny Carvalho
 */

package com.company;

import java.util.ArrayList;

public class List extends Register {

    ArrayList list = new ArrayList();



    public List(ArrayList list) {
        this.list = list;
    }
    @Override
    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
