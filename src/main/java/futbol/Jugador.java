package futbol;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Jugador {

  @Id
  @GeneratedValue
  private Long id;
  private String nombre;
  private String psoicion;

  public Jugador(String nombre, String psoicion) {
    this.nombre = nombre;
    this.psoicion = psoicion;
  }

  public Long getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getPsoicion() {
    return psoicion;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPsoicion(String psoicion) {
    this.psoicion = psoicion;
  }
}
