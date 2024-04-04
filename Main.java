import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la forma de implementación:");
        System.out.println("1. VectorHeap");
        System.out.println("2. PriorityQueue");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                atenderConVectorHeap();
                break;
            case 2:
                atenderConPriorityQueue();
                break;
            default:
                System.out.println("Opción no válida");
        }
        }

    public static void atenderConVectorHeap() {
        VectorHeap<Paciente> pacientesHeap = new VectorHeap<>();

        // Leer los pacientes del archivo pacientes.txt y agregarlos a la cola con prioridad
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
            return;
        }

        // Atender a los pacientes según su prioridad
        while (!pacientesHeap.isEmpty()) {
            Paciente paciente = pacientesHeap.poll();
            System.out.println(paciente);
        }
    }
        
    public static void atenderConPriorityQueue() {
        PriorityQueue<Paciente> pacientesQueue = new PriorityQueue<>();

        // Leer los pacientes del archivo pacientes.txt y agregarlos a la cola con prioridad
        try {
            File file = new File("pacientes.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                String nombre = datos[0].trim();
                String sintoma = datos[1].trim();
                char codigoEmergencia = datos[2].trim().charAt(0);
                Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
                pacientesQueue.add(paciente);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
            e.printStackTrace();
            return;
        }

        // Atender a los pacientes según su prioridad
        while (!pacientesQueue.isEmpty()) {
            Paciente paciente = pacientesQueue.poll();
            System.out.println(paciente);
        }
    }
    }