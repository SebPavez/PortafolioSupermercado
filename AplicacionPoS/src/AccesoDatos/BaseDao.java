package AccesoDatos;

/**
 *
 * @author Sebastian Pavez
 */
public interface BaseDao<T> {
    public boolean agregar();
    public T buscar();
    public boolean actualizar();
    public boolean eliminar();
}
