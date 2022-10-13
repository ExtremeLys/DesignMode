package pers.vistitor.sampleCode;

public abstract class Visitor {
    public abstract void visitor(File file);
    public abstract void visitor(Directory directory);
}
