import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    private Manager manager = new Manager();
    Poster first = new Poster(1, "Бладшот", "боевик", "Picture1", false);
    Poster second = new Poster(2, "Вперед", "мультфильм", "Picture2", false);
    Poster third = new Poster(3, "Отель Белград", "комедия", "Picture3", false);
    Poster fourth = new Poster(4, "Джентльмены", "боевик", "Picture4", false);
    Poster fifth = new Poster(5, "Человек-невидимка", "ужасы", "Picture5", false);
    Poster sixth = new Poster(6, "Тролли. Мировой тур", "мультфильм", "Picture6", true);
    Poster seventh = new Poster(7, "Номер один", "комедия", "Picture7", true);
    Poster eighth = new Poster(8, "Челюсти. Столкновение", "ужасы", "Picture8", true);
    Poster ninth = new Poster(9, "Вышка", "триллер", "Picture9", true);
    Poster tenth = new Poster(10, "Барбоскины Team", "мультфильм", "Picture10", true);
    Poster eleventh = new Poster(11, "Дом Дракона", "фэнтези", "Picture11", true);
    Poster twelfth = new Poster(12, "Зеленая миля", "драмма", "Picture12", false);

    @Test
    void shouldAdd() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Poster[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth};
        Poster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(first);
        manager.add(fifth);
        manager.add(sixth);

        Poster[] expected = {first, second, third, first, fifth, sixth};
        Poster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastOnePositionArray() {
        manager.add(first);

        Poster[] expected = {first};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldDefaultFindLast() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Poster[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldMoreThenDefaultFindLast() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Poster[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastWithUsersConstructor() {
        Manager manager = new Manager(4);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);

        Poster[] expected = {eighth, seventh, sixth, fifth};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastWithUsersConstructorMoreArray() {
        Manager manager = new Manager(4);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Poster[] expected = {third, second, first};
        Poster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}