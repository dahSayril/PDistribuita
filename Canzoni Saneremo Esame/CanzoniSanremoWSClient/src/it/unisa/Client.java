package it.unisa;

public class Client {
    
    public static void main(String[] args) {
        
        int id = 3;
        int votes = 10000;
        System.out.println(updateVotes(id, votes));
        
    }

    public static it.unisa.CanzoneEntity updateVotes(int id, int votes) {
        it.unisa.CanzoneEJBService service = new it.unisa.CanzoneEJBService();
        it.unisa.CanzoneEJB port = service.getCanzoneEJBPort();
        return port.updateVotes(id, votes);
    }
    
}
