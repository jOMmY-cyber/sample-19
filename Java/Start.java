import java.util.Arrays;
import java.util.Comparator;


class Start{
    public static void main(String[] data){
        Worker w = new Worker();
        w.start(); // start() will initialize something call run()
        Thread t = new Thread(new Printer());
        t.start();
        for(int i=0;i<1000;i++){
            System.out.println("A");
        }
//        //int cmp = "Latae".compareTo("mocha");       // -
//        //int cmp2 = "Bangkok".compareTo("Austria");  // +
//        //int cmp3 = "Bangko.".compareTo("Bangkok");  // 0
//        
//        
////        //find the lowest element without sorting
////        String[] list = {"Bangkok","Chicago","Austin","London","New York","Paris"};
////        //let the first is the lowest
////        int low = 0;
////        for(int i=1;i<list.length;i++){
////            int cmp = list[low].compareTo(list[i]);
////            if(cmp > 0){low=i;}
////        }
////        System.out.println(list[low]);
//        
//        
//        
//        
////	Player p = new Player();
////	p.name = "David B";
////	p.number = 7;
////	Player q = new Player("Michael O",10);
////        System.out.println(p.name);
////        System.out.println(q.name);
////        
//        Player[] a ={new Player("David B",7),
//                     new Player("Micheael O",10),
//                     new Player("Frank L",8),
//                     new Player("David J",1)};
//        
////        Array.sort(a);
////        for(int i=0;i<a.length;i++){
////            System.out.print(a[i].name + "" + a[i].number);
////        }
////        Arrays.sort(a, new Sample());
//////        Arrays.sort(a, (u,v) -> u.number - v.number );
////        for (Player p : a) {
////            System.out.println(p.name + " " + p.number);
////        }
//
//        //Write code to find the lowest max player number
//        //using compareTo()
//        int m=0;
//        for(int i=1;i<a.length;i++){
//            int cmp = a[m].compareTo(a[i]);
//            if (cmp<0){m=i;}
//        }
//        System.out.println(a[m].name+" "+a[m].number);
//    }
    }
}

class Worker extends Thread{
    @Override public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("W");
        }
    }
}

class Printer implements Runnable{
    @Override public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("P");
        }
    }
}
class Sample implements java.util.Comparator {
    @Override
    public int compare(Object a, Object b) {
        Player x = (Player)a;
        Player y = (Player)b;
        if (x.number < y.number) return +1;
        if (x.number > y.number) return -1;
        return 0;
        //int only| return x.number - y.number;
    }
}

class Player{
    public int compareTo(Object o){
        Player x = (Player)o;
        return this.number - x.number;
    }
    String name;
    int number;
    Player(String name, int number){
	this.name = name;
	this.number = number;
    }

    Player(){
	// nothing:
    }
}



/*
https://codestar.work/java-01.pdf
https://codestar.work/java-02.pdf
https://codestar.work/java-03.pdf
https://codestar.wrok/mysql-windows.pdf
*/
