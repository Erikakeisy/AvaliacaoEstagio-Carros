package com.compassouol.projeto.repository;

import java.util.List;
import com.compassouol.projeto.model.Topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicoRepository extends JpaRepository<Topicos,String> {
    List<Topicos> findTopicosBynome(String nome);

    List<Topicos> findTopicosBymarca(String marca);

    List<Topicos> findTopicosBycor(String cor);
    
    @Query
    ("SELECT T FROM Topicos T WHERE valor=(SELECT MAX(valor) FROM Topicos)")
    List<Topicos> Caro();

    @Query
    ("SELECT T FROM Topicos T WHERE valor=(SELECT MIN(valor) FROM Topicos)")
    List<Topicos> Barato();
	

}