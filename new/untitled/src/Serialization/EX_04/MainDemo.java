package Serialization.EX_04;

public class MainDemo {
    public static void main(String[] args) {
        UniEmployee uni=new UniEmployee("vihanga",26,1388);

        MySerializer mySerializer = new MySerializer();
        mySerializer.myuniserilizer(uni);

        MyDeserializer myDeserializer = new MyDeserializer();
        myDeserializer.myunideserilizer();
    }
}
