
package com.iudigital.gestionfuncionario.controller;

import com.iudigital.gestionfuncionario.data.FuncionarioDao;
import com.iudigital.gestionfuncionario.domain.Funcionario;
import java.sql.SQLException;
import java.util.List;

public class FuncionarioController {
    private final FuncionarioDao funcionarioDao;
    public FuncionarioController() {
        
        funcionarioDao = new FuncionarioDao(); 
    }
    
    public List<Funcionario> obtenerFuncionarios() throws SQLException {
        return funcionarioDao.obteneFuncionarios();
    }
    
    public void crear(Funcionario funcionario) throws SQLException {
        funcionarioDao.crear(funcionario);
    }
    
    public Funcionario obtenerFuncionario(int IDFUNCIONARIOS) throws SQLException {
        return funcionarioDao.obtenerFuncionario(IDFUNCIONARIOS);
    }
    
    public void actualizarFuncionario(int IDFUNCIONARIOS, Funcionario funcionario) throws SQLException {
        funcionarioDao.actualizarFuncionario(IDFUNCIONARIOS, funcionario);
    }
    
    public void eliminarFuncionario(int IDFUNCIONARIOS) throws SQLException {
        funcionarioDao.eliminarfuncionario(IDFUNCIONARIOS);
    }

    public List<Funcionario> obtenerFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void actualizarFuncionario(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
  