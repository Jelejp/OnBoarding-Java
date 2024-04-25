package day_2.models;

import java.util.Arrays;
//propiedades
public class Persona {
    private String firstName;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private String[] petsNames;

//constructores
    public Persona() {
    }
    public Persona(String firstName, String lastName, String identityCard, int age, double height, boolean married, String[] petsNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsNames = petsNames;
    }
//getter y setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String[] getPetsNames() {
        return petsNames;
    }

    public void setPetsNames(String[] petsNames) {
        this.petsNames = petsNames;
    }

//metodos
    public void present(){
        System.out.println("Presentación de " + firstName + ":");
        System.out.println("Hola! Mi nombre es " + this.firstName + " " + this.lastName);
        System.out.println("Tengo " + this.age + " " + "años" + " " + "y mido" + " " + this.height + " " + "metros de altura.");
        System.out.println(married ? "Estoy casado/a" : "No estoy casado/a");
        System.out.println("Mi DNI es: " + identityCard);
        if(petsNames.length > 0) {
            System.out.println("Mis mascotas se llaman:");
            for(String petName : petsNames){
                System.out.println("-" + petName);
            }
        }else{
            System.out.println("No tengo Mascotas.");
        }

    }

    @Override
    public String toString() {
        return "Persona{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", petsNames=" + Arrays.toString(petsNames) +
                '}';
    }
}