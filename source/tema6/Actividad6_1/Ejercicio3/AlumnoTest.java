package tema6.Actividad6_1.Ejercicio3;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    /**
     * Test para comprobar que el alumno tiene fecha de matriculación
     */
    @Test
    void getfMatricula() {
        ModuloProfesional mp = new ModuloProfesional(150, "Desarrollo de Interfaces");
        ModuloProfesional mp2 = new ModuloProfesional(180, "Acceso a Datos");
        List<ModuloProfesional> modulos = List.of(mp, mp2);
        Date fecha = new Date(1, 1, 2000);
        Alumno a = new Alumno("Juan", "Perez", "12345678A", 21, fecha, modulos);
        assertEquals(fecha, a.getfMatricula());
        assertNotEquals(new Date(1, 1, 2001), a.getfMatricula());
    }

    /**
     * Test para comprobar que al alumno se le añade los modulos correctamente.
     */
    @Test
    void getMatricula() {
        ModuloProfesional mp = new ModuloProfesional(150, "Desarrollo de Interfaces");
        ModuloProfesional mp2 = new ModuloProfesional(180, "Acceso a Datos");
        List<ModuloProfesional> modulos = List.of(mp, mp2);
        Date fecha = new Date(1, 1, 2000);
        Alumno a = new Alumno("Juan", "Perez", "12345678A", 21, fecha, modulos);

        assertEquals(modulos, a.getMatricula());

        List<ModuloProfesional> modulos2 = List.of(mp2);
        assertNotEquals(modulos2, a.getMatricula());
    }

    @Test
    void toStringXML() {
        // prueba
        ModuloProfesional mp = new ModuloProfesional(150, "Desarrollo de Interfaces");
        ModuloProfesional mp2 = new ModuloProfesional(180, "Acceso a Datos");
        List<ModuloProfesional> modulos = List.of(mp, mp2);
        Date fecha = new Date(1, 1, 2000);
        Alumno a = new Alumno("Juan", "Perez", "12345678A", 21, fecha, modulos);
        String cadena = "<alumno>\n" +
                "   <nombre>Juan</nombre>\n" +
                "   <apellido1>Perez</apellido1>\n" +
                "   <apellido2>12345678A</apellido2>\n" +
                "   <edad>21</edad>\n" +
                "   <fMatricula>Tue Jul 24 00:00:00 CET 1906</fMatricula>\n" +
                "   <matricula>\n" +
                "        <modulo numHoras=\"150\">Desarrollo de Interfaces</modulo>\n" +
                "        <modulo numHoras=\"180\">Acceso a Datos</modulo>\n" +
                "    </matricula>\n" +
                "</alumno>";
        assertEquals(cadena, a.toStringXML());
    }
}