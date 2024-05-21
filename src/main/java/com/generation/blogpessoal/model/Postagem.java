package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "tb_postagens")
@Data
public class Postagem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank(message = "O atributo titule e obrigatorio!")
	@Size(min = 5, max = 100, message = "o titulo deve ter no minimo 5 caracteres"  )
	private String titulo;
	
	@NotBlank(message = "O atributo texto e obrigatorio!")
	@Size(min = 10, max = 1000, message = "o texto deve ter no minimo 10 caracteres"  )
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;

}
