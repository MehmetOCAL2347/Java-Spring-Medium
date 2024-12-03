package medium.java.spring_boot.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users") // MongoDB'de tablo ismi collection olarak isimlendirilir
@Data // Getter + Setter
@Builder // Obje oluştururken kullanılır
@NoArgsConstructor // Değişkensiz constructor oluşturmak için
@AllArgsConstructor // Tüm değişkenleri kullanarak constructor oluşturmak için
@EqualsAndHashCode(of = "id")  // MongoDB'deki id değerini entity classındaki id değeri ile maplerken kullanılır
public class UserEntity {
    private long id;
    private String name;
    private String surname;
}
