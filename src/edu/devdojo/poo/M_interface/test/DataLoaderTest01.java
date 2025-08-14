package edu.devdojo.poo.M_interface.test;

import edu.devdojo.poo.M_interface.domain.DataLoader;
import edu.devdojo.poo.M_interface.domain.DatabaseLoader;
import edu.devdojo.poo.M_interface.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader dataBaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        dataBaseLoader.remove();
        fileLoader.remove();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
