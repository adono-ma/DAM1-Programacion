/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Modelo.MyException;
import Modelo.RedSocial;
import Modelo.Suscripcion;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author ixche
 */
public interface DAO_InterfazSuscripcion {
    public abstract boolean suscribir(Usuario usr, RedSocial rs) throws MyException;
    public abstract boolean desuscribir(Usuario usr, RedSocial rs);
    public abstract boolean desuscribir_todo(Usuario usr);
    public abstract ArrayList<RedSocial> obtener_rsUsr(Usuario usr);
    public abstract ArrayList<Usuario> obtener_usrRs (RedSocial rs);
    public abstract ArrayList<Suscripcion> obtener_suscriptores();
    
    //public void obtener_suscripciones();
}
