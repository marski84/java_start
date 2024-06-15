package LambdaRef.constructorRef;

@FunctionalInterface
public interface PersonSupplier {
    Person get(String[] firstNameList, String[] lastNameList, int[] ageList);
}
