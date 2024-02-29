import java.sql.*;

public class ConexionJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String contrasenia = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            System.out.println("Conexión establecida!!");

            Estudiante estudiante1 = new Estudiante(1,"Juan",20,8);
            Estudiante estudiante2 = new Estudiante(2,"Maria",25,6);
            Estudiante estudiante3 = new Estudiante(3,"Lucia",19,7);
            Estudiante estudiante4 = new Estudiante(4,"Monica",23,9);

            String insertSql = "INSERT INTO estudiantes (nombre, edad,calificacion) VALUES (?, ?,?)";

            PreparedStatement statement = conexion.prepareStatement(insertSql);

            statement.setString(1, estudiante1.getNombre());
            statement.setInt(2, estudiante1.getEdad());
            statement.setInt(3,estudiante1.getCalificacion());
            statement.executeUpdate();

            statement.setString(1, estudiante2.getNombre());
            statement.setInt(2, estudiante2.getEdad());
            statement.setInt(3,estudiante2.getCalificacion());
            statement.executeUpdate();

            statement.setString(1, estudiante3.getNombre());
            statement.setInt(2, estudiante3.getEdad());
            statement.setInt(3,estudiante3.getCalificacion());
            statement.executeUpdate();

            statement.setString(1, estudiante4.getNombre());
            statement.setInt(2, estudiante4.getEdad());
            statement.setInt(3,estudiante4.getCalificacion());
            statement.executeUpdate();

            System.out.println("Registros insertados en la tabla: clientes!!");

            Statement state = conexion.createStatement();

            String sql = "SELECT * FROM estudiantes";
            ResultSet resultado = state.executeQuery(sql);

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                int calificacion = resultado.getInt("calificacion");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Calificación: " + calificacion);
            }
            String borradoSql = "DELETE FROM estudiantes WHERE id=3;";
            state.execute(borradoSql);
            System.out.println("Borrado correctamente id=3");

            resultado.close();
            statement.close();
            state.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
