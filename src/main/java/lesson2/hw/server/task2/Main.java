package lesson2.hw.server.task2;



public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();
        DeveloperBack developerBack = new DeveloperBack();


        FrontEnder frontEnder = new Developer();
        frontEnder.createFront();

//        List<BackEnder>backEnderList= new ArrayList<>();
//        backEnderList.add(dev);
//        backEnderList.add(developerBack);
//
//
//        for (BackEnder backEnder:backEnderList) {
//            backEnder.createServer();
//        }


//        dev.createFront();
//        dev.createServer();
//        developerBack.createServer();
    }
}
