import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.name + "пришел в очередь");
        takeInQueue(actor);
    }
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.name + "встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for(Actor actor : queue){
            if(!actor.isMakeOrder){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + "сделал свой заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for(Actor actor : queue){
            if(actor.isMakeOrder){
                actor.setTakeOrder(true);
                System.out.println(actor.name + "получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        ArrayList<Actor> realisedActor = new ArrayList<>();
        for(Actor actor : queue){
            if(actor.isTakeOrder){
                realisedActor.add(actor);
                System.out.println(actor.name + "вышел из очереди и готов уйти из магазина");
            }
        }
        releaseFromMarket(realisedActor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor : actors) {
            System.out.println(actor.name + "вышел из магазина");
            queue.remove(actor);
            }
        }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}

