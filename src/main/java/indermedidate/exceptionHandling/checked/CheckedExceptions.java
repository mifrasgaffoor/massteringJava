package indermedidate.exceptionHandling.checked;

public class CheckedExceptions {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("program is started... ");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Program is continuing...");
        System.out.println("ppgaming is ended...");
    }
}
