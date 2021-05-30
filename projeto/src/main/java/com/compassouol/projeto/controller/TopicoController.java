package com.compassouol.projeto.controller;

import java.util.List;

import com.compassouol.projeto.model.Topicos;
import com.compassouol.projeto.repository.TopicoRepository;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carros")
public class TopicoController {

	@Autowired
	TopicoRepository TR;

	@GetMapping
	@ApiOperation("Metodo que lista todos os carros")
	public List<Topicos> Listar() {
		return TR.findAll();
	}
    @PostMapping
    @ApiOperation("Metodo que adiciona carros")
	public Topicos cadastrar(@RequestBody Topicos Top) {
		return TR.save(Top);
	}
    
    @GetMapping(params="nome")
    @ApiOperation("Metodo que busca por nome")
    public ResponseEntity<List<Topicos>> getWithFilternome(@RequestParam String nome)
    {
        return new ResponseEntity<List<Topicos>>(TR.findTopicosBynome(nome), HttpStatus.OK);
    }


    @GetMapping(params="marca")
    @ApiOperation("Metodo que busca por marca")
    public ResponseEntity<List<Topicos>> getWithFilterMarca(@RequestParam String marca)
    {
        return new ResponseEntity<List<Topicos>>(TR.findTopicosBymarca(marca), HttpStatus.OK);
    }

    @GetMapping(params="cor")
    @ApiOperation("Metodo que busca por cor")
    public ResponseEntity<List<Topicos>> getWithFilterCor(@RequestParam String cor)
    {
        return new ResponseEntity<List<Topicos>>(TR.findTopicosBycor(cor), HttpStatus.OK);
    }

    @GetMapping(params="maiscaro")
    @ApiOperation("Metodo que busca o mais caro")
    public List<Topicos> Caro(){
        //List<Topicos> //Caro (){ //TR.Caro();
        return TR.Caro();
    }
    @GetMapping(params="maisbarato")
    @ApiOperation("Metodo que busca o mais barato")
    public List<Topicos> Barato (){
        //List<Topicos> //Barato = TR.Barato();
        return TR.Barato();
    }
}

// Revisar o Barato e o Caro