package Set.exc2;

import java.util.HashSet;
import java.util.Set;

public class ProductRegistry {
    private Set<Product> productRegistry = new HashSet<>();

    public void initApp() {
      while ((Integer.valueOf(UserInputHandler.getModeSelection()).equals(Decision.ADD.decisionValue))) {
          addProduct();
      }
    }


    private void addProduct() {
        System.out.println("Product name: ");
        String productName = UserInputHandler.getUserInput();

        System.out.println("Product price: ");
        double productPrice = Double.parseDouble(UserInputHandler.getUserInput());

        Product product =  new Product(productName, productPrice);
        System.out.println((checkIfProductExist(product.getProductName())));

        if (checkIfProductExist(product.getProductName())) {
            System.out.println("Product already exist");

            String userDecision = UserInputHandler.getDecision();
            if (Integer.valueOf(userDecision).equals(Decision.REPLACE.getDecisionValue())) {
                productRegistry.remove(product);
                productRegistry.add(product);
            }
        }

        productRegistry.add(product);
       productRegistry.stream().forEach(productRec -> System.out.println(productRec.getProductName() + ", " + productRec.getPrice()));

    }

    private boolean checkIfProductExist(String productName) {
        return productRegistry.stream().anyMatch(product -> product.getProductName().equals(productName));
    }
}
