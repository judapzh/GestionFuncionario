
package com.iudigital.gestionfuncionario.vista;

import com.iudigital.gestionfuncionario.controller.FuncionarioController;
import com.iudigital.gestionfuncionario.domain.Funcionario;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class FuncionarioDesktop {
     @SuppressWarnings("CallToPrintStackTrace")
     public static void crear(FuncionarioController funcionarioController) {

        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite el tipo de identificación: ");
            String TIPOIDENTIFICACION = sc.nextLine();
            System.out.println("Tipo de identificacion es:" + TIPOIDENTIFICACION);
            System.out.println("---------------------");
            
            System.out.println("Digite el numero de identificación: ");
            String IDENTIFICACION = sc.nextLine();
            System.out.println("Numero de identificacion es:" + IDENTIFICACION);
            System.out.println("---------------------");

            System.out.println("Digite los Nombres: ");
            String NOMBRES = sc.nextLine();
            System.out.println("Nombres son:" + NOMBRES);
            System.out.println("---------------------");

            System.out.println("Digite los apellidos: ");
            String APELLIDOS = sc.nextLine();
            System.out.println("Los apellidos son: " + APELLIDOS);
            System.out.println("---------------------");

            System.out.println("Digite el estado civil: ");
            String ESTADOCIVIL = sc.nextLine();
            System.out.println("El estado civil es: " + ESTADOCIVIL);
            System.out.println("---------------------");
            
            System.out.println("Digite el genero, 1 para masculino, 2 para femenino, 3 para otros : ");
            String FKIDGENERO = sc.nextLine();
            System.out.println("El genero es: " + FKIDGENERO);
            System.out.println("---------------------");

            System.out.println("Digite la direccion: ");
            String DIRECCION = sc.nextLine();
            System.out.println("La direccion es: " + DIRECCION);
            System.out.println("---------------------");

            System.out.println("Digite el telefono: ");
            String TELEFONO = sc.nextLine();
            System.out.println("El telefono es: " + TELEFONO);
            System.out.println("---------------------");
            
            System.out.println("Digite La fecha de nacimiento: ");
            String FECHANACIMIENTO = sc.nextLine();
            System.out.println("la fecha ce nacimiento es: " + FECHANACIMIENTO);
            System.out.println("---------------------");

            Funcionario funcionario = new Funcionario();
            funcionario.setTIPOIDENTIFICACION(TIPOIDENTIFICACION);
            funcionario.setIDENTIFICACION(IDENTIFICACION);
            funcionario.setNOMBRES(NOMBRES);
            funcionario.setAPELLIDOS(APELLIDOS);
            funcionario.setESTADOCIVIL(ESTADOCIVIL);
            funcionario.setFKIDGENERO(FKIDGENERO);
            funcionario.setDIRECCION(DIRECCION);
            funcionario.setTELEFONO(TELEFONO);
            funcionario.setFECHANACIMIENTO(FECHANACIMIENTO);
            
            funcionarioController.crear(funcionario);
            System.out.println("funcionario creado con exito");
        } catch (SQLException ex ) {
            ex.printStackTrace();
        }
    }

     @SuppressWarnings("CallToPrintStackTrace")
    public static void obtenerFuncionarios(FuncionarioController funcionarioController) {
        try {
            List<Funcionario> funcionarios= funcionarioController.obtenerFuncionarios();
            if(funcionarios.isEmpty()){
                System.out.println("No hay funcionarios");
            } else {
                funcionarios.forEach( funcionario -> {
                    System.out.println("id: " +funcionario.getIDFUNCIONARIOS());
                    System.out.println("Tipo Identificacion: " + funcionario.getTIPOIDENTIFICACION());
                    System.out.println("Identificacion: " + funcionario.getIDENTIFICACION());
                    System.out.println("Nombres: " + funcionario.getNOMBRES());
                    System.out.println("Apellidos: " + funcionario.getAPELLIDOS());
                    System.out.println("Estado civil: " +funcionario.getESTADOCIVIL());
                    System.out.println("Genero: " +funcionario.getFKIDGENERO());
                    System.out.println("Direccion: " + funcionario.getDIRECCION());
                    System.out.println("Telefono: " +funcionario.getTELEFONO());
                    System.out.println("Fecha nacimiento: " +funcionario.getFECHANACIMIENTO());
                    System.out.println("---------------------------------");
                    System.out.println("---------------------------------");
                    System.out.println("---------------------------------");
                });
            }   
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  
    }
    
     @SuppressWarnings("CallToPrintStackTrace")
    public static void eliminarFuncionario(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite el ID del funcionario a eliminar: " );
            int IDFUNCIONARIOS = sc.nextInt();
            System.out.println("El ID del funcionario a eliminar es: " + IDFUNCIONARIOS);
            Funcionario funcionarioExiste = funcionarioController.obtenerFuncionario(IDFUNCIONARIOS);
            if (funcionarioExiste == null) {
                System.out.println("No existe funcionarioo"); 
                return;
            }
            
            funcionarioController.eliminarFuncionario(IDFUNCIONARIOS);
            System.out.println("Funcionario eliminado con exito");
            obtenerFuncionarios(funcionarioController);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
     @SuppressWarnings("CallToPrintStackTrace")
    public static void actualizarFuncionario(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite el ID del funcionario a editar: " );
            int IDFUNCIONARIOS = sc.nextInt();
             System.out.println("El ID del funcionario a editar  es: " + IDFUNCIONARIOS);
            Funcionario funcionarioExiste = funcionarioController.obtenerFuncionario(IDFUNCIONARIOS);
            if (funcionarioExiste == null) {
                System.out.println("No existe funcionario"); 
            }
            else {

            System.out.println("Digite el tipo de identificación: ");
            String TIPOIDENTIFICACION = sc.nextLine();
            System.out.println("Tipo de identificacion es:" + TIPOIDENTIFICACION);
            System.out.println("---------------------");
            
            System.out.println("Digite el numero de identificación: ");
            String IDENTIFICACION = sc.nextLine();
            System.out.println("Numero de identificacion es:" + IDENTIFICACION);
            System.out.println("---------------------");
            
            System.out.println("Digite los Nombres: ");
            String NOMBRES = sc.nextLine();
            System.out.println("Nombres son:" + NOMBRES);
            System.out.println("---------------------");

            System.out.println("Digite los apellidos: ");
            String APELLIDOS = sc.nextLine();
            System.out.println("Los apellidos son: " + APELLIDOS);
            System.out.println("---------------------");

            System.out.println("Digite el estado civil: ");
            String ESTADOCIVIL = sc.nextLine();
            System.out.println("El estado civil es: " + ESTADOCIVIL);                     
            System.out.println("---------------------");
            
            System.out.println("Digite el genero, 1 para masculino, 2 para femenino, 3 para otros : ");
            String FKIDGENERO = sc.nextLine();
            System.out.println("El genero es: " + FKIDGENERO);
            System.out.println("---------------------");

            System.out.println("Digite la direccion: ");
            String DIRECCION = sc.nextLine();
            System.out.println("La direccion es: " + DIRECCION);
            System.out.println("---------------------");

            System.out.println("Digite el telefono: ");
            String TELEFONO = sc.nextLine();
            System.out.println("El telefono es: " + TELEFONO);
            System.out.println("---------------------");
            
             System.out.println("Digite La fecha de nacimiento: ");
            String FECHANACIMIENTO = sc.nextLine();
            System.out.println("la fecha ce nacimiento es: " + FECHANACIMIENTO);
            System.out.println("---------------------");

            Funcionario funcionario = new Funcionario();
            funcionario.setTIPOIDENTIFICACION(TIPOIDENTIFICACION);
            funcionario.setIDENTIFICACION(IDENTIFICACION);
            funcionario.setNOMBRES(NOMBRES);
            funcionario.setAPELLIDOS(APELLIDOS);
            funcionario.setESTADOCIVIL(ESTADOCIVIL);
            funcionario.setFKIDGENERO(FKIDGENERO);
            funcionario.setDIRECCION(DIRECCION);
            funcionario.setTELEFONO(TELEFONO);
            funcionario.setFECHANACIMIENTO(FECHANACIMIENTO);
            System.out.println("funcionario editado con exito");
      
            }
    }    catch (SQLException ex) {
            ex.printStackTrace();
         }
    } 

    public static void main(String[] args) { 
        
       // CarroController carroController = new CarroController();
       // crear(carroController);
       // obtenerCarros(carroController);
        
         int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        FuncionarioController funcionarioController = new FuncionarioController();
        while(opcion != 0) {
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            System.out.println("ELIJA UNA OPCION ");
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            
            System.out.println("1. Listar ");
            System.out.println("2. Crear  ");
            System.out.println("3. Eliminar ");
            System.out.println("4. editar  ");
            
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion) {
                case 0 -> System.out.println("Ha salido de la aplicacion ");
                
                case 1 -> obtenerFuncionarios(funcionarioController);
                
                case 2 -> crear(funcionarioController);
                
                case 3 -> eliminarFuncionario(funcionarioController);
                case 4 -> actualizarFuncionario(funcionarioController);
                default -> System.out.println("Opcion invalidad ");
            }
        }
    }
}
