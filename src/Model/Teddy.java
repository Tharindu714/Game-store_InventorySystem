package Model;
//inside the factory without considering factory
interface TeddyMachine{
    public abstract boolean hasNext(); 
    public abstract Object next();
}

class Teddy implements TeddyMachine{
    private Object teddy[];
    private int count;
    
    public  Teddy(Object [] teddy){
        this.teddy = teddy;
    }

    @Override
    public boolean hasNext() {
        return count <  teddy.length; 
    }

    @Override
    public Object next() {
        return  teddy[count++];
    }
}

class main{
    public static void main(String[] args) {
        String teddy[] = {"Rob","Jolly","Bobby"};
        
        TeddyMachine ted1 = new Teddy(teddy);
        
        while (ted1.hasNext()){
            System.out.println(ted1.next());
        }
    }
}
