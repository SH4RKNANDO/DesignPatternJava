package FOLDERS;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Dossier {

    /* Attributs */
    private  String name;
    private List<Fichier> Fichiers = new List<Fichier>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Fichier> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] ts) {
            return null;
        }

        @Override
        public boolean add(Fichier fichier) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Fichier> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, Collection<? extends Fichier> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Fichier get(int i) {
            return null;
        }

        @Override
        public Fichier set(int i, Fichier fichier) {
            return null;
        }

        @Override
        public void add(int i, Fichier fichier) {

        }

        @Override
        public Fichier remove(int i) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Fichier> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Fichier> listIterator(int i) {
            return null;
        }

        @Override
        public List<Fichier> subList(int i, int i1) {
            return null;
        }
    };
    private List<Dossier> Dossiers = new List<Dossier>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Dossier> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] ts) {
            return null;
        }

        @Override
        public boolean add(Dossier dossier) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Dossier> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, Collection<? extends Dossier> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Dossier get(int i) {
            return null;
        }

        @Override
        public Dossier set(int i, Dossier dossier) {
            return null;
        }

        @Override
        public void add(int i, Dossier dossier) {

        }

        @Override
        public Dossier remove(int i) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Dossier> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Dossier> listIterator(int i) {
            return null;
        }

        @Override
        public List<Dossier> subList(int i, int i1) {
            return null;
        }
    };

    /* Getter/Setter (Ascesseurs)*/
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name;  }

    /* Default Builder */
    public Dossier() { }

    /* Builder avec Surchage */
    public Dossier(String _name) { setName(_name);}


    /* Liste de Fichiers / Dossiers */
    public void AjouterDossier(Dossier d) { Dossiers.add(d); }
    public void AjouterFichier(Fichier f) { AjouterFichier(f); }


    /* Retourne la liste de fichiers */
    public List<Fichier> GetListFichiers() { return Fichiers; }
    public List<Dossier> GetListDossiers() { return Dossiers; }
}
