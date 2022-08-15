package org.example;

public class AfishaManager {

    private String[] movies = new String[0];
    private String movie;
    private int limit;
    public AfishaManager(){
        this.limit = 10;
    }
    public AfishaManager(int limit){
        this.limit = limit;
    }

    public void addMovies(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int result;
        if (limit < movies.length) {
            result = limit;
        } else {
            result = movies.length;
        }
        String[] tmp = new String[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

}