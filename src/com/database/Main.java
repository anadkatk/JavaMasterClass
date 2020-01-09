package com.database;

import com.database.model.Datasource;

public class Main {

    public static void main(String[] args) {
        com.database.model.Datasource datasource = new com.database.model.Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        datasource.close();
    }
}
