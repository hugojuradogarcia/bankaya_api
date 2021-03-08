package co.pokeapi.api.pokedex.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@JsonIgnoreProperties( value = {"requestAt"}, allowGetters = true )
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_request", nullable = false)
    private int idRequest;

    @Column(name = "ip_adress", nullable = false)
    private String ipAdress;

    @Column(name = "method_executed", nullable = false)
    private String methodExecuted;

    @Column(name = "request_at", columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    public Request(String ipAdress, String methodExecuted) {
        this.ipAdress = ipAdress;
        this.methodExecuted = methodExecuted;
    }
}
