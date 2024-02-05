package lesson3.hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Data
@RequiredArgsConstructor
@ToString
public class Client {
    private UUID id = UUID.randomUUID();
    private final String name;
    private final int age;
}
