package futbol;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Partido {

  @Id @GeneratedValue
  private Long id;
  @OneToMany
  private Formacion local;
  @OneToMany
  private Formacion visitante;
  @ManyToOne
  @OrderColumn(name = "goleadores")
  private List<Jugador> goleadores = new ArrayList<>();

  public Formacion getLocal() {
    return local;
  }

  public Formacion getVisitante() {
    return visitante;
  }

  public List<Jugador> getGoleadores() {
    return goleadores;
  }

  public void setLocal(Formacion local) {
    this.local = local;
  }

  public void setVisitante(Formacion visitante) {
    this.visitante = visitante;
  }

  public void setGoleadores(List<Jugador> goleadores) {
    this.goleadores = goleadores;
  }
}
