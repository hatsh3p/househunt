package househunt;

public final class Location {
    // final means no subclasses
    private final int zipcode;
    private final String neighborhood;
    private final int walkScore;
    private final int schoolScore;

    public Location(int zipcode, String neighborhood, int walkScore, int schoolScore) {
        this.zipcode = zipcode;
        this.neighborhood = neighborhood;
        this.walkScore = walkScore;
        this.schoolScore = schoolScore;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public int getWalkScore() {
        return walkScore;
    }

    public int getSchoolScore() {
        return schoolScore;
    }
    
}
