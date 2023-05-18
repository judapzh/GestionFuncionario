
package com.iudigital.gestionfuncionario.domain;



public class Funcionario {
    private int IDFUNCIONARIOS;
    private String TIPOIDENTIFICACION;
    private String IDENTIFICACION;
    private String NOMBRES;
    private String APELLIDOS;
    private String ESTADOCIVIL;
    private int FKIDGENERO;       
    private String DIRECCION;
    private String TELEFONO;
    private String FECHANACIMIENTO; 

    public int getIDFUNCIONARIOS() {
        return IDFUNCIONARIOS;
    }

    public void setIDFUNCIONARIOS(int IDFUNCIONARIOS) {
        this.IDFUNCIONARIOS = IDFUNCIONARIOS;
    }

    public String getTIPOIDENTIFICACION() {
        return TIPOIDENTIFICACION;
    }

    public void setTIPOIDENTIFICACION(String TIPOIDENTIFICACION) {
        this.TIPOIDENTIFICACION = TIPOIDENTIFICACION;
    }

    public String getIDENTIFICACION() {
        return IDENTIFICACION;
    }

    public void setIDENTIFICACION(String IDENTIFICACION) {
        this.IDENTIFICACION = IDENTIFICACION;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public String getESTADOCIVIL() {
        return ESTADOCIVIL;
    }

    public void setESTADOCIVIL(String ESTADOCIVIL) {
        this.ESTADOCIVIL = ESTADOCIVIL;
    }

    public int getFKIDGENERO() {
        return FKIDGENERO;
    }

    public void setFKIDGENERO(int FKIDGENERO) {
        this.FKIDGENERO = FKIDGENERO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getFECHANACIMIENTO() {
        return FECHANACIMIENTO;
    }

    public void setFECHANACIMIENTO(String FECHANACIMIENTO) {
        this.FECHANACIMIENTO = FECHANACIMIENTO;
    }
    

    
    @Override
    public String toString() {
        return NOMBRES +" "+ APELLIDOS;
    }

    public void setFKIDGENERO(String FKIDGENERO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
		
}