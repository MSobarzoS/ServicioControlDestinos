package cl.desafiolatam.servicioControlDestinos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name="SQ_PASAJERO", initialValue=1, allocationSize=1)
public class Pasajero {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,
	generator="SQ_PASAJERO")
	@Column(unique = true, nullable = false)
	private Integer id;
	private String rut;
	private String nombre;
	private String apellido;
	private String edad;
	private String ciudadNatal;
	
	@OneToMany(mappedBy = "pasajero", fetch = FetchType.LAZY)
	private List<Destino> destino;
	
}
