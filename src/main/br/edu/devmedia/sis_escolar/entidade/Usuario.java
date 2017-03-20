package br.edu.devmedia.sis_escolar.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;
	
	@Column 
	private String login;
	
	@Column
	private String senha;

	
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public Integer getId(){
		return id;
	}
	
	public String getLogin(){
		return login;
	}
	
	public String getSenha(){
		return senha;
	}
	
}

