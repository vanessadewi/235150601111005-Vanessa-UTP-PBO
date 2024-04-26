public class Cinema {
    private String name;
    private User[] listUsers;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema(String name, int studioCapacity){
        this.name = name;
        this.studioCapacity = studioCapacity;
    }

    private void init() {
    }
    public boolean registerUser(User user) {
    }
    public User authenticateUser(String email, String password) {
    }
    public void displayListStudio() {
    }
    public void displayStudioDetail(int studioNumber) {
    }
    public boolean assStudioWithMovies(String studioType, String movieTitle, double movieRating, String movieGenres[]) {
    }
    public boolean bookTicket(User user, int studioNumber, char row, int col){
    }
    public String getName(){
        return name;
    }
}