package org.sparkfiregames.chemdata;


public class DataManagerSingleton {
    private static DataManagerSingleton instance;
    private DataManager dataManager;

    private DataManagerSingleton() {
        dataManager = new DataManager();
    }

    public static DataManagerSingleton getInstance() {
        if (instance == null) {
            instance = new DataManagerSingleton();
        }
        return instance;
    }
}
