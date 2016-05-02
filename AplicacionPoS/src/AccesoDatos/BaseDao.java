package AccesoDatos;

/**
 *
 * @author Sebastian Pavez
 */
public interface BaseDao<T> {
    public boolean agregar(T dto);
    public T buscar(String id);
    public boolean actualizar(T dto);
    public boolean eliminar(int id);
}
