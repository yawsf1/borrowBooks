import java.time.LocalDate;

public class Book {
    private String nom;
    private LocalDate dateEmprunt;
    private LocalDate dateRetour;
    private int quantite;
    private double prix;
    private double total;

    public Book(String nom, LocalDate dateEmprunt, int quantite, LocalDate dateRetour, double prix) {
        this.setNom(nom);
        this.setDateEmprunt(dateEmprunt);
        this.setQuantite(quantite);
        this.setDateRetour(dateRetour);
        this.setPrix(prix);
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public int getQuantite() {
        return quantite;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public double getTotal() {
        total = prix * getQuantite();
        return total;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void afficherLivreChoisi() {
        System.out.println("Le livre choisi est : " + getNom() + ", emprunté le " + getDateEmprunt());
        System.out.println("Quantité : " + getQuantite() + ", à retourner le " + getDateRetour());
        System.out.printf("Le total est : %.2f MAD\n", getTotal());
    }

}
