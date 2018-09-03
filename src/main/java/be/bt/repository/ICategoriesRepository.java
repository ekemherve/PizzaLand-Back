package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.bt.domain.Categorie;

public interface ICategoriesRepository extends JpaRepository<Categorie, Long> {

}
