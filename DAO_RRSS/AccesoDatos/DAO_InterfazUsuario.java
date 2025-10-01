
package AccesoDatos;

import Modelo.Usuario;
import java.util.ArrayList;
import java.util.HashMap;


public interface DAO_InterfazUsuario {
    public abstract boolean alta (Usuario us);
    public abstract boolean baja (Usuario us);
    public abstract Usuario buscar(int id);
    public abstract boolean modificar (Usuario us);
    public abstract ArrayList<Usuario> listar();
    public abstract HashMap<String, Integer> gentuzaPaisajil();
    public abstract ArrayList<Usuario> filtrar();
}
