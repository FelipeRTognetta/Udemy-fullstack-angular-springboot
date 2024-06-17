package github.FelipeRTognetta.rest.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {

    @NotEmpty(message = "{campo.descricao.obrigatorio}")
    private String descricao;

    @NotEmpty(message = "{campo.preco.obrigatorio}")
    private String valor;

    @NotEmpty(message = "{campo.data.obrigatorio}")
    private String data;

    @NotNull(message = "{campo.clienteId.obrigatorio}")
    private Integer idCliente;
}
