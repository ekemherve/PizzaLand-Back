package be.bt;

import java.math.BigDecimal;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import be.bt.domain.Categorie;
import be.bt.domain.Produit;
import be.bt.repository.ICategoriesRepository;
import be.bt.repository.IProduitsRepository;

@SpringBootApplication
public class PizzaLandBackApplication {

	@Autowired
	IProduitsRepository repoProduit;
	
	@Autowired
	ICategoriesRepository repoCategorie;
	
	public static void main(String[] args) {
		SpringApplication.run(PizzaLandBackApplication.class, args);
	}
	
	/*@Bean
	CommandLineRunner run() {
		
		return args -> {
			
			
			Categorie accompagnement = new Categorie("Accompagnement");
			accompagnement.setProduits(new HashSet<>());
			
			Categorie pizza = new Categorie("Pizza");
			pizza.setProduits(new HashSet<>());
			
			Categorie boisson = new Categorie("Boisson");
			boisson.setProduits(new HashSet<>());
			
			Produit pizzaBarbecue = new Produit("PizzaBarbecue", "Sauce barbecue, fromage, lard fumé, oignon", new BigDecimal(14.5), pizza);
			Produit pizzaSuperSupreme = new Produit("PizzaBarbecue", "Sauce tomate, fromage, poivron, champigon, boeuf, oignon", new BigDecimal(19.5), pizza);
			Produit coca = new Produit("Coca-cola", "Boisson au gout unique de coke. Venez coker !!!!!", new BigDecimal(1.5), boisson);
			Produit fantaOrange = new Produit("Coca-cola", "Boisson au gout d'orange. Que du vrai gout d'oranger!!!!!", new BigDecimal(1.0), boisson);
			Produit pain = new Produit("Pain aux épices", "Pain très épicé et grillé à l'italienne", new BigDecimal(2.5), accompagnement);
			Produit wings = new Produit("Poulet", "Tranches de poulet à la sauce barbecue grillée au four", new BigDecimal(3.5), accompagnement);
			
			accompagnement.getProduits().add(wings);
			accompagnement.getProduits().add(pain);
			
			pizza.getProduits().add(pizzaBarbecue);
			pizza.getProduits().add(pizzaSuperSupreme);
			
			boisson.getProduits().add(coca);
			boisson.getProduits().add(fantaOrange);
			
			repoCategorie.save(accompagnement);
			repoCategorie.save(pizza);
			repoCategorie.save(boisson);
			
			repoProduit.save(pizzaBarbecue);
			repoProduit.save(pizzaSuperSupreme);
			repoProduit.save(coca);
			repoProduit.save(fantaOrange);
			repoProduit.save(wings);
			repoProduit.save(pain);
			
		};
	}*/
	
}
