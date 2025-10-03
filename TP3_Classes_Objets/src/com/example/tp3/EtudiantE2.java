package com.example.tp3;

public class EtudiantE2 {
    private static int compteur = 0;
    private final int id;
    private String nom;
    private String prenom;
    private Filiere filiere;

    public EtudiantE2(String nom, String prenom) {
        this.id = ++compteur;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void setFiliere(Filiere f) { this.filiere = f; }
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public Filiere getFiliere() { return filiere; }

    @Override
    public String toString() {
        String fil = (filiere != null) ? filiere.getNom() : "Aucune";
        return "Etudiant[id=" + id +
                ", nom=" + nom +
                ", prenom=" + prenom +
                ", filiere=" + fil +
                "]";
    }
}
