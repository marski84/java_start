package Typy_generyczne;

public class Pair <T,V> {
    T firstEntity;
    V secondEntity;

    public Pair(T firstEntity, V secondEntity) {
        this.firstEntity = firstEntity;
        this.secondEntity = secondEntity;
    }

    public T getFirstEntity() {
        return firstEntity;
    }

    public void setFirstEntity(T firstEntity) {
        this.firstEntity = firstEntity;
    }

    public V getSecondEntity() {
        return secondEntity;
    }

    public void setSecondEntity(V secondEntity) {
        this.secondEntity = secondEntity;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstEntity=" + firstEntity.getClass() +
                ", secondEntity=" + secondEntity.getClass() +
                '}';
    }
}
