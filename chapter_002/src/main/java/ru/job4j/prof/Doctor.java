package ru.job4j.prof;

public class Doctor extends Profession {

    private String whiteRobe;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Diagnosis heal(Patient patient) {
        return null;
    }
}
