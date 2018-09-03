package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.bt.domain.Produit;

public interface IProduitsRepository extends JpaRepository<Produit, Long>{

}
