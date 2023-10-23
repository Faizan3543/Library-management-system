package in.pwskills.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity     //for this u have to add sping data jpa 
@Table(name = "book")   
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;  //this is to br written in order to implements serializable 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	@Column(name = "AUTHOR",length = 20)
	private String author;
	@Column(name = "NAME",length = 20)
	private String name;
	
	
	public Book() {
		
	}
	
	public Integer getId() {
		System.out.println("Book.getId()");
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
		System.out.println("Book.setId()");
	}
	public String getAuthor() {
		System.out.println("Book.getAuthor()");
		return author;
		}
	public void setAuthor(String author) {
		this.author = author;
		System.out.println("Book.setAuthor()");
	}
	public String getName() {
		System.out.println("Book.getName()");
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Book.setName()");
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", name=" + name + "]";
	}
	
	
}
