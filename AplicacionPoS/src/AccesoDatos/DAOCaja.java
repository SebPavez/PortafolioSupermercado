package AccesoDatos;

import negocio.Caja;

/**
 *
 * @author Sebastian Pavez
 */
public interface DAOCaja extends BaseDao<Caja> {
    boolean abrirCaja(Caja dao);
    boolean cerrarCaja(int idCaja);
}
