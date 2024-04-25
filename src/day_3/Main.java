package day_3;

import day_3.models.Persona;
import day_3.models.Pet;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Jelena", "Palavecino", "4650", 19, 1.61, false);
        Pet pet1 = new Pet("Luna", PetType.PERRA, 10);
        Pet pet2 = new Pet("Loqui", PetType.LORO,11);
        Pet pet3 = new Pet("Negro", PetType.PERRO, 11);
        persona1.addMascota(pet1);
        persona1.addMascota(pet2);
        persona1.addMascota(pet3);
        persona1.present();

        Persona persona2 = new Persona("Emanuel", "Martinez", "4250", 23, 1.75, true);
        Pet pet1Per2 = new Pet("Firu", PetType.PEZ, 5);
        persona2.addMascota(pet1Per2);
        persona2.present();

    }
}
