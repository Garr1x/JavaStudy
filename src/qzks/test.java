package qzks;


public class test{

    protected double  a=78.5;

    protected int methodOne(){return 5;};

}

class MSo extends test{

    public double methodTwo(){return a* methodOne();}

}