package lesson4.hw;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


import java.time.LocalDateTime;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@ToString
public class Employee {
    private UUID id = UUID.randomUUID();
    private final String firstName;
    private final String phoneNumber;
    private final LocalDateTime birthDate;
    private final LocalDateTime hireDate;

    public int getAge() {
        return LocalDateTime.now().getYear() - birthDate.getYear();
    }

    public int getSeniority(){
        return LocalDateTime.now().getYear() - hireDate.getYear();
    }
}