package futbol;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Formacion {

  @Id
  @GeneratedValue
  private Long id;
  private Long goles;
  @ManyToMany
  private List<Jugador> jugadores = new ArrayList<>();
  @ManyToOne
  private Equipo equipo;

  public Long getGoles() {
    return goles;
  }

  public List<Jugador> getJugadores() {
    return jugadores;
  }

  public Equipo getEquipo() {
    return equipo;
  }

  public void setGoles(Long goles) {
    this.goles = goles;
  }

  public void setJugadores(List<Jugador> jugadores) {
    this.jugadores = jugadores;
  }

  public void setEquipo(Equipo equipo) {
    this.equipo = equipo;
  }
}
