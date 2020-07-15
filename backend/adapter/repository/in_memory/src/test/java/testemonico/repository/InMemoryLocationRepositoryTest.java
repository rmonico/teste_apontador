package testemonico.repository;

import org.junit.Before;
import org.junit.Test;
import testemonico.domain.entity.Location;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class InMemoryLocationRepositoryTest {

    private InMemoryLocationRepository repository;

    @Before
    public void setup() {
        repository = new InMemoryLocationRepository();

        repository.database.put("1", Location.builder().id("1").name("Cantina do Zé").build());
        repository.database.put("2", Location.builder().id("2").name("Restaurante Dona Florinda").build());
        repository.database.put("3", Location.builder().id("3").name("Bar do Zé").build());
        repository.database.put("4", Location.builder().id("4").name("Siri Cascudo").build());
    }

    @Test
    public void should_find_location_of_in_memory_database_by_approximate_name() {
        List<Location> locations = repository.findByApproximateName("Zé");

        assertThat(locations.size(), is(2));

        assertThat(locations.get(0).getId(), is("1"));
        assertThat(locations.get(0).getName(), is("Cantina do Zé"));

        assertThat(locations.get(1).getId(), is("3"));
        assertThat(locations.get(1).getName(), is("Bar do Zé"));
    }

}