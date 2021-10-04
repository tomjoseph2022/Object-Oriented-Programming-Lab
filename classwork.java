class CPU{
    String price="7 lakh";
    class Processor{
        int number_of_cores=10;
        String manufacturer="Intel";
        static class RAM{
            String manufacturer="ASUS";
            String memory="6 GB";
        }
    }
}
public class classwork {
    public static void main(String[] args){
        CPU system = new CPU();
        CPU.Processor processor1 = system.new Processor();
        CPU.Processor.RAM ram1 = new CPU.Processor.RAM();
        System.out.println("The CPU 1 has A price of  "+system.price+".\n"+
                "The processor has "+processor1.number_of_cores+" number of processors and is manufactured by "+processor1.manufacturer+".\n"
                +"The system has a RAM of "+ram1.memory+" and is manufactured by "+ram1.manufacturer+".");

    }
}
