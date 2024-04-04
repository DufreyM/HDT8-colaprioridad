import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
     
        VectorHeap<Paciente> pacientesHeap = new VectorHeap<>();
        try {
            File file = new File("pacientes.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                String nombre = datos[0].trim();
                String sintoma = datos[1].trim();
                char codigoEmergencia = datos[2].trim().charAt(0);
                Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
                pacientesHeap.add(paciente);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
            e.printStackTrace();
        }

        while (!pacientesHeap.isEmpty()) {
            Paciente paciente = pacientesHeap.poll();
            System.out.println(paciente);
        }
    }
}