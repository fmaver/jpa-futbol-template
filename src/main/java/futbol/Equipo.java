package futbol;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipo {

  @Id
  @GeneratedValue
  private Long id;
  private String nombre;
  private Long cantidadAficionados;

  public String getNombre() {
    return nombre;
  }

  public Long getCantidadAficionados() {
    return cantidadAficionados;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCantidadAficionados(Long cantidadAficionados) {
    this.cantidadAficionados = cantidadAficionados;
  }
}
