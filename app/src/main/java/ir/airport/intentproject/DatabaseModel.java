package ir.airport.intentproject;

class DatabaseModel {
    int id;
    private String Title;
    private String Year;
    private String Rated;
    private String Released;
    private String Runtime;
    private String Genre;
    private String Director;
    private String Actors;
    private String Plot;

    public DatabaseModel(int id, String title, String year, String rated, String released, String runtime, String genre, String director, String actors, String plot) {
        this.id=id;
        this.Title=title;
        this.Year=year;
        this.Rated=rated;
        this.Released=released;
        this.Runtime=runtime;
        this.Genre=genre;
        this.Director=director;
        this.Actors=actors;
        this.Plot=plot;



    }


    public String gettitle() {
        return Title;
    }

    public void settitle(String title) {
        this.Title = title;
    }

    public String getyear() {
        return Year;
    }

    public void setyear(String year) {
        this.Year = year;
    }

    public String getrated() {
        return Rated;
    }

    public void setrated(String rated) {
        this.Rated = rated;
    }

    public String getrelease() {
        return Released;
    }
    public void setreleas(String releas) {
        this.Released = releas;
    }

    public String getrun() {
        return Runtime;
    }

    public void setrun(String runtime) {
        this.Runtime = runtime;
    }
    public String getgenre() {
        return Genre;
    }

    public void setgenre(String genre) {
        this.Genre = genre;
    }
    public String getdirec() {
        return Director;
    }

    public void setdirec(String direc) {
        this.Director = direc;
    }
    public String getactor() {
        return Actors;
    }

    public void setactor(String actor) {
        this.Actors = actor;
    }
    public String getplot() {
        return Plot;
    }

    public void setplot(String plot) {
        this.Plot = plot;
    }
}
