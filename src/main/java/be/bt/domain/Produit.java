package be.bt.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import net.minidev.json.annotate.JsonIgnore;

@Entity
@Table(name="produits")
public class Produit {

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Nom")
	private String nom;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "Prix")
	private BigDecimal prix;
	
	
	@ManyToOne//(fetch = FetchType.EAGER)
	//@JoinColumn(name="categorie-Id") Ne jamais mettre cette ligne !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@JsonBackReference
	private Categorie categorie;
	
	public Produit(){}

	public Produit(String nom, String description, BigDecimal prix, Categorie categorie) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.categorie = categorie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ", categorie="
				+ categorie + "]";
	}
	
}
