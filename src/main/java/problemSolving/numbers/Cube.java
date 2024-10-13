package problemSolving.numbers;

public class Cube {
    public static void main(String[] args) {
        Cube cube =  new Cube();
        int c = cube.cubeFun(3);
        System.out.println(c);
    }

    int cubeFun(int a){
        return a * a * a;
    }
}
