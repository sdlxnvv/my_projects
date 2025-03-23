import java.util.concurrent.*;

public class FutureControlExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int core = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(core);

        Callable<Boolean> uzcardCheck = () -> {
            System.out.println("UzCard is checking hihihi");
            Thread.sleep(2000);
            System.out.println("UzCard is checked");
            return true;
        };
        Callable<Boolean> humoCheck = () ->{
                System.out.println("HumoCard is checking");
                Thread.sleep(2000);
                System.out.println("HumoCard is checked");
                return true;
        };

        Future<Boolean> responseUzCard = executorService.submit(uzcardCheck);
        Future<Boolean> responseHumoCard = executorService.submit(humoCheck);

        if (responseUzCard.get()) {
            System.out.println("UzCard da pul bor!");
            System.out.println("Murod hozirgi ");
            System.out.println("Murod hozirgi ");
        }
        if (responseHumoCard.get()) {
            System.out.println("HumoCard da pul kop");
        }

        System.out.println("sdfasdf");

        System.out.println("Pul otkazildi");

        executorService.shutdown();

    }
}
