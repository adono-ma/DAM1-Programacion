
package DAO;

import com.sun.jdi.connect.spi.Connection;

public class JDBCUsuarioDAO {
    
    public void conectar(Connection con) {
        
    }
    
    public void buscar(){
        /*
        select asterisco from usuarios
        el result-set se itera con el while
        .next funciona como los cursores, es un fetch, como solo hay 1 resultado,
        se one resultset.next directamente y a tirar.
        con el usr.get pues ya te saca el id que sea.
        
        */
    }
    
    public void listarUsuarios(){
        /*
        el listar lo mete en un arraylist
        */
    }
    
    public void accesoADatos_DAO(){
        
    }
    
    public void cerrarConexion() {
        /*
        se hace aquí el exception para que cierre la conexión al final de todas las operaciones
                
        */
    }
    
}
