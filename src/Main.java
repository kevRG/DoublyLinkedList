public class Main {
    public static void main(String[] args) {
        // Lista de libros
        DoublyLinkedList<SoccerPlayer> soccerPlayers = new DoublyLinkedList<>();
        soccerPlayers.insertLast(new SoccerPlayer("Cristiano Ronaldo", "Al-Nassr"));
        soccerPlayers.insertLast(new SoccerPlayer("Kylian Mbappé", "Real Madrid"));
        soccerPlayers.insertFirst(new SoccerPlayer("Jude Bellingham", "Real Madrid"));

        soccerPlayers.traverse();
        // Lo nuevo: podemos recorrerla al revés
        soccerPlayers.traverseBackward();

        System.out.println("Existe Cristiano Ronaldo: " + soccerPlayers.contains(new SoccerPlayer("Cristiano Ronaldo", "Al-Nassr")));
        soccerPlayers.remove(new SoccerPlayer("Kylian Mbappé", "Real Madrid"));

        soccerPlayers.traverse();
        soccerPlayers.traverseBackward();
    }
}