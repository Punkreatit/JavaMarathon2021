package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        Warehouse warehouse2 = new Warehouse();
        Courier courier2=new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);


        businessProcess(picker1);

        businessProcess(courier1);
        System.out.println();

        System.out.println(picker1.toString());
        System.out.println(courier2.toString());
        System.out.println(warehouse1.toString()+"\n");


        System.out.println( "Для склада 2:");
        businessProcess(picker2);
        businessProcess(courier2);
        System.out.println();
        System.out.println(picker2);
        System.out.println(courier2);
        System.out.println(warehouse2);




    }

    static void businessProcess(Worker worker){
            for (int i = 0; i < 10000; i++) {
                worker.doWork();
            }
            worker.bonus();
        }


    }


