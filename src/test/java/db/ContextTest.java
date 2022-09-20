package db;

import futbol.Jugador;
import futbol.RepositorioJugadores;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import java.util.List;

import static org.junit.Assert.*;


public class ContextTest extends AbstractPersistenceTest implements WithGlobalEntityManager{

  private RepositorioJugadores repositorioJugadores;

  @Before
  public void init() {
    repositorioJugadores = new RepositorioJugadores();
    repositorioJugadores.registrar(new Jugador("Carlos", "10"));
    repositorioJugadores.registrar(new Jugador("Juan", "9"));
    repositorioJugadores.registrar(new Jugador("Santi", "1"));
  }
  public Jugador iniciarADani() {
    return new Jugador("Dani", "10");
  }

  @Test
  public void contextUp() {
    assertNotNull(entityManager());
  }

  @Test
  public void contextUpWithTransaction() throws Exception {
    withTransaction(() -> {});
  }

  @Test
  public void testDeCargaInicial() {

    Jugador dani = iniciarADani();

    entityManager().persist(dani);
    assertEquals("Dani", dani.getNombre());
  }

  @Test
  public void deberiaEncontrarAlJugadorPorNombreCantidad() {
    Assert.assertEquals(1, repositorioJugadores.filtrarPorNombre("Juan").size());
  }

  @Test
  public void noDeberiaEncontrarUnJugadorSiNoExiste() {
    Assert.assertEquals(0, repositorioJugadores.filtrarPorNombre("Charin").size());
  }

}
