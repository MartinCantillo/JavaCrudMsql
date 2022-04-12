/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import EntidadPersona.EntidadPersona;

/**
 *
 * @author marti
 */
public interface InterfacePersona {
    
    public void Insertar( EntidadPersona persona);

    public void modificar(EntidadPersona persona);

    public void buscar(EntidadPersona persona);
    
    public void Eliminar(EntidadPersona persona);
}
