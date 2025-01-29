package com.fss;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am the only instance of Singleton!");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();

        Singleton anotherInstance = Singleton.getInstance();

        System.out.println("Are both instances the same? " + (singleton == anotherInstance));
    }
}
