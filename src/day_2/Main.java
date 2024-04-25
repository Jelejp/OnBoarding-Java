package day_2;

import day_2.models.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setFirstName("Jelena");
        persona1.setLastName("Palavecino");
        persona1.setIdentityCard("460555");
        persona1.setAge(19);
        persona1.setHeight(1.61);
        persona1.setMarried(false);
        persona1.setPetsNames(new String[]{"Luna", "Loqui", "Negro"});
        System.out.println(persona1);
        persona1.present();

        Persona persona2 = new Persona();

        persona2.setFirstName("Emanuel");
        persona2.setLastName("Martinez");
        persona2.setIdentityCard("425005");
        persona2.setAge(23);
        persona2.setHeight(1.75);
        persona2.setMarried(true);
        persona2.setPetsNames(new String[]{});
        persona2.present();

    }
}