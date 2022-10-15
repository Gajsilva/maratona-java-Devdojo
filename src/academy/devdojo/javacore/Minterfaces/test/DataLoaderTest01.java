package academy.devdojo.javacore.Minterfaces.test;

import academy.devdojo.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        databaseLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
