public class Main {
    public static void main(String[] args) {
        Employee jackMiller = new Employee("jack","Miller", 43);
        Employee fabioQuartararo = new Employee("Fabio", "Quartararo",20);
        Employee marcMarques = new Employee("Marc", "Marques",93);
        Employee joanMir =  new Employee("Joan", "Mir", 36);
        Employee alexRins = new Employee("Alex","Rins", 42);
        Employee polEspargaro = new Employee("Pol", "Espargaro",44);

        ArrayQueue queue = new ArrayQueue(100);

        //queue.enqueue(jackMiller);
        //queue.enqueue(fabioQuartaaro);
        //queue.enqueue(marcMarques);
        //queue.enqueue(joanMir);
        //queue.enqueue(alexRins);
        //queue.dequeue(polEspargaro);


        queue.dequeue();

        queue.printQueue();

        System.out.println(queue.peekRear());
        System.out.println(queue.size());
    }
}

