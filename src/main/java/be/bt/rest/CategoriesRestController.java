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

import be.bt.domain.Categorie;
import be.bt.repository.ICategoriesRepository;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*")
public class CategoriesRestController {

	@Autowired
	ICategoriesRepository repo;
	
	@GetMapping
	public List<Categorie> retourneCategories(){
		
		return repo.findAll();
	}
	
	/*@GetMapping("/{id}")
	public ResponseEntity<Categorie> retourneCategorieParId(@PathVariable Long id){
		
		Optional<Categorie> optional = repo.findById(id);
		
		return optional == null ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
								: new ResponseEntity<Categorie>(optional.get(), HttpStatus.ACCEPTED);
	}*/
}
