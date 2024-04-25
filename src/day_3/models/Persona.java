package day_3.models;

import java.util.HashSet;
import java.util.Set;

//propiedades
public class Persona {
    private String firstName;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private Set<Pet> pets;

    //constructores
    //polimorfismo de sobrecarga
    public Persona() {
    }

    public Persona(String firstName, String lastName, String identityCard, int age, double height, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.pets = new HashSet<>();
    }
    //getters y setters

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

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }


    //metodos propios
    public void addMascota (Pet pet){
        pet.setPersona(this);
        this.pets.add(pet);
    }
    public void present(){
        System.out.println("Presentación de " + firstName + ":");
        System.out.println("Hola! Mi nombre es " + this.firstName + " " + this.lastName);
        System.out.println("Tengo " + this.age + " " + "años" + " " + "y mido" + " " + this.height + " " + "metros de altura.");
        System.out.println(married ? "Estoy casado/a." : "No estoy casado/a.");
        System.out.println("Mi DNI es: " + this.identityCard + ".");
            System.out.println("Mis mascotas son:");
            for(Pet pet : pets) {
                System.out.println("-" + pet.getName() + " " + "es un " + pet.getType() + " " + "y tiene " + pet.getAge() + " " + "años");
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
                ", pets=" + pets +
                '}';
    }

}

