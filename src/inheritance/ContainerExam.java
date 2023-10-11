package inheritance;

public class ContainerExam {

    public static void main(String[] args) {
        Luggage size3Lug = new Luggage(3);
        Luggage size2Lug = new Luggage(2);
        Luggage size1Lug = new Luggage(1);

        Container c = new Container(5);

        if (c.canContain(size3Lug)) {
            c.put(size3Lug); // 정상사용
        }

        if (c.canContain(size2Lug)) {
            c.add(size2Lug); // 비정상 사용
        }

        if (c.canContain(size1Lug)) {
            c.add(size1Lug); // 원래는 통과되면 안되는 부분에서 통과
        }
    }

}
