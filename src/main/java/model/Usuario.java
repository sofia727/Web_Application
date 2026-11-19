package model;

import java.time.LocalDate;

public class Usuario {
	
	private int id;
	private String nome;
	public String email;
	public String senha;
	private LocalDate data_publicacao;
	
	
	public LocalDate getData_publicacao() {
		return data_publicacao;
	}


	public void setData_publicacao(LocalDate data_publicacao) {
		this.data_publicacao = data_publicacao;
	}


	public Usuario() {
		
	}


	public Usuario(int id, String nome, String email, LocalDate data_publicacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.data_publicacao = data_publicacao;
	}



	public Usuario(String nome, String email, String senha, LocalDate data_publicacao) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.data_publicacao = data_publicacao;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
	
}
