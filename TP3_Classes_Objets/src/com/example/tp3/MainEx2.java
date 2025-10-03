package com.example.tp3;

public class MainEx2 {
    public static void main(String[] args) {
        Filiere info = new Filiere("Informatique");
        Filiere genie = new Filiere("Génie Civil");

        EtudiantE2 e1 = new EtudiantE2("El Idrissi", "Mohamed");
        EtudiantE2 e2 = new EtudiantE2("Bentaleb", "Fatima");
        EtudiantE2 e3 = new EtudiantE2("Chouaib", "Youssef");
        EtudiantE2 e4 = new EtudiantE2("Lahlou", "Salma");
        EtudiantE2 e5 = new EtudiantE2("Roussafi", "Hassan");
        EtudiantE2 e6 = new EtudiantE2("Amrani", "Aïcha");

        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        info.ajouterEtudiant(e6);

        genie.ajouterEtudiant(new EtudiantE2("Belkahia", "Khadija"));
        genie.ajouterEtudiant(new EtudiantE2("Laaroussi", "Walid"));

        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();

        System.out.println("Détail de e3 : " + e3);
    }
}
