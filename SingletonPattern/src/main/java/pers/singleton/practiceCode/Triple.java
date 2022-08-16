package pers.singleton.practiceCode;

import java.util.Map;

public class Triple {
    private static Triple[] triples = {
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    private int id;

    public Triple(int id) {
        this.id = id;
        System.out.println("生成实例：" + id);
    }

    public static Triple getInstance(int id){
        return triples[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
