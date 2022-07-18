public class HashTable {

    private final Integer size = 13;

    public HashTable() {

    }

    private Integer hash(Integer k){

        Integer key = 0;
        key = (k & 0x7fffffff) % size;
        return key;
    }

    public Integer buscar(){
        return  null;
    }

    public void insertar(Integer k){
        System.out.println(k + " tiene el hash --> " + hash(k));
    }

    public void borrar(Integer k){

    }

}
