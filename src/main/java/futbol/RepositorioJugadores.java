package futbol;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import java.util.List;

public class RepositorioJugadores implements WithGlobalEntityManager {

  public void registrar(Jugador jugador) {
    entityManager().persist(jugador);
  }

  public List<Jugador> todos() {
    return entityManager()
        .createQuery("from futbol.Jugador")
        .getResultList();
  }

  public List<Jugador> filtrarPorNombre(String nombre) {
    return entityManager()
        .createQuery("from futbol.Jugador where nombre = :nombre")
        .setParameter("nombre", nombre)
        .getResultList();
  }

}
