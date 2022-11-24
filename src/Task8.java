import java.util.HashMap;


public class Task8 {

    public static void main(String[] args) {

        HashMap<String, String> mostExpensiveCars = new HashMap<>();

        mostExpensiveCars.put("Mercedes-Benz 300 SLR Uhlenhaut Coupe","142 млн долларов");
        mostExpensiveCars.put("Ferrari 250 GTO","80 млн долларов");
        mostExpensiveCars.put("Bugatti Type 57SC Atlantic","40 млн долларов");
        mostExpensiveCars.put("Ferrari 335 S Spider Scagliettis","36 млн долларов");
        mostExpensiveCars.put("Rolls-Royce Boat Tail","28 млн долларов");
        mostExpensiveCars.put("Aston Martin DBR1","22,6 млн долларов");
        mostExpensiveCars.put("Bugatti La Voiture Noire","18,7 млн долларов");
        mostExpensiveCars.put("Pagani Zonda HP Barchetta","17,6 млн долларов");
        mostExpensiveCars.put("Rolls-Royce Sweptail","13 млн долларов");
        mostExpensiveCars.put("Bugatti Centodieci","9,6 млн долларов");
        System.out.println("Всего машин в ассортименте: " + '\t' + mostExpensiveCars.size());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Сколько стоит Bugatti Type 57SC Atlantic?" + '\t' +mostExpensiveCars.get( "Bugatti Type 57SC Atlantic"));
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Все авто:" + '\n' +mostExpensiveCars.keySet());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Все цены: " + '\n' + mostExpensiveCars.values());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Есть ли в ассоритменте Rolls-Royce Sweptail?  " + '\t' + mostExpensiveCars.containsKey("Rolls-Royce Sweptail"));
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Есть ли авто за 80 млн долларов? " + '\t' + mostExpensiveCars.containsValue("80 млн долларов"));
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Ассоритмент пустой? " + '\t' + mostExpensiveCars.isEmpty());
        System.out.println("--------------------------------------------------------------------------------------");
        mostExpensiveCars.remove("Aston Martin DBR1");
        System.out.println("Удален Aston Martin DBR1 за 22,6 млн долларов.Осталось машин:" + '\t' + mostExpensiveCars.size());
        System.out.println("--------------------------------------------------------------------------------------");
        mostExpensiveCars.clear();
        System.out.println("Ассортимент: " + mostExpensiveCars + '\t' + "Количество машин: " + mostExpensiveCars.size());
    }
}