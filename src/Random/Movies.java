public class Movies
{
    private String name;
    private int year;
    private int lengthInMinutes;
    private String director;

    public Movies(String name, int year, int lengthInMinutes, String director)
    {
        this.name = name;
        this.year = year;
        this.lengthInMinutes = lengthInMinutes;
        this.director = director;
    }
    public String toString()
    {
        return name + " (" + year + "), "
                + lengthInMinutes + " minutes, Director: " + director;
    }
}


