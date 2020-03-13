package ExamenCollections;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.util.Collection;
import java.util.Map;
import java.util.Set;


public class Coronavirus {
    private String nombreCient = "COVID-19";
    private String origen = "Wuhan";
    private char cepa;
    private Pacientes paciente;
    Map<Character, Pacientes> pac = new Map<Character, Pacientes>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Pacientes get(Object key) {
            return null;
        }

        @Nullable
        @Override
        public Pacientes put(Character key, Pacientes value) {
            return null;
        }

        @Override
        public Pacientes remove(Object key) {
            return null;
        }

        @Override
        public void putAll(@NotNull Map<? extends Character, ? extends Pacientes> m) {

        }

        @Override
        public void clear() {

        }

        @NotNull
        @Override
        public Set<Character> keySet() {
            return null;
        }

        @NotNull
        @Override
        public Collection<Pacientes> values() {
            return null;
        }

        @NotNull
        @Override
        public Set<Entry<Character, Pacientes>> entrySet() {
            return null;
        }
    };
    ObjectInputStream in;

    public void addpaciente(String nombre, int edad, int peso, boolean vacuna, int medicoNombre, char cepa){
       pac.put(cepa,paciente);
    }

    public void cargarpacientes(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pacientes.dat"));
        }catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarpaciente(){
        try {
            in = new ObjectInputStream(new FileInputStream("pacientes.dat"));
            in.readObject();
        }catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}
