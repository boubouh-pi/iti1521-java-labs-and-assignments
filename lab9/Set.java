
public class Set {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    private Cashier[] set;

    public Set(int nbr) {
        if (nbr < 1) {
            throw new IllegalArgumentException(Integer.toString(nbr));
        }

        set = new Cashier[nbr];
        for (int i = 0; i < nbr; i++) {
            set[i] = new Cashier();
        }
    }

    public void add(Client client) {
        Cashier shortestQueue = set[0];
        for (Cashier cashier : set) {
            if (cashier.getQueueSize() < shortestQueue.getQueueSize()) {
                shortestQueue = cashier;
            }
        }
        shortestQueue.add(client);
    }

    public void servedClients(int currentTime) {
        for (Cashier cashier : set) {
            cashier.servedClients(currentTime);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < set.length; i++) {
            sb.append("LINE ").append(i).append(" :").append(LINE_SEPARATOR);
            sb.append(set[i]);
        }

        return sb.toString();
    }
}