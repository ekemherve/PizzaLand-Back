package be.bt.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.bt.domain.Produit;
import be.bt.repository.IProduitsRepository;

@RestController
@RequestMapping("/produits")
@CrossOrigin(origins = "*")
public class ProduitsRestController {

	@Autowired
	IProduitsRepository repo;
	
	@GetMapping
	public List<Produit> retourneProduits(){
		
		return repo.findAll();
	}
	
	/*@GetMapping("/{id}")
	public ResponseEntity<Produit> retourneProduitParId(@PathVariable Long id){
		
		Optional<Produit> optional = repo.findById(id);
		
		return optional == null ? new ResponseEntity<Produit>(HttpStatus.NOT_FOUND)
								: new ResponseEntity<Produit>(optional.get(), HttpStatus.ACCEPTED);
	}*/
}
