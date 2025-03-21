package Model;

import java.util.ArrayList;    // Utill -> Collections

interface teddyNews {

    public abstract void MakeNewMachine(Observer ob);

    public abstract void RepairMachine();

    public abstract void DesructMachine(Observer ob);
}

class teddyTV implements teddyNews {

    private int count;
    private ArrayList<Observer> observeList;    // show to observation company boss

    public teddyTV() {
        this.observeList = new ArrayList<>();  // make observe list
    }

    // How list Make 
    @Override
    public void MakeNewMachine(Observer ob) {
        this.observeList.add(ob);         // if make new, add to list

    }

    @Override
    public void RepairMachine() {
        for (Observer ob : observeList) {
            ob.update(this.count);       // if update , update list + Count
        }
    }

    @Override
    public void DesructMachine(Observer ob) {
        this.observeList.remove(ob);    // if machine destroy, remove from list
    }

    public void setCount(int count) {    // Repair Count
        this.count = count;
        RepairMachine();
    }

    public int getCount() {
        return count;                       // return Repair Count
    }
}

interface Observer {   //boss

    public abstract void update(int count);
}

class ObserveMan implements Observer {  // Boy Reporter

    @Override
    public void update(int count) {
        System.out.println("Observe Boy :" + count);
    }
}

class ObserveLady implements Observer {    //Girl Reporter

    @Override
    public void update(int count) {
        System.out.println("Observe Girl :" + count);
    }
}

public class Observe {

    public static void main(String[] args) {
        teddyTV TV = new teddyTV();     //brodcasting device

        Observer Boy = new ObserveMan();      //Boy comes and report
        Observer Girl = new ObserveLady();      // Girl Comes and report

        TV.MakeNewMachine(Boy);    //Report To Work   - Boy
        TV.MakeNewMachine(Girl);        //Report To Work  - Girl
        TV.setCount(20);                         // Report Count

        TV.DesructMachine(Boy);
        TV.DesructMachine(Girl);

        TV.RepairMachine();
        TV.MakeNewMachine(Boy);    //Report To Work   - Boy
        TV.MakeNewMachine(Girl);        //Report To Work  - Girl
        
        TV.setCount(40);                         // Update Count

    }
}
