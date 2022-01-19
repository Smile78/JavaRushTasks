package netology.hw342valid;

//программу проверки коррекности прочитанных значений.
// Для этого подготовим список событий - такими событиями (event) могут быть фильмы/спектакли.
//
//Базовый класс event содержит поля:
// название (title),
// год выпуска (releaseYear),
// ограничение по возрасту (age).
//
//Если любое из полей прочитанного объекта равно null или 0 (для целочисленных полей),
// нужно выбсроить RuntimeException и завершить работу программы,
// если ошибок не возникло - вывести сообщение "Все события корректны".

public class Main {

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало0", 2010, 16),
                new Movie("", 2011, 0),
                new Movie("", 2012, 18),
                new Movie("Начало3", 2013, 0),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина0", 2017, 16),
                new Theatre(" ", 2018, 17),
                new Theatre("Анна Каренина2", 2019, 0),
                new Theatre("Анна Каренина3", 2020, 19),
        };
    }

    public static void validEvent(Event event) {
        if (event.title == null || event.releaseYear == 0 || event.age == 0) throw new RuntimeException();
    }

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
}
