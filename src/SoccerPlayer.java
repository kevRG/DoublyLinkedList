import java.util.Objects;

public class SoccerPlayer {
    private  final String name;
    private  final String team;
    
    public SoccerPlayer(String name, String team) {
        this.name = name;
        this.team = team;
    }

    @Override
    public String toString() {
        return name + " team: " + team;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoccerPlayer that = (SoccerPlayer) o;
        return Objects.equals(name, that.name) && Objects.equals(team, that.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, team);
    }
}
