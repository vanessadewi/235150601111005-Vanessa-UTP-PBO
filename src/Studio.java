public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type){
        this.type = type;
    }
    public String getStudioInfo(){
        return type;
    }
    public int isBooked(char row, int col){
        this.row = row;
        this.col = col;
    }
    public boolean reserve(char row, int col){
        this.row = row;
        this.col = col;
    }
    public String getType(){
        return type;
    }
    public Movie getMovie(){
        return movie;
    }
    public void setMovie(Movie movie){
        this.movie = movie;
    }
    public void setSeats(){
        this.seats = seats;
    }

}
