package AccesoDatos;

import negocio.Funcionario;

/**
 *
 * @author Sebastian Pavez
 */
public interface DAOFuncionario extends BaseDao<Funcionario> {
    boolean autenticarFuncionario(String id, String contrasenja);
}
