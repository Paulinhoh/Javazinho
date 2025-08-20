package edu.cursos.devdojo.javacore.M_interface.domain;

public interface DataLoader {
    // all attributes in a interface is < public static final >
    public static final int MAX_DATA_SIZE = 10;

    // all methods in a interface is < public abstract >, so you don't need write this
    public abstract void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
