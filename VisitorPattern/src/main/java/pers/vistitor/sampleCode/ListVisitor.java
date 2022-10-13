package pers.vistitor.sampleCode;

import java.util.Iterator;

public class ListVisitor extends Visitor{
    private String currentDir = "";
    @Override
    public void visitor(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visitor(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = this.currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
