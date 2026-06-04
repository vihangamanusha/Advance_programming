package Serialization.EX_05;

public class MainDemo {
    public static void main(String[] args) {
        UniEmployee uni = new UniEmployee("vihanga",24,1388);

        MySerializer serializer = new MySerializer();
        serializer.serializeruni(uni);

        MyDeserilizer deserilizer = new MyDeserilizer();
        deserilizer.deserilizeruni();
    }
}
