package cl.desafiolatam.servicioControlDestinos.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name="SQ_DESTINO", initialValue=1, allocationSize=1)
public class Destino {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,
	generator="SQ_DESTINO")
	@Column(unique = true, nullable = false)
	private Integer id;
	private String ciudad;
	private String pais;
	private String fecha;

	@ManyToOne()
	@JoinColumn(name = "id_pasajero")
	private Pasajero pasajero;

	@Override
	public String toString() {
		return "Destino [id=" + id + ", ciudad=" + ciudad + ", pais=" + pais + ", fecha=" + fecha + "]";
	}

}
