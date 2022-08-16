package pers.factoryMethod.sampleCode.idcard;

import pers.factoryMethod.sampleCode.framework.Factory;
import pers.factoryMethod.sampleCode.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public List<String> getOwners(){
        return owners;
    }
}
