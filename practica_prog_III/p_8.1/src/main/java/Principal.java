import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

    //Creamos un método estático para probar la conexión
    public static void probarConexion(String conn, String user, String pass){
        try(Connection connection = DriverManager.getConnection(conn,user,pass)){
            System.out.println("Conexión exitosa");
        }
        catch (SQLException ex){
            System.out.println("Error con la conexión");
        }
    }

    public static void crearUsuario(String conn, String user, String pass, String nombre, String contra){
        String sql = "create user " + nombre + " with password '" + contra + "'";
        try(Connection connection = DriverManager.getConnection(conn, user, pass);
        Statement statement = connection.createStatement()){
            statement.executeQuery(sql);
            System.out.println("Usuario con nombre " + nombre + " creado con éxito !");
        }
        catch(SQLException ex){
            if(ex.getMessage().contains("already exists")){
                System.out.println("El usuario ya existe");
            }
            else{
                System.out.println("Error al crear usuario: " + ex.getMessage());
            }
        }
    }


    public static void main(String[] args){
        //Definimos nuestra URL para conectarnos
        String conn = "jdbc:postgresql://localhost:5432/postgres";
        String user = "user_prueba";
        String pass = "user_prueba";
        //Probamos la conexión
        probarConexion(conn, user, pass);

        //Creamos usuarios mediante un método
        crearUsuario(conn, user, pass, "guayen", "guayen");
        crearUsuario(conn, user, pass, "adolf", "adolf");
        //Crear un usuario no retorna nada, por lo tanto puede ser tomado como error. Si ejecutamos denuevo, lanza
        //nuestro catch con "usuario ya existe"

        //Probamos conectarnos con estos usuarios:
        System.out.println("Probando conexión con usuario guayen");
        probarConexion(conn,"guayen", "guayen");
        System.out.println("Ahora con adolf");
        probarConexion(conn,"adolf", "adolf");
        //Nos conectamos con éxito

        /*
        //Ahora probamos el código que nos deja la cátedra
        try {
            System.out.println( "=> Cargando el driver ... :" );
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println( "OK" );
            String url = "jdbc:postgresql://localhost:5432/postgres";
            System.out.println( "=> Conectando ... :" );
            Connection conexion = DriverManager.getConnection(url,"user_prueba", "user_prueba");
                    System.out.println("URL: " + url);
            System.out.println("Connection: " + conexion);
            if(conexion != null){
                System.out.println( "OK--> nos conectamos" );
            }
        }catch( Exception ex ) {
            System.out.println("Ahora es la execpcion para el Connection");
            System.out.println("SQLException: " + ex.getMessage());
        }

        Lanza error.
        */

    }

}
