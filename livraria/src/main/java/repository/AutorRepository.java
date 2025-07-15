package com.example.livraria.repository;

import com.example.livraria.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    @Query("SELECT a FROM Autor a WHERE (:ano BETWEEN YEAR(a.dataNascimento) AND YEAR(a.dataFalecimento)) OR " +
           "(:ano >= YEAR(a.dataNascimento) AND a.dataFalecimento IS NULL)")
    List<Autor> findAutoresVivosNoAno(@Param("ano") int ano);
}