
package gestionviajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author rubensegura
 */
public class BaseDeDatos {
    
    private final String nombreBD;
    private Connection conexion;
    public Statement consulta;

    public BaseDeDatos(String nombreBD) {
        this.nombreBD = nombreBD;
    }
    
    /**
     * Realiza la conexión con la base de datos
     */
    public void ConectaBD() {
        try {
            Class.forName("org.sqlite.JDBC");//Comprobamos que existe el driver SQLITE-JDBC
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        try {
            this.conexion = DriverManager.getConnection("jdbc:sqlite:"+this.nombreBD);//Inicializa Conexión
            //Si no existe el fichero de la BBDD, la crea pero vacío
            this.consulta = conexion.createStatement();//Inicializa la sentencia(Statement) que permite realizar consultas SQL
            String query = "select * from sqlite_master where name='Cliente'";
            ResultSet rs = this.consulta.executeQuery(query);
            if (rs.next()==false){//Si no existe la tabla la crea
                 this.creaBBDD();
            }
            System.out.println("Base de Datos OK");//Si llega aquí es que todo está correcto
        } catch (SQLException e) {
            System.out.println("ERROR "+e.getMessage());
        }
    }
    
    /**
     * Crea las distintas tablas que conforman la base de datos
     */
    private void creaBBDD() {
        try {
            System.out.println("Creando tablas de la BD");
            String creaTablaClientes, creaTablaPaquetes, creaTablaVentas;
            creaTablaClientes = "CREATE TABLE Cliente ("+
                                "clienteID INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                                "nombre VARCHAR(50)," +
                                "apellidos VARCHAR(100)," +
                                "fechaNacimiento VARCHAR(10)," +
                                "dni VARCHAR(9)," +
                                "pasaporte VARCHAR(9)," +
                                "telefono VARCHAR(9)," +
                                "email VARCHAR(50)," +
                                "direccion VARCHAR(100)" +
                                ")";
            creaTablaPaquetes = "CREATE TABLE Paquete (" +
                                "paqueteID INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "nombre VARCHAR(200)," +
                                "precio INTEGER," +
                                "hospedaje VARCHAR(200)," +
                                "duracion VARCHAR(30)," +
                                "destino VARCHAR(200)," +
                                "transporte VARCHAR(200)" +
                                ")";
            creaTablaVentas = "CREATE TABLE Venta (" +
                                "ventaID INTEGER PRIMARY KEY AUTOINCREMENT," +
                                "fechaVenta VARCHAR(10)," +
                                "fechaInicio VARCHAR(10)," +
                                "fechaFin VARCHAR(10)," +
                                "IdCli INTEGER," +
                                "IdPaq INTEGER," +
                                "CONSTRAINT fk_id_cli FOREIGN KEY (IdCli) REFERENCES Cliente(clienteID) ON DELETE CASCADE ON UPDATE CASCADE," +
                                "CONSTRAINT fk_id_paq FOREIGN KEY (IdPaq) REFERENCES Paquete(paqueteID) ON DELETE CASCADE ON UPDATE CASCADE" +
                                ")";
            this.consulta.executeUpdate(creaTablaClientes);
            this.consulta.executeUpdate(creaTablaPaquetes);
            this.consulta.executeUpdate(creaTablaVentas);
            System.out.println("Se ha creado la BD");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Borrar y vuelve a generar las tablas de la base de datos
     */
    public void reiniciaBBDD(){
        try{
                System.out.println("Borrando Tablas...");
                String borraTablaClientes = "DROP TABLE Cliente";
                String borraTablaPaquetes = "DROP TABLE Paquete";
                String borraTablaVentas = "DROP TABLE Venta";
                this.consulta.executeUpdate(borraTablaVentas);
                this.consulta.executeUpdate(borraTablaPaquetes);
                this.consulta.executeUpdate(borraTablaClientes);
                System.out.println("Tablas Borradas con éxito");//Si llega aqui es que ha creado la BBDD
                this.creaBBDD();
        }catch (SQLException e){
             System.out.println("ERROR "+e.getMessage());   
        }
     }   
    
    /**
     * Devuelve el objecto para la conexion con la base de datos
     * @return conexion con bd
     */
    public Connection dameConexion(){
        System.out.println("Devuelvo la conexion a la BD");
        return this.conexion;
    }   
    
    /**
     * Cierra la conexion con la base de datos
     */
    public void cerrarConexion(){
        System.out.println("Cerrando la base de datos...");
            try {
              this.conexion.close();
            } catch (SQLException e) {
                System.out.println("ERROR "+e.getMessage());
            }
     }
    
}
