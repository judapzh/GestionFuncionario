
package com.iudigital.gestionfuncionario.data;

import com.iudigital.gestionfuncionario.domain.Funcionario;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.iudigital.gestionfuncionario.util.ConnectionUtil;
import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

public class FuncionarioDao {
    
private static final String GET_FUNCIONARIOS = "SELECT* FROM TBLFUNCIONARIOS";

private static final String CREATE_FUNCIONARIOS = "INSERT INTO TBLFUNCIONARIOS (TIPOIDENTIFICACION, IDENTIFICACION, NOMBRES, APELLIDOS, ESTADOCIVIL, FKIDGENERO, DIRECCION,TELEFONO, FECHANACIMIENTO) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

private static final String GET_FUNCIONARIO_BY_ID = "SELECT* FROM TBLFUNCIONARIOS where IDFUNCIONARIOS = ?";

private static final String UPDATE_FUNCIONARIOS = "update TBLFUNCIONARIOS set TIPOIDENTIFICACION=?, IDENTIFICACION=?, NOMBRES=?, APELLIDOS=?, ESTADOCIVIL=?, FKIDGENERO=?, DIRECCION=?, TELEFONO=?, FECHANACIMIENTO=?, FKIDUNIVERSIDAD=?, FKIDNIVELESTUDIO=?, FKIDTITULOESTUDIO=? where IDFUNCIONARIOS = ?";

private static final String DELETE_FUNCIONARIOS = "delete FROM TBLFUNCIONARIOS where Id = ?";

public List<Funcionario> obteneFuncionarios() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIOS);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                Funcionario funcionario = new Funcionario();
                funcionario.setIDFUNCIONARIOS(resultSet.getInt("IDFUNCIONARIOS"));
                funcionario.setTIPOIDENTIFICACION(resultSet.getString("TIPOIDENTIFICACION"));
                funcionario.setIDENTIFICACION(resultSet.getString("IDENTIFICACION"));
                funcionario.setNOMBRES(resultSet.getString("NOMBRES"));
                funcionario.setAPELLIDOS(resultSet.getString("APELLIDOS"));
                funcionario.setESTADOCIVIL(resultSet.getString("ESTADOCIVIL"));
                funcionario.setFKIDGENERO(resultSet.getInt("FKIDGENERO"));
                funcionario.setDIRECCION(resultSet.getString("DIRECCION"));
                funcionario.setTELEFONO(resultSet.getString("TELEFONO"));
                funcionario.setFECHANACIMIENTO(resultSet.getString("FECHANACIMIENTO"));
               funcionarios.add(funcionario);
            }
            return funcionarios;

        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }
    }

    public void crear(Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareCall(CREATE_FUNCIONARIOS);
            preparedStatement.setString(1, funcionario.getTIPOIDENTIFICACION());
            preparedStatement.setString(2, funcionario.getIDENTIFICACION());
            preparedStatement.setString(3, funcionario.getNOMBRES());
            preparedStatement.setString(4, funcionario.getAPELLIDOS());
            preparedStatement.setString(5, funcionario.getESTADOCIVIL());
            preparedStatement.setInt(6, funcionario.getFKIDGENERO());
            preparedStatement.setString(7, funcionario.getDIRECCION());
            preparedStatement.setString(8, funcionario.getTELEFONO());
            preparedStatement.setString(9, funcionario.getFECHANACIMIENTO());
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public Funcionario obtenerFuncionario(int IDFUNCIONARIOS) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Funcionario funcionario = null;

        try {

            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO_BY_ID);
            preparedStatement.setInt(1, IDFUNCIONARIOS);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                funcionario = new Funcionario();
                funcionario.setIDFUNCIONARIOS(resultSet.getInt("IDFUNCIONARIOS"));
                funcionario.setTIPOIDENTIFICACION(resultSet.getString("TIPOIDENTIFICACION"));
                funcionario.setIDENTIFICACION(resultSet.getString("IDENTIFICACION"));
                funcionario.setNOMBRES(resultSet.getString("NOMBRES"));
                funcionario.setAPELLIDOS(resultSet.getString("APELLIDOS"));
                funcionario.setESTADOCIVIL(resultSet.getString("ESTADOCIVIL"));
                funcionario.setFKIDGENERO(resultSet.getInt("FKIDGENERO"));
                funcionario.setDIRECCION(resultSet.getString("DIRECCION"));
                funcionario.setTELEFONO(resultSet.getString("TELEFONO"));
                funcionario.setFECHANACIMIENTO(resultSet.getString("FECHANACIMIENTO"));

            }
            return funcionario;

        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }
    }

    public void actualizarFuncionario(int IDFUNCIONARIOS, Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_FUNCIONARIOS);
            preparedStatement.setString(1, funcionario.getTIPOIDENTIFICACION());
            preparedStatement.setString(2, funcionario.getIDENTIFICACION());
            preparedStatement.setString(3, funcionario.getNOMBRES());
            preparedStatement.setString(4, funcionario.getAPELLIDOS());
            preparedStatement.setString(5, funcionario.getESTADOCIVIL());
            preparedStatement.setInt(6, funcionario.getFKIDGENERO());
            preparedStatement.setString(7, funcionario.getDIRECCION());
            preparedStatement.setString(8, funcionario.getTELEFONO());
            preparedStatement.setString(9, funcionario.getFECHANACIMIENTO());
            preparedStatement.setInt(10,IDFUNCIONARIOS);
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    
    public void eliminarfuncionario(int IDFUNCIONARIOS) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIOS);
            preparedStatement.setInt(1, IDFUNCIONARIOS);
            preparedStatement.executeUpdate();
            
        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
}
 