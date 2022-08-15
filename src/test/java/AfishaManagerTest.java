import org.example.AfishaManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AfishaManagerTest {
    @Test
    public void shouldFindLastWithLimit() {
        AfishaManager manager = new AfishaManager(5);
        manager.addMovies("Мстители 1");
        manager.addMovies("Мстители 2");
        manager.addMovies("Мстители 3");
        manager.addMovies("Мстители 4");
        manager.addMovies("Мстители 5");
        manager.addMovies("Мстители 6");
        manager.addMovies("Мстители 7");
        manager.addMovies("Мстители 8");
        manager.addMovies("Мстители 9");
        manager.addMovies("Мстители 10");
        manager.addMovies("Мстители 11");
        manager.addMovies("Мстители 12");
        manager.addMovies("Мстители 13");
        manager.addMovies("Мстители 14");
        manager.addMovies("Мстители 15");
        manager.addMovies("Мстители 16");

        String[] actual = manager.findLast();
        String[] expected = {"Мстители 16", "Мстители 15", "Мстители 14", "Мстители 13", "Мстители 12"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindAll(){
        AfishaManager manager = new AfishaManager();
        manager.addMovies("Мстители 1");
        manager.addMovies("Мстители 2");
        manager.addMovies("Мстители 3");
        manager.addMovies("Мстители 4");
        manager.addMovies("Мстители 5");

        String[] actual = manager.findAll();
        String[] expected = {"Мстители 1", "Мстители 2","Мстители 3", "Мстители 4", "Мстители 5"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindLastWithoutLimit(){
        AfishaManager manager = new AfishaManager();
        manager.addMovies("Мстители 1");
        manager.addMovies("Мстители 2");
        manager.addMovies("Мстители 3");
        manager.addMovies("Мстители 4");
        manager.addMovies("Мстители 5");
        manager.addMovies("Мстители 6");
        manager.addMovies("Мстители 7");
        manager.addMovies("Мстители 8");
        manager.addMovies("Мстители 9");
        manager.addMovies("Мстители 10");
        manager.addMovies("Мстители 11");

        String[] expected = {"Мстители 11","Мстители 10", "Мстители 9", "Мстители 8", "Мстители 7", "Мстители 6","Мстители 5", "Мстители 4", "Мстители 3", "Мстители 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);

    }
    @Test

    public  void  shouldFindLastOverLimitCorrect (){
        AfishaManager manager = new AfishaManager(5);
        manager.addMovies("Мстители 1");
        manager.addMovies("Мстители 2");
        manager.addMovies("Мстители 3");
        manager.addMovies("Мстители 4");

        String[] expected = {"Мстители 4", "Мстители 3", "Мстители 2", "Мстители 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);

    }



}
